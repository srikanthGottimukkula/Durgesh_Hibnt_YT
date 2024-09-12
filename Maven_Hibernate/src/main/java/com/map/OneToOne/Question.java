package com.map.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	private Integer qID;

	private String question;

	@OneToOne
	@JoinColumn(name="answer_id")
	private Answer answer;

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Integer getqID() {
		return qID;
	}

	public void setqID(Integer qID) {
		this.qID = qID;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Question(Integer qID, String question) {
		super();
		this.qID = qID;
		this.question = question;
	}

	public Question() {
		super();
	}

}
