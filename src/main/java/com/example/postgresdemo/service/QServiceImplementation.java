package com.example.postgresdemo.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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
@Autowired
HttpServletRequest request;

private String TRACE_HEADER = "X-Trace-Id";
	@Override
	@Transactional(readOnly=true)
	public List<Question> fetchQuestionslist() {
		System.out.println("your header name is sent :"+request.getHeader(TRACE_HEADER));

		if(request.getAttribute(TRACE_HEADER)!=null ) {
			System.err.println("your transaction id in service layer is :"+request.getAttribute(TRACE_HEADER));
		}
		
		
		return iQuestionDao.fetchQuestionsDao(session);
	}
	@Override
	@Transactional
	public Question saveQuestion(@Valid Question question) {
		// TODO Auto-generated method stub
		return iQuestionDao.saveQuestionsDao(question,session);
	}

}
