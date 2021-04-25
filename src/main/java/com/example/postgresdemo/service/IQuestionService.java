package com.example.postgresdemo.service;

import java.util.List;

import com.example.postgresdemo.model.Question;

public interface IQuestionService {
	
	List<Question> fetchQuestionslist();

}
