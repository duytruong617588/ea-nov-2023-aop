package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.entity.Review;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReviewService implements  ServiceInterface<Review> {
	private final ReviewRepository reviewRepository;
	private final ProductRepository productRepository;
	@Override
	public List<Review> getAll() {
		return reviewRepository.findAll();
	}

	public Review createOne(Review review) {
		return reviewRepository.save(review);
	}

	@Override
	public Optional<Review> updateOne(String id, Review review) {
		Review item = reviewRepository.findById(id).orElse(null);
		if(item == null) {
			return Optional.empty();
		}
		item.setComment(review.getComment());
		reviewRepository.save(item);
		return Optional.of(item);
	}

	@Override
	public Optional<Review> deleteOne(String id) {
		Review item = reviewRepository.findById(id).orElse(null);
		if(item == null) {
			return Optional.empty();
		}
		reviewRepository.delete(item);
		return Optional.of(item);
	}

	public Optional<Review> createOne(String productId, Review review) {
		Product product = productRepository.findById(productId).orElse(null);
		if(product == null) {
			return Optional.empty();
		}
		review.setProduct(product);
		reviewRepository.save(review);
		return Optional.of(reviewRepository.save(review));
	}
}
