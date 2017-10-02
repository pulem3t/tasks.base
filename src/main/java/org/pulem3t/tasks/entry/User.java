package org.pulem3t.tasks.entry;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.json.JSONObject;
import org.pulem3t.tasks.enums.Role;

@Entity
@Table(name = "USERS")
public class User {
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "LASTNAME")
	private String lastName;
	
	@Column(name = "PATRONYM")
	private String patronym;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE")
	private String phone;
	
	@Column(name = "COMPANY")
	private String company;
	
	@Column(name = "ADMINROLE")
	private boolean adminRole;
	
	@Column(name = "USERROLE")
	private boolean userRole;
	
	@Column(name = "SUPPORTROLE")
	private boolean supportRole;
	
	@Column(name = "CREATEDATE")
	private long createDate;
	
	@Column(name = "LASTMODDATE")
	private long lastmodDate;
	
	public User(){
		this.id = "";
		this.firstName = "";
		this.lastName = "";
		this.patronym = "";
		this.adminRole = false;
		this.userRole = true;
		this.supportRole = false;
		this.createDate = System.currentTimeMillis();
		this.lastmodDate = System.currentTimeMillis();
	}
	
	@Override
	public String toString() {
		JSONObject o = new JSONObject();
		o.put("id", id);
		o.put("firstName", firstName);
		o.put("lastName", lastName);
		o.put("patronym", patronym);
		o.put("email", email);
		o.put("phone", phone);
		o.put("company", company);
		o.put("adminRole", adminRole);
		o.put("userRole", userRole);
		o.put("supportRole", supportRole);
		o.put("createDate", createDate);
		o.put("lastmodDate", lastmodDate);
		return o.toString();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPatronym() {
		return patronym;
	}
	
	public void setPatronym(String patronym) {
		this.patronym = patronym;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public List<String> getRoles() {
		List<String> roles = new ArrayList<>();
		if(adminRole) roles.add(Role.ADMINISTRATOR.getRole());
		if(userRole) roles.add(Role.USER.getRole());
		if(supportRole) roles.add(Role.SUPPORT.getRole());
		return roles;
	}
	
	public void setAdminRole(boolean set) {
		if(set){
			this.adminRole = true;
		}else{
			this.adminRole = false;
		}
	}
	
	public void setUserRole(boolean set) {
		if(set){
			this.userRole = true;
		}else{
			this.userRole = false;
		}
	}
	
	public void setSupportRole(boolean set) {
		if(set){
			this.supportRole = true;
		}else{
			this.supportRole = false;
		}
	}
	
	public long getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	
	public long getLastmodDate() {
		return lastmodDate;
	}
	
	public void setLastmodDate(long lastmodDate) {
		this.lastmodDate = lastmodDate;
	}

	public boolean isAdminRole() {
		return adminRole;
	}

	public boolean isUserRole() {
		return userRole;
	}

	public boolean isSupportRole() {
		return supportRole;
	}
}
