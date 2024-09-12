package com.map.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	private Integer ansID;

	private String answer;
	
	@OneToOne(mappedBy = "answer")
	private Question question;

	public Integer getAnsID() {
		return ansID;
	}

	public void setAnsID(Integer ansID) {
		this.ansID = ansID;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answer(Integer ansID, String answer) {
		super();
		this.ansID = ansID;
		this.answer = answer;
	}

	public Answer() {
		super();
	}

}
