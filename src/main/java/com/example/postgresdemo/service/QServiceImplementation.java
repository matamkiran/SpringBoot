package com.example.postgresdemo.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.postgresdemo.model.Question;
import com.example.postgresdemo.repository.IQuestionDao;

@Service
public class QServiceImplementation implements IQuestionService{
	
@Autowired	
private SessionFactory session;

@Autowired
private IQuestionDao iQuestionDao;
	@Override
	@Transactional
	public List<Question> fetchQuestionslist() {
		return iQuestionDao.fetchQuestionsDao(session);
	}

}
