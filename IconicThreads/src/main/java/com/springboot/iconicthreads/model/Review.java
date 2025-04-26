package com.springboot.iconicthreads.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reviews")
public class Review {
	
	@Id
	private String reviewId;
	
	private String customerId;
	private String productId;
	private int rating;
	private String title;
	private String reviewDescription;
	private Date dateReviewed;
	private boolean isVerified;
	
	
	public String getReviewId() {
		return reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReviewDescription() {
		return reviewDescription;
	}
	public void setReviewDescription(String reviewDescription) {
		this.reviewDescription = reviewDescription;
	}
	public Date getDateReviewed() {
		return dateReviewed;
	}
	public void setDateReviewed(Date dateReviewed) {
		this.dateReviewed = dateReviewed;
	}
	public boolean isVerified() {
		return isVerified;
	}
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}
	public Review(String reviewId, String customerId, String productId, int rating, String title, String reviewDescription,
			Date dateReviewed, boolean isVerified) {
		this.reviewId = reviewId;
		this.customerId = customerId;
		this.productId = productId;
		this.rating = rating;
		this.title = title;
		this.reviewDescription = reviewDescription;
		this.dateReviewed = dateReviewed;
		this.isVerified = isVerified;
	}
	@Override
	public String toString() {
		return "Review [id=" + reviewId + ", customerId=" + customerId + ", productId=" + productId + ", rating=" + rating
				+ ", title=" + title + ", description=" + reviewDescription + ", dateReviewed=" + dateReviewed
				+ ", isVerified=" + isVerified + "]";
	}
	
	
	

}
