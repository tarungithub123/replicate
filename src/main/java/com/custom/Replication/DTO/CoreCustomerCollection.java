package com.custom.Replication.DTO;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Collection of corecustomer.
 */
@Validated

public class CoreCustomerCollection   {
  @JsonProperty("data")
  @Valid
  private List<CoreCustomerDTO> data = null;


  public CoreCustomerCollection data(List<CoreCustomerDTO> data) {
    this.data = data;
    return this;
  }

  public CoreCustomerCollection addDataItem(CoreCustomerDTO dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CoreCustomerDTO>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * Get data
   * @return data
  **/

  @Valid

  public List<CoreCustomerDTO> getData() {
    return data;
  }

  public void setData(List<CoreCustomerDTO> data) {
    this.data = data;
  }

@Override
public String toString() {
	return "CoreCustomerCollection [data=" + data + "]";
}

  
}

