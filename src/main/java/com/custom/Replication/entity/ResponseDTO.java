package com.custom.Replication.entity;

import java.util.Objects;

public class ResponseDTO   {
	  private String message = null;
	  public ResponseDTO message(String message) {
	    this.message = message;
	    return this;
	  }
	  private String keyId;
	  private String status;
	  
	  public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	   * Get message
	   * @return message
	  **/
	  public String getKeyId()
	  {
	    return this.keyId;
	  }
	  
	  public void setKeyId(String keyId)
	  {
	    this.keyId = keyId;
	  }


	  public String getMessage() {
	    return message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }


	  @Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    ResponseDTO responseDTO = (ResponseDTO) o;
	    return Objects.equals(this.message, responseDTO.message);
	  }

	  @Override
	  public int hashCode() {
	    return Objects.hash(message);
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class ResponseDTO {\n");
	    
	    sb.append("    message: ").append(toIndentedString(message)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }

	  /**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }
	}