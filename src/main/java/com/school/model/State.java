package com.school.model;

// Generated 2 Jun, 2015 2:50:11 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * State generated by hbm2java
 */
@Entity
@Table(name = "state", catalog = "school_db")
public class State implements java.io.Serializable {

	private Integer id;
	private Integer countryId;
	private Integer name;
	private Byte status;
	private Integer sortOrder;

	public State() {
	}

	public State(Integer countryId, Integer name, Byte status, Integer sortOrder) {
		this.countryId = countryId;
		this.name = name;
		this.status = status;
		this.sortOrder = sortOrder;
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

	@Column(name = "country_id")
	public Integer getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	@Column(name = "name")
	public Integer getName() {
		return this.name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Column(name = "sort_order")
	public Integer getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

}
