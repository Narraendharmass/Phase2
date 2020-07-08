package com.feedback.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;

@Repository
public interface FeedbackDAO extends JpaRepository<Feedback,Integer> {

	public List<Feedback> findByRating(int rating);
	public List<Feedback> findByCategory(String category);
	
}
