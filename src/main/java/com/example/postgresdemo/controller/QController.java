package com.example.postgresdemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.exception.ResourceNotFoundException;
import com.example.postgresdemo.model.Question;
import com.example.postgresdemo.service.IQuestionService;

@RestController
public class QController {
	
	@Autowired
	private IQuestionService iQuestionService;
	
	@GetMapping("/my/questions")
    public List<Question> getQuestions() throws ResourceNotFoundException {
		return iQuestionService.fetchQuestionslist();
    }
	
	@PostMapping("/my/question/save")
    public Question createQuestion(@RequestHeader(name = "X-Trace-Id") String transid ,@RequestBody Question question) {
		return iQuestionService.saveQuestion(question);
    }

}
