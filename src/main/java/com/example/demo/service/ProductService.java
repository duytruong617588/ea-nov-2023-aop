package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements  ServiceInterface<Product> {
	private final ProductRepository productRepository;
	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public Product createOne(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Optional<Product> updateOne(String id, Product product) {
		Product item = productRepository.findById(id).orElse(null);
		if(item == null) {
			return Optional.empty();
		}
		item.setName(product.getName());
		productRepository.save(item);
		return Optional.of(item);
	}

	@Override
	public Optional<Product> deleteOne(String id) {
		Product item = productRepository.findById(id).orElse(null);
		if(item == null) {
			return Optional.empty();
		}
		productRepository.delete(item);
		return Optional.of(item);
	}
}
