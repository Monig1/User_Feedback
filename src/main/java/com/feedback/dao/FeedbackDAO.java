package com.feedback.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feedback.model.Feedback;

@Repository
public interface FeedbackDAO extends JpaRepository<Feedback, Integer>{

	public List<Feedback> findByTrainer(String trainer);
	public List<Feedback> findByOrganization(String organization);
	public List<Feedback> findByRate(int rate);
}
