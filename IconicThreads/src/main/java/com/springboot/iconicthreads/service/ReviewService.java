package com.springboot.iconicthreads.service;

import java.util.List;

import com.springboot.iconicthreads.model.Review;

public interface ReviewService {
	
	public Review addProductReview(Review review);
	
	public Review getProductReview(String reviewId);
	
	public List<Review> getReviewsForProduct(String productId);
	
	public double getAverageRatingForTheProduct(String productId);
	
	public Review updateReview(Review review);
	
	public void deleteReview(String reviewId);

}
