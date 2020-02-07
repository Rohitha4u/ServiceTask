package com.xworkz.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="valentine")

public class ValentineEntity {
	@Id
	@GenericGenerator(name="rohitha", strategy="increment")
	@GeneratedValue(generator="rohitha")
	@Column(name="V_VID")
	private int vid;
	@Column(name="V_NAME")
	private String name;
	@Column(name="V_STATUS")
	private String status;
	@Column(name="V_AMOUNTSPENT")
	private int amountspent;
	@Column(name="V_GIFT")
	private String gift;
	
	public ValentineEntity() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getAmountspent() {
		return amountspent;
	}

	public void setAmountspent(int amountspent) {
		this.amountspent = amountspent;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	@Override
	public String toString() {
		return "ValentineEntity [name=" + name + ", status=" + status + ", amountspent=" + amountspent + ", gift="
				+ gift + "]";
	}

}
