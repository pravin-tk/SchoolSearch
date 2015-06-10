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
 * AttendanceInfo generated by hbm2java
 */
@Entity
@Table(name = "attendance_info", catalog = "school_db")
public class AttendanceInfo implements java.io.Serializable {

	private Integer id;
	private TimeTable timeTable;
	private School school;
	private ClassInfo classInfo;
	private ClassSection classSection;
	private Date attendanceDate;
	private String description;
	private Date lastUpdatedOn;
	private Integer lastUpdatedBy;
	private Set<StudentAttendance> studentAttendances = new HashSet<StudentAttendance>(0);
	private Set<TeacherAttendance> teacherAttendances = new HashSet<TeacherAttendance>(0);

	public AttendanceInfo() {
	}

	public AttendanceInfo(TimeTable timeTable, School school,
			ClassInfo classInfo, ClassSection classSection,
			Date attendanceDate, String description, Date lastUpdatedOn,
			Integer lastUpdatedBy, Set<StudentAttendance> studentAttendances,
			Set<TeacherAttendance> teacherAttendances) {
		this.timeTable = timeTable;
		this.school = school;
		this.classInfo = classInfo;
		this.classSection = classSection;
		this.attendanceDate = attendanceDate;
		this.description = description;
		this.lastUpdatedOn = lastUpdatedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.studentAttendances = studentAttendances;
		this.teacherAttendances = teacherAttendances;
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
	@JoinColumn(name = "time_table_id")
	public TimeTable getTimeTable() {
		return this.timeTable;
	}

	public void setTimeTable(TimeTable timeTable) {
		this.timeTable = timeTable;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "school_id")
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	public ClassInfo getClassInfo() {
		return this.classInfo;
	}

	public void setClassInfo(ClassInfo classInfo) {
		this.classInfo = classInfo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "section_id")
	public ClassSection getClassSection() {
		return this.classSection;
	}

	public void setClassSection(ClassSection classSection) {
		this.classSection = classSection;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "attendance_date", length = 10)
	public Date getAttendanceDate() {
		return this.attendanceDate;
	}

	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "attendanceInfo")
	public Set getStudentAttendances() {
		return this.studentAttendances;
	}

	public void setStudentAttendances(Set<StudentAttendance> studentAttendances) {
		this.studentAttendances = studentAttendances;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "attendanceInfo")
	public Set getTeacherAttendances() {
		return this.teacherAttendances;
	}

	public void setTeacherAttendances(Set<TeacherAttendance> teacherAttendances) {
		this.teacherAttendances = teacherAttendances;
	}

}