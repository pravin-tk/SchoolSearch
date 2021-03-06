package com.school.model;

// Generated 2 Jun, 2015 3:00:10 PM by Hibernate Tools 3.4.0.CR1

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

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * UserRegistrationInfo generated by hbm2java
 */
@Entity
@Table(name = "user_registration_info", catalog = "school_db")
public class UserRegistrationInfo implements java.io.Serializable {

	private Integer id;
	private String firstName;
	private String lastName;
	private String mobile;
	private String password;
	private String email;
	private Byte status;
	private String memberOtp;
	private Boolean gender;
	private Date dateOfBirth;
	private String image;
	private String bloodGroup;
	private String tempAddr;
	private String permAddr;
	private String landlineNo;
	private Date lastLoggedOn;
	private Integer lastUpdatedBy;
	private Date lastUpdatedOn;
	private Set<Task> tasksForAssignedBy = new HashSet<Task>(0);
	private Set<Task> tasksForToUserId = new HashSet<Task>(0);
	private Set<ParentInfo> parentInfos = new HashSet<ParentInfo>(0);
	private Set<UserRole> userRoles = new HashSet<UserRole>(0);
	private Set<StudentPersonalInfo> studentPersonalInfos = new HashSet<StudentPersonalInfo>(0);
	private Set<TeacherStaffInfo> teacherStaffInfos = new HashSet<TeacherStaffInfo>(0);

	public UserRegistrationInfo() {
	}

	public UserRegistrationInfo(String firstName, String lastName,
			String mobile, String password, String email, Byte status,
			String memberOtp, Boolean gender, Date dateOfBirth, String image,
			String bloodGroup, String tempAddr, String permAddr,
			String landlineNo, Date lastLoggedOn, Integer lastUpdatedBy,
			Date lastUpdatedOn, Set tasksForAssignedBy, Set tasksForToUserId,
			Set parentInfos, Set userRoles, Set studentPersonalInfos,
			Set teacherStaffInfos) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.password = password;
		this.email = email;
		this.status = status;
		this.memberOtp = memberOtp;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.image = image;
		this.bloodGroup = bloodGroup;
		this.tempAddr = tempAddr;
		this.permAddr = permAddr;
		this.landlineNo = landlineNo;
		this.lastLoggedOn = lastLoggedOn;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedOn = lastUpdatedOn;
		this.tasksForAssignedBy = tasksForAssignedBy;
		this.tasksForToUserId = tasksForToUserId;
		this.parentInfos = parentInfos;
		this.userRoles = userRoles;
		this.studentPersonalInfos = studentPersonalInfos;
		this.teacherStaffInfos = teacherStaffInfos;
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

	@Column(name = "first_name", length = 200)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 200)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "mobile", length = 20)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "password", length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "status")
	public Byte getStatus() {
		return this.status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	@Column(name = "member_otp", length = 6)
	public String getMemberOtp() {
		return this.memberOtp;
	}

	public void setMemberOtp(String memberOtp) {
		this.memberOtp = memberOtp;
	}

	@Column(name = "gender")
	public Boolean getGender() {
		return this.gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth", length = 10)
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "image", length = 200)
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "blood_group", length = 10)
	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Column(name = "temp_addr", length = 200)
	public String getTempAddr() {
		return this.tempAddr;
	}

	public void setTempAddr(String tempAddr) {
		this.tempAddr = tempAddr;
	}

	@Column(name = "perm_addr", length = 200)
	public String getPermAddr() {
		return this.permAddr;
	}

	public void setPermAddr(String permAddr) {
		this.permAddr = permAddr;
	}

	@Column(name = "landline_no", length = 20)
	public String getLandlineNo() {
		return this.landlineNo;
	}

	public void setLandlineNo(String landlineNo) {
		this.landlineNo = landlineNo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_logged_on", length = 10)
	public Date getLastLoggedOn() {
		return this.lastLoggedOn;
	}

	public void setLastLoggedOn(Date lastLoggedOn) {
		this.lastLoggedOn = lastLoggedOn;
	}

	@Column(name = "last_updated_by")
	public Integer getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "last_updated_on", length = 10)
	public Date getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRegistrationInfoByAssignedBy")
	@JsonManagedReference
	public Set<Task> getTasksForAssignedBy() {
		return this.tasksForAssignedBy;
	}

	public void setTasksForAssignedBy(Set<Task> tasksForAssignedBy) {
		this.tasksForAssignedBy = tasksForAssignedBy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRegistrationInfoByToUserId")
	@JsonManagedReference
	public Set<Task> getTasksForToUserId() {
		return this.tasksForToUserId;
	}

	public void setTasksForToUserId(Set<Task> tasksForToUserId) {
		this.tasksForToUserId = tasksForToUserId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRegistrationInfo")
	@JsonManagedReference
	public Set<ParentInfo> getParentInfos() {
		return this.parentInfos;
	}

	public void setParentInfos(Set<ParentInfo> parentInfos) {
		this.parentInfos = parentInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRegistrationInfo")
	@JsonManagedReference
	public Set<UserRole> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRegistrationInfo")
	@JsonManagedReference
	public Set<StudentPersonalInfo> getStudentPersonalInfos() {
		return this.studentPersonalInfos;
	}

	public void setStudentPersonalInfos(Set<StudentPersonalInfo> studentPersonalInfos) {
		this.studentPersonalInfos = studentPersonalInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRegistrationInfo")
	@JsonManagedReference
	public Set<TeacherStaffInfo> getTeacherStaffInfos() {
		return this.teacherStaffInfos;
	}

	public void setTeacherStaffInfos(Set<TeacherStaffInfo> teacherStaffInfos) {
		this.teacherStaffInfos = teacherStaffInfos;
	}

}
