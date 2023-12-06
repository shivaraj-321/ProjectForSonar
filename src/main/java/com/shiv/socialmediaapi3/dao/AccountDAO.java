package com.shiv.socialmediaapi3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiv.socialmediaapi3.model.Account;

public interface AccountDAO extends JpaRepository<Account, Integer> {

}
