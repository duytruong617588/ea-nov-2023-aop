package com.example.demo.service;

import java.util.List;
import java.util.Optional;

public interface ServiceInterface<T> {
	List<T> getAll();
	default T createOne(T t) {
		return null;
	};

	default Optional<T> updateOne(String id, T t) {
		return Optional.empty();
	}

	Optional<T> deleteOne(String id);

}
