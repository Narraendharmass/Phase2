package com.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;

@RestController
public class FeedbackController  {
  @Autowired
	private FeedbackService service;

@PostMapping("/feedback")
public Feedback createFeedback(@RequestBody Feedback feedback) {
	// TODO Auto-generated method stub
	return service.createFeedback(feedback);
}

@PutMapping("/feedback")
public Feedback updateFeedback(@RequestBody Feedback feedback) {
	// TODO Auto-generated method stub
	return service.updateFeedback(feedback);
}

@GetMapping("/feedback/{id}")
public Feedback getFeedbackById(@PathVariable("id")int id) {
	// TODO Auto-generated method stub
	return service.getFeedbackById(id);
}

@GetMapping("/feedback")
public List<Feedback> getAllFeedback() {
	// TODO Auto-generated method stub
	return service.getAllFeedback();
}

@GetMapping("/feedback/{category}")
public List<Feedback> getFeedbackByCategory(@PathVariable("category") String category) {
	// TODO Auto-generated method stub
	return service.getFeedbackByCategory(category);
}

@GetMapping("/feedback/{rating}")
public List<Feedback> getFeedbackByRating(@PathVariable("rating") int rating) {
	// TODO Auto-generated method stub
	return service.getFeedbackByRating(rating);
}

@DeleteMapping("/feedback/{id}")
public void deleteFeedbackById(@PathVariable("id") int id) {
	service.deleteFeedbackById(id);
	
}	
}
