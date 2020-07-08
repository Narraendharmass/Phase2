package com.feedback.service;
import com.feedback.model.Feedback;
import java.util.List;

public interface FeedbackService {

	public Feedback createFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public Feedback getFeedbackById(int id);
	public List<Feedback> getAllFeedback();
	public List<Feedback> getFeedbackByCategory(String category);
	public List<Feedback> getFeedbackByRating(int rating);
	public void deleteFeedbackById(int id);
}
