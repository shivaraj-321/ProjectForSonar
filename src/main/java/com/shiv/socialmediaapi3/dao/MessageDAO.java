package com.shiv.socialmediaapi3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiv.socialmediaapi3.model.Message;

public interface MessageDAO extends JpaRepository<Message, Integer> {

}
