package com.generation.gameconsult.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Email
	private String email;
	
	@NotBlank
	private String username;
	
	@NotBlank
	@Size(min = 3, max = 10)
	private String password;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date birthday;
	
	@UpdateTimestamp
    private Date created =  new java.util.Date(System.currentTimeMillis());
	
	@OneToMany(mappedBy = "email", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("email")
	private List<Game> game;

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBithday() {
		return birthday;
	}

	public void setBithday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public List<Game> getGame() {
		return game;
	}

	public void setGame(List<Game> game) {
		this.game = game;
	}
	
}
