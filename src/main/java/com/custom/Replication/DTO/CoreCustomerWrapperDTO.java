package com.custom.Replication.DTO;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CoreCustomerWrapperDTO
 */
@Validated

public class CoreCustomerWrapperDTO   {
  @JsonProperty("data")
  private CoreCustomerDTO data = null;

  public CoreCustomerWrapperDTO data(CoreCustomerDTO data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/

  @Valid

  public CoreCustomerDTO getData() {
    return data;
  }

  public void setData(CoreCustomerDTO data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreCustomerWrapperDTO coreCustomerWrapperDTO = (CoreCustomerWrapperDTO) o;
    return Objects.equals(this.data, coreCustomerWrapperDTO.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreCustomerWrapperDTO {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

