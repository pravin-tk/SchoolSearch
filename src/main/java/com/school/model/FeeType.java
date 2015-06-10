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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FeeType generated by hbm2java
 */
@Entity
@Table(name = "fee_type", catalog = "school_db")
public class FeeType implements java.io.Serializable {

	private Short id;
	private String title;
	private String description;
	private Byte isDeleted;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set schoolFeeDetails = new HashSet(0);

	public FeeType() {
	}

	public FeeType(String title, String description, Byte isDeleted,
			Date lastUpdatedOn, Integer lastUpdatedBy, Set schoolFeeDetails) {
		this.title = title;
		this.description = description;
		this.isDeleted = isDeleted;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.schoolFeeDetails = schoolFeeDetails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	@Column(name = "title", length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "is_deleted")
	public Byte getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(Byte isDeleted) {
		this.isDeleted = isDeleted;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "feeType")
	public Set getSchoolFeeDetails() {
		return this.schoolFeeDetails;
	}

	public void setSchoolFeeDetails(Set schoolFeeDetails) {
		this.schoolFeeDetails = schoolFeeDetails;
	}

}