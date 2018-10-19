package org.elsys.netprog.rest;

import java.util.ArrayList;
import java.util.List;

public class Question {

	public String question;
		
	public List<Answer> answers = new ArrayList<Answer>();
	
	public static Question create(String question){
		Question q = new Question();
		q.answers = new ArrayList<Answer>();
		q.question = question;
		return q;
	}
	
	public Question addAnswer(String answer){
		Answer a = new Answer();
		a.answer = answer;
		a.correct = false;
		answers.add(a);
		
		return this;
	}
	
	public Question addCorrectAnswer(String answer){
		Answer a = new Answer();
		a.answer = answer;
		a.correct = true;
		answers.add(a);
		
		return this;
	}

}
