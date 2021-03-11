package com.jbk.entity;
// Generated Mar 6, 2021 5:06:56 PM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Marks1 generated by hbm2java
 */
@Entity
@Table(name = "marks1", catalog = "test")
public class Marks1 implements java.io.Serializable {

	private Integer rollno;
	private String sub1;
	private int marks1;
	private String subj2;
	private int marks2;
	private float avg;

	public Marks1() {
	}

	public Marks1(String sub1, int marks1, String subj2, int marks2, float avg) {
		this.sub1 = sub1;
		this.marks1 = marks1;
		this.subj2 = subj2;
		this.marks2 = marks2;
		this.avg = avg;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "rollno", unique = true, nullable = false)
	public Integer getRollno() {
		return this.rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	@Column(name = "sub1", nullable = false, length = 45)
	public String getSub1() {
		return this.sub1;
	}

	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}

	@Column(name = "marks1", nullable = false)
	public int getMarks1() {
		return this.marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	@Column(name = "subj2", nullable = false, length = 45)
	public String getSubj2() {
		return this.subj2;
	}

	public void setSubj2(String subj2) {
		this.subj2 = subj2;
	}

	@Column(name = "marks2", nullable = false)
	public int getMarks2() {
		return this.marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	@Column(name = "avg", nullable = false, precision = 0, scale = 0)
	public float getAvg() {
		return this.avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

}