package com.springboot.iconicthreads.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.iconicthreads.exception.NotFoundException;
import com.springboot.iconicthreads.model.Review;
import com.springboot.iconicthreads.repo.ReviewRepo;
import com.springboot.iconicthreads.service.ReviewService;

public class ReviewServiceClass implements ReviewService{
	
	@Autowired
	private ReviewRepo reviewRepo;

	@Override
	public Review addProductReview(Review review) {

		return reviewRepo.save(review);
	}

	@Override
	public Review getProductReview(String reviewId) {

		Optional<Review> optionalReview = reviewRepo.findById(reviewId);
		if(optionalReview.isPresent()) {
			return optionalReview.get();
		}
		else {
			throw new NotFoundException("Review is not found for: " +reviewId);
		}
	}

	@Override
	public List<Review> getReviewsForProduct(String productId) {
		
		return reviewRepo.findAllReviewsForProduct(productId);
	}

	@Override
	public double getAverageRatingForTheProduct(String productId) {

		List<Review> listOfReviews = reviewRepo.findAllReviewsForProduct(productId);
		
		double totalRating = 0.0;
		for(Review review: listOfReviews) {
			totalRating += review.getRating();
		}
		if(listOfReviews.size() > 0) {
			return totalRating/listOfReviews.size();
		}
		else {
			return 0;
		}
	}

	@Override
	public Review updateReview(Review review) {
		
		Optional<Review> optionalReview = reviewRepo.findById(review.getReviewId());
		if(optionalReview.isPresent()) {
			Review existingReview = optionalReview.get();
			existingReview.setRating(review.getRating());
			existingReview.setTitle(review.getTitle());
			existingReview.setReviewDescription(review.getReviewDescription());
			return reviewRepo.save(existingReview);
		}
		else {
			throw new NotFoundException("Review not found for: " +review.getReviewId());
		}
	}

	@Override
	public void deleteReview(String reviewId) {
		
		if(reviewRepo.existsById(reviewId)) {
			reviewRepo.deleteById(reviewId);
		}
		else {
			throw new NotFoundException("Review not found for: " +reviewId);
		}
	}
	

}
