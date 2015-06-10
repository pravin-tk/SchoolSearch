package com.school.model;

// Generated Jun 9, 2015 5:02:23 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ContactInfoExternal generated by hbm2java
 */
@Entity
@Table(name = "contact_info_external", catalog = "school_db")
public class ContactInfoExternal implements java.io.Serializable {

	private Integer id;
	private School school;
	private String name;
	private String email;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private String mobileNo;
	private Set classAccessorieses = new HashSet(0);

	public ContactInfoExternal() {
	}

	public ContactInfoExternal(School school, String name, String email,
			Date lastUpdatedOn, Integer lastUpdatedBy, String mobileNo,
			Set classAccessorieses) {
		this.school = school;
		this.name = name;
		this.email = email;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.mobileNo = mobileNo;
		this.classAccessorieses = classAccessorieses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "school_id")
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_updated_on", length = 19)
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@Column(name = "last_updated_by")
	public Integer getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Column(name = "mobile_no", length = 20)
	public String getMobileNo() {
		return this.mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contactInfoExternal")
	public Set getClassAccessorieses() {
		return this.classAccessorieses;
	}

	public void setClassAccessorieses(Set classAccessorieses) {
		this.classAccessorieses = classAccessorieses;
	}

}