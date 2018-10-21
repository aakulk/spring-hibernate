package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DPT_TBL")
public class Department implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8672177246010918424L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department")
	@SequenceGenerator(name="department", sequenceName = "dept_seq", allocationSize=1)
	private int id;
	@Column(name="dept_name")
	private String name;

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
}
