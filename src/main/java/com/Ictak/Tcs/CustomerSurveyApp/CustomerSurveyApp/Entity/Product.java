package com.Ictak.Tcs.CustomerSurveyApp.CustomerSurveyApp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="pname")
	private String pname;
	@Column(name="pquantity")
	private int pquantity;
	@Column(name="pprice")
	private int pprice;
	@Column(name="review")
	private String review;
	
	public int getId() {
		return id;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", pquantity="
				+ pquantity + ", pprice=" + pprice + ", review=" + review + "]";
	}
	
	
}
