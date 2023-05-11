package com.robert.relationshipdemo.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min=5, max=15, message="User name must be between 5 and 15 characters")
	private String userName;
	
	@NotBlank
	@Email(message="Invalid email")
	private String email;
	
	@OneToMany(mappedBy="donor", fetch = FetchType.LAZY)
	private List<Donation> donations;
	
    @Column(updatable = false)
	private Date createdAt;

	private Date updatedAt;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	
	
    public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public Date getCreatedAt() {
		return createdAt;
	}




	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	




	public List<Donation> getDonations() {
		return donations;
	}




	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}




	@PrePersist // adds the created at date and time to sql on creation 
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate // add the updated at date and time when being updated
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
}
