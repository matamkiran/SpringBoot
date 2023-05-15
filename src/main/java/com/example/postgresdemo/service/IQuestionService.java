package com.example.postgresdemo.service;

import java.util.List;

import javax.validation.Valid;

import com.example.postgresdemo.model.Question;

public interface IQuestionService {
	
	List<Question> fetchQuestionslist();

	Question saveQuestion(@Valid Question question);

}
