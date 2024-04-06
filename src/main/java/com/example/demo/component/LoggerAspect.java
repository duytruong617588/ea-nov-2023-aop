package com.example.demo.component;

import com.example.demo.entity.ActivityLog;
import com.example.demo.repository.ActivityLogRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Aspect
@Component
@RequiredArgsConstructor
public class LoggerAspect {
	private final ActivityLogRepository activityLogRepository;
	private final HttpServletRequest request;

	@Before("execution(* com.example.demo.service.*.*(..))")
	public void checkApiWithHeader() throws Exception {
		String content = "AOP-IS-AWESOME";
		if (request.getMethod().equals("POST") && !request.getHeader("header").equals(content)) {
			throw new Exception("Header is invalid!");
		}
	}

	@Around("@annotation(com.example.demo.annotation.ExecuteTime)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		Object proceed = joinPoint.proceed();
		ActivityLog activityLog = new ActivityLog();
		activityLog.setDate(LocalDate.now());
		activityLog.setOperation(joinPoint.getSignature().getName());
		activityLog.setDuration(System.currentTimeMillis() - start);

		activityLogRepository.save(activityLog);
		return proceed;
	}
}
