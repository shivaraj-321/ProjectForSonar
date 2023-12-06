package com.shiv.socialmediaapi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "Account_Details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	@Id
	private int account_id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

}
