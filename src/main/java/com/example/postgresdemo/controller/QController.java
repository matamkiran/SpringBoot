package com.example.postgresdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Question;
import com.example.postgresdemo.service.IQuestionService;

@RestController
public class QController {
	
	@Autowired
	private IQuestionService iQuestionService;
	
	@GetMapping("/my/questions")
    public List<Question> getQuestions() {
		return iQuestionService.fetchQuestionslist();
    }
	

}
