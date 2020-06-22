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
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="ClassDay")
public class ClassDay implements Serializable {
	public ClassDay() {
	}
	
	@Column(name="ID", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="CLASSDAY_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CLASSDAY_ID_GENERATOR", strategy="native")	
	private Long ID;
	
	@ManyToOne(targetEntity=Instructor.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="InstructorID", referencedColumnName="ID") }, foreignKey=@ForeignKey(name="FKClassDay630168"))	
	private Instructor instructor;
	
	@ManyToOne(targetEntity=Venue.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="VenueID", referencedColumnName="ID") }, foreignKey=@ForeignKey(name="FKClassDay751338"))	
	private Venue venue;
	
	@ManyToOne(targetEntity=Clazz.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="ClazzID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKClassDay234864"))	
	private Clazz clazz;
	
	@Column(name="Number", nullable=true, length=10)	
	private Integer Number;
	
	@Column(name="`Date`", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date Date;
	
	@Column(name="StartTime", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date StartTime;
	
	@Column(name="EndTime", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date EndTime;
	
	@Column(name="InstructorPay", nullable=true, length=10)	
	private Double InstructorPay;
	
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
	
	public void setNumber(int value) {
		setNumber(new Integer(value));
	}
	
	public void setNumber(Integer value) {
		this.Number = value;
	}
	
	public Integer getNumber() {
		return Number;
	}
	
	public void setDate(java.util.Date value) {
		this.Date = value;
	}
	
	public java.util.Date getDate() {
		return Date;
	}
	
	public void setStartTime(java.util.Date value) {
		this.StartTime = value;
	}
	
	public java.util.Date getStartTime() {
		return StartTime;
	}
	
	public void setEndTime(java.util.Date value) {
		this.EndTime = value;
	}
	
	public java.util.Date getEndTime() {
		return EndTime;
	}
	
	public void setInstructorPay(double value) {
		setInstructorPay(new Double(value));
	}
	
	public void setInstructorPay(Double value) {
		this.InstructorPay = value;
	}
	
	public Double getInstructorPay() {
		return InstructorPay;
	}
	
	public void setClazz(Clazz value) {
		this.clazz = value;
	}
	
	public Clazz getClazz() {
		return clazz;
	}
	
	public void setVenue(Venue value) {
		this.venue = value;
	}
	
	public Venue getVenue() {
		return venue;
	}
	
	public void setInstructor(Instructor value) {
		this.instructor = value;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
