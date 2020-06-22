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
import java.util.Set;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Course")
public class Course implements Serializable {
	public Course() {
	}
	
	@Column(name="ID", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="COURSE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COURSE_ID_GENERATOR", strategy="native")	
	private Long ID;
	
	@Column(name="Title", nullable=true, length=255)	
	private String Title;
	
	@Column(name="Duration", nullable=true, length=10)	
	private Integer Duration;
	
	@Column(name="Description", nullable=true, length=255)	
	private String Description;
	
	@Column(name="MaxEnrollment", nullable=true, length=10)	
	private Integer MaxEnrollment;
	
	@Column(name="MinEnrollment", nullable=true, length=10)	
	private Integer MinEnrollment;
	
	@Column(name="UnitPrice", nullable=true, length=10)	
	private Float UnitPrice;
	
	@OneToMany(mappedBy="course", targetEntity=Clazz.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private List<Clazz> clazzes = new ArrayList<>();
	
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
	
	public void setTitle(String value) {
		this.Title = value;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public void setDuration(int value) {
		setDuration(new Integer(value));
	}
	
	public void setDuration(Integer value) {
		this.Duration = value;
	}
	
	public Integer getDuration() {
		return Duration;
	}
	
	public void setDescription(String value) {
		this.Description = value;
	}
	
	public String getDescription() {
		return Description;
	}
	
	public void setMaxEnrollment(int value) {
		setMaxEnrollment(new Integer(value));
	}
	
	public void setMaxEnrollment(Integer value) {
		this.MaxEnrollment = value;
	}
	
	public Integer getMaxEnrollment() {
		return MaxEnrollment;
	}
	
	public void setMinEnrollment(int value) {
		setMinEnrollment(new Integer(value));
	}
	
	public void setMinEnrollment(Integer value) {
		this.MinEnrollment = value;
	}
	
	public Integer getMinEnrollment() {
		return MinEnrollment;
	}
	
	public void setUnitPrice(float value) {
		setUnitPrice(new Float(value));
	}
	
	public void setUnitPrice(Float value) {
		this.UnitPrice = value;
	}
	
	public Float getUnitPrice() {
		return UnitPrice;
	}

	public List<Clazz> getClazzes() {
		return clazzes;
	}

	public void setClazzes(List<Clazz> clazzes) {
		this.clazzes = clazzes;
	}

	public String toString() {
		return String.valueOf(getID());
	}
	
}
