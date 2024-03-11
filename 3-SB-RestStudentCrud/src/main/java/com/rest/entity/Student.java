package com.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stud_tab")
public class Student {
	@Id
	private int id;
	private String name;
	private String course;
	private double fee;
	private int sub1;
	private int sub2;
	private int sub3;
	private double total;
	private double percentage;
	private String grade;
	private String result;
	public Student(int id, String name, String course, double fee, int sub1, int sub2, int sub3, double total,
			double percentage, String grade, String result) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.fee = fee;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.total = total;
		this.percentage = percentage;
		this.grade = grade;
		this.result = result;
	}
	public Student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + ", sub1=" + sub1
				+ ", sub2=" + sub2 + ", sub3=" + sub3 + ", total=" + total + ", percentage=" + percentage + ", grade="
				+ grade + ", result=" + result + "]";
	}



	

}
