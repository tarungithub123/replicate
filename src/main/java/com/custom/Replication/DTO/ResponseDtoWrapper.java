package com.custom.Replication.DTO;
import org.springframework.stereotype.Component;

import com.custom.Replication.entity.ResponseDTO;

@Component
public class ResponseDtoWrapper {

	  private ResponseDTO messages;
	 
	  public ResponseDTO getMessages()
	  {
	    return this.messages;
	  }
	  
	  public void setMessages(ResponseDTO messages)
	  {
	    this.messages = messages;
	  }
	 
}
