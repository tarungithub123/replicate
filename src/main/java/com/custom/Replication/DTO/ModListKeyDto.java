package com.custom.Replication.DTO;

import java.util.List;

public class ModListKeyDto {
	private String id;
	  private List<Integer> modNos;
	  private String remarks;
	  
	  public String getId()
	  {
	    return this.id;
	  }
	  
	  public void setId(String id)
	  {
	    this.id = id;
	  }
	  
	  public List<Integer> getModNos()
	  {
	    return this.modNos;
	  }
	  
	  public void setModNos(List<Integer> modNos)
	  {
	    this.modNos = modNos;
	  }
	  
	  public String getRemarks()
	  {
	    return this.remarks;
	  }
	  
	  public void setRemarks(String remarks)
	  {
	    this.remarks = remarks;
	  }
}
