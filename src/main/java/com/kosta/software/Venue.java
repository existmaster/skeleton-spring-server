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
@Table(name="Venue")
public class Venue implements Serializable {
	public Venue() {
	}
	
	@Column(name="ID", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="VENUE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="VENUE_ID_GENERATOR", strategy="native")	
	private Long ID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String Name;
	
	@Column(name="Address", nullable=true, length=255)	
	private String Address;
	
	@Column(name="Capacity", nullable=true, length=10)	
	private Integer Capacity;
	
	@Column(name="Map", nullable=true, length=255)	
	private String Map;
	
	@OneToMany(mappedBy="venue", targetEntity=ClassDay.class)	
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
	
	public void setName(String value) {
		this.Name = value;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setAddress(String value) {
		this.Address = value;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setCapacity(int value) {
		setCapacity(new Integer(value));
	}
	
	public void setCapacity(Integer value) {
		this.Capacity = value;
	}
	
	public Integer getCapacity() {
		return Capacity;
	}
	
	public void setMap(String value) {
		this.Map = value;
	}
	
	public String getMap() {
		return Map;
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
