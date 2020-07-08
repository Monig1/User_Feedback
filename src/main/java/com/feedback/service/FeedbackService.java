package com.feedback.service;

import java.util.List;

import com.feedback.exception.BusinessException;
import com.feedback.model.Feedback;

public interface FeedbackService {

	public Feedback createFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public Feedback getFeedbackById(int id) throws BusinessException;
	public List<Feedback> getAllFeedbacks();
	public List<Feedback> getAllFeedbacksByTrainer(String trainer);
	public List<Feedback> getAllFeedbacksByOrganization(String organization);
	public List<Feedback> getAllFeedbacksByRate(int rate);
	public void deleteFeedbackById(int id);
}
