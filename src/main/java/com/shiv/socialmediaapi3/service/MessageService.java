package com.shiv.socialmediaapi3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.shiv.socialmediaapi3.dao.MessageDAO;
import com.shiv.socialmediaapi3.model.Message;

@Service
public class MessageService {
	
	
	@Autowired
	private MessageDAO messageDAO;

	public Message createMessage(Message message) {
		return messageDAO.save(message);

	}
	
	public Optional<Message> findMessageById(int message_id){
		
		return messageDAO.findById(message_id);
	}
	
	public Message updateMessage(Message message) {
		return messageDAO.save(message);
	}
	
	public List<Message> allMessage() {
		return messageDAO.findAll();
	}
	
	public boolean deleteMessageByMessageId(int message_id){
		Optional<Message> message = messageDAO.findById(message_id);
		
		if (message.isPresent()) {
			messageDAO.deleteById(message_id);
			return true;
		} else {
			return false;
		}
	}

}
