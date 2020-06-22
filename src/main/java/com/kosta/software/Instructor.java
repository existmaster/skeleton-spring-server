package com.kosta.software; /**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Teacher
 * License Type: Purchased
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Instructor")
public class Instructor implements Serializable {
	public Instructor() {
	}
	
	@Column(name="ID", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="INSTRUCTOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="INSTRUCTOR_ID_GENERATOR", strategy="native")	
	private Long ID;
	
	@Column(name="Fname", nullable=true, length=255)	
	private String Fname;
	
	@Column(name="Lname", nullable=true, length=255)	
	private String Lname;
	
	@Column(name="Email", nullable=true, length=255)	
	private String Email;
	
	@Column(name="Phone", nullable=true, length=255)	
	private String Phone;
	
	@Column(name="HighestEducation", nullable=true, length=255)	
	private String HighestEducation;
	
	@Column(name="BankAccount", nullable=true, length=255)	
	private String BankAccount;
	
	@OneToMany(mappedBy="instructor", targetEntity=ClassDay.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private List<ClassDay> classDaies = new ArrayList<>();
	
	private void setID(long value) {
		setID(new Long(value));
	}
	
	private void setID(Long value) {
		this.ID = value;
	}
	
	public Long getID() {
		return ID;
	}
	
	public Long getORMID() {
		return getID();
	}
	
	public void setFname(String value) {
		this.Fname = value;
	}
	
	public String getFname() {
		return Fname;
	}
	
	public void setLname(String value) {
		this.Lname = value;
	}
	
	public String getLname() {
		return Lname;
	}
	
	public void setEmail(String value) {
		this.Email = value;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setPhone(String value) {
		this.Phone = value;
	}
	
	public String getPhone() {
		return Phone;
	}
	
	public void setHighestEducation(String value) {
		this.HighestEducation = value;
	}
	
	public String getHighestEducation() {
		return HighestEducation;
	}
	
	public void setBankAccount(String value) {
		this.BankAccount = value;
	}
	
	public String getBankAccount() {
		return BankAccount;
	}

	public List<ClassDay> getClassDaies() {
		return classDaies;
	}

	public void setClassDaies(List<ClassDay> classDaies) {
		this.classDaies = classDaies;
	}

	public String toString() {
		return String.valueOf(getID());
	}
	
}
