package com.example.postgresdemo.repository;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.SessionFactory;

import com.example.postgresdemo.model.Question;

public interface IQuestionDao {
	
	List<Question> fetchQuestionsDao(SessionFactory session);

	Question saveQuestionsDao(@Valid Question question, SessionFactory session);

}
