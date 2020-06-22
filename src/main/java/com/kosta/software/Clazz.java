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
@Table(name="Clazz")
public class Clazz implements Serializable {
	public Clazz() {
	}
	
	@Column(name="ID", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="CLAZZ_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CLAZZ_ID_GENERATOR", strategy="native")	
	private Long ID;
	
	@ManyToOne(targetEntity=Course.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="CourseID", referencedColumnName="ID", nullable=false) }, foreignKey=@ForeignKey(name="FKClazz743645"))	
	private Course course;
	
	@Column(name="Status", nullable=true, length=255)	
	private String Status;
	
	@Column(name="EvaluationRate", nullable=true, length=10)	
	private Double EvaluationRate;
	
	@OneToMany(mappedBy="clazz", targetEntity=ClassDay.class)	
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
	
	public void setStatus(String value) {
		this.Status = value;
	}
	
	public String getStatus() {
		return Status;
	}
	
	public void setEvaluationRate(double value) {
		setEvaluationRate(new Double(value));
	}
	
	public void setEvaluationRate(Double value) {
		this.EvaluationRate = value;
	}
	
	public Double getEvaluationRate() {
		return EvaluationRate;
	}
	
	public void setCourse(Course value) {
		this.course = value;
	}
	
	public Course getCourse() {
		return course;
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
