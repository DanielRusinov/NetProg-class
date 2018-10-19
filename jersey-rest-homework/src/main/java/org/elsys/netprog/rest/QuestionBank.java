package org.elsys.netprog.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionBank {
	
	private List<Question> questions = new ArrayList<Question>();
	private Random random;
	
	public QuestionBank() {
		
		questions.add(Question.create("2+2=?").addAnswer("5").addAnswer("3").addCorrectAnswer("4"));
		questions.add(Question.create("1+2=?").addAnswer("5").addCorrectAnswer("3").addAnswer("4"));
		
	}

	public Question getRandomQuestion(){
		return questions.get(random.nextInt(questions.size()));
	}
	
}
