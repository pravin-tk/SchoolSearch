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
 * RatingCategoryType generated by hbm2java
 */
@Entity
@Table(name = "rating_category_type", catalog = "school_db")
public class RatingCategoryType implements java.io.Serializable {

	private Short id;
	private String categoryName;
	private Float weightage;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set userRatings = new HashSet(0);

	public RatingCategoryType() {
	}

	public RatingCategoryType(String categoryName, Float weightage,
			Date lastUpdatedOn, Integer lastUpdatedBy, Set userRatings) {
		this.categoryName = categoryName;
		this.weightage = weightage;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.userRatings = userRatings;
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

	@Column(name = "category_name", length = 200)
	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Column(name = "weightage", precision = 9, scale = 3)
	public Float getWeightage() {
		return this.weightage;
	}

	public void setWeightage(Float weightage) {
		this.weightage = weightage;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ratingCategoryType")
	public Set getUserRatings() {
		return this.userRatings;
	}

	public void setUserRatings(Set userRatings) {
		this.userRatings = userRatings;
	}

}
