package com.example.demo.controller;

import com.example.demo.entity.Review;
import com.example.demo.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
@RequiredArgsConstructor
public class ReviewController {
	private final ReviewService reviewService;
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(reviewService.getAll());
	}

	@PostMapping("/product/{product_id}")
	public ResponseEntity<?> createOne(@RequestBody Review review, @PathVariable String product_id) {
		return ResponseEntity.ok(reviewService.createOne(product_id, review));
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateOne(@RequestBody Review review, @PathVariable String id) {
		return ResponseEntity.ok(reviewService.updateOne(id, review));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteOne(@RequestBody Review review, @PathVariable String id) {
		return ResponseEntity.ok(reviewService.deleteOne(id));
	}
}
