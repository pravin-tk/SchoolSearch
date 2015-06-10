package com.school.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TeacherEducationInfo generated by hbm2java
 */
@Entity
@Table(name = "teacher_education_info", catalog = "school_db")
public class TeacherEducationInfo implements java.io.Serializable {

	private Integer id;
	private TeacherStaffInfo teacherStaffInfo;
	private Short educationTypeId;
	private Date dateOfEducation;
	private String description;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;

	public TeacherEducationInfo() {
	}

	public TeacherEducationInfo(TeacherStaffInfo teacherStaffInfo,
			Short educationTypeId, Date dateOfEducation, String description,
			Date lastUpdatedOn, Integer lastUpdatedBy) {
		this.teacherStaffInfo = teacherStaffInfo;
		this.educationTypeId = educationTypeId;
		this.dateOfEducation = dateOfEducation;
		this.description = description;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
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
	@JoinColumn(name = "teacher_staff_id")
	public TeacherStaffInfo getTeacherStaffInfo() {
		return this.teacherStaffInfo;
	}

	public void setTeacherStaffInfo(TeacherStaffInfo teacherStaffInfo) {
		this.teacherStaffInfo = teacherStaffInfo;
	}

	@Column(name = "education_type_id")
	public Short getEducationTypeId() {
		return this.educationTypeId;
	}

	public void setEducationTypeId(Short educationTypeId) {
		this.educationTypeId = educationTypeId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_education", length = 10)
	public Date getDateOfEducation() {
		return this.dateOfEducation;
	}

	public void setDateOfEducation(Date dateOfEducation) {
		this.dateOfEducation = dateOfEducation;
	}

	@Column(name = "description", length = 16777215)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_updated_on", length = 10)
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

}