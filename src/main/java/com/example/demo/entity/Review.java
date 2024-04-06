package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Review extends BaseEntity{
	String comment;

	@ManyToOne
	@JoinColumn(name = "product_id")
	@JsonBackReference
	Product product;
}
