package com.shiv.socialmediaapi3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiv.socialmediaapi3.model.Account;
import com.shiv.socialmediaapi3.model.Message;
import com.shiv.socialmediaapi3.service.AccountService;
import com.shiv.socialmediaapi3.service.MessageService;

@RestController
public class SocialMediaContrallerAPI {
	
	@Autowired
	private AccountService accountService;
	
	@Autowired MessageService messageService;
	
	@PostMapping("/registration")
	public ResponseEntity<String> accRegistration(@RequestBody Account account) {
		return accountService.accountRegistration(account);
	}
	
	@GetMapping("/find/{account_id}")
	public ResponseEntity<String> findAccountById(@PathVariable int account_id){
		return accountService.findAccountByAccountId(account_id);
	}
	
	@GetMapping("/findall/account")
	public List<Account> findAllAccount(){
		return accountService.allAccount();
	}
	
	@DeleteMapping("/delete/{account_id}")
	public ResponseEntity<String> deleteAccountById(@PathVariable int account_id){
		return accountService.deleteAccountByAccountId(account_id);
	}
	
	// =======================================================================================
	
	@PostMapping("/createMessage")
	public Message saveMessage(@RequestBody Message message) {
		return messageService.createMessage(message);
	}
	
	@GetMapping("/find/{message_id}")
	public Optional<Message> findMessageById(@PathVariable int message_id){
		return messageService.findMessageById(message_id);
	}
	
	@PutMapping("/update")
	public Message updateMessage(Message message) {
		return messageService.updateMessage(message);
	}
	
	
	@GetMapping("/findall/messages")
	public List<Message> findAllMessage(){
		return messageService.allMessage();
	}
	
	@DeleteMapping("/delete/{message_id}")
	public boolean deleteMessageById(@PathVariable int message_id){
		return messageService.deleteMessageByMessageId(message_id);
	}
	
}
