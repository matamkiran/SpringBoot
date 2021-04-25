package com.example.postgresdemo.repository;

import java.util.List;

import org.hibernate.SessionFactory;

import com.example.postgresdemo.model.Question;

public interface IQuestionDao {
	
	List<Question> fetchQuestionsDao(SessionFactory session);

}
