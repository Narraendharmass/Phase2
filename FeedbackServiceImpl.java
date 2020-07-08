package com.feedback.service.impl;
import com.feedback.dao.FeedbackDAO;
import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {
@Autowired
	private FeedbackDAO dao;
	@Override
	public Feedback createFeedback(Feedback feedback) {
		
		return dao.save(feedback);
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) {
		
		return dao.save(feedback);
	}

	@Override
	public Feedback getFeedbackById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public List<Feedback> getAllFeedback() {
		
		return dao.findAll();
	}

	@Override
	public List<Feedback> getFeedbackByCategory(String category) {
		// TODO Auto-generated method stub
		return dao.findByCategory(category);
	}

	@Override
	public List<Feedback> getFeedbackByRating(int rating) {
		
		// TODO Auto-generated method stub
		return dao.findByRating(rating);
	}

	@Override
	public void deleteFeedbackById(int id) {
		dao.deleteById(id);
		
	}

}
