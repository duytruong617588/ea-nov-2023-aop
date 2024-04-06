package com.example.demo.controller;

import com.example.demo.annotation.ExecuteTime;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
	private final ProductService productService;

	@ExecuteTime
	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(productService.getAll());
	}

	@PostMapping
	public ResponseEntity<?> createOne(@RequestBody Product product) {
		return ResponseEntity.ok(productService.createOne(product));
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateOne(@RequestBody Product product, @PathVariable String id) {
		return ResponseEntity.ok(productService.updateOne(id, product));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteOne(@RequestBody Product product, @PathVariable String id) {
		return ResponseEntity.ok(productService.deleteOne(id));
	}
}
