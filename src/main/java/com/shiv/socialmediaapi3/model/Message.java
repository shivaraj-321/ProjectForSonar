package com.shiv.socialmediaapi3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Message_Details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {

	@Id
	public int message_id;

	@Column(name = "posted_by")
	public int posted_by;

	@Column(name = "message_text")
	public String message_text;

	@Column(name = "time_posted_epoch")
	public long time_posted_epoch;

}
