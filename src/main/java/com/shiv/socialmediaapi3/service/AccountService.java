package com.shiv.socialmediaapi3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.shiv.socialmediaapi3.dao.AccountDAO;
import com.shiv.socialmediaapi3.model.Account;

@Service
public class AccountService {

	@Autowired
	private AccountDAO accountDAO;

	public ResponseEntity<String> accountRegistration(Account account) {
		Account acc = accountDAO.save(account);
		if (acc != null) {
			return ResponseEntity.ok("Account registered successfully");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("Failed to register account. Please check your input.");
		}

	}
	
	public ResponseEntity<String> findAccountByAccountId(int account_id){
		Optional<Account> acc = accountDAO.findById(account_id);
		if (acc.isPresent()) {
			return ResponseEntity.ok("The account is identified with the given id :" + account_id);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("Failed to identigy your account");
		}
	}
	
	public List<Account> allAccount() {
		return accountDAO.findAll();
	}
	
	public ResponseEntity<String> deleteAccountByAccountId(int account_id){
		Optional<Account> acc = accountDAO.findById(account_id);
		if (acc.isPresent()) {
			accountDAO.deleteById(account_id);
			return ResponseEntity.ok("The account with ID " + account_id + "has been deleted");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failed to identigy your account");
		}
	}

}
