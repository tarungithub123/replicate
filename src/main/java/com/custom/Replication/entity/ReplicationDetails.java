package com.custom.Replication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TM_DATA_REPLICA")
@NamedQuery(query = "select u from ReplicationDetails u", name = "query_find_all_key")

public class ReplicationDetails   {
	
	@Id
	private int id; 

	@Column(name ="TYPE")
	private String type = null;

	@Column(name ="KEY")
	private String key = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "ReplicationDetails [id=" + id + ", type=" + type + ", key=" + key + "]";
	}

	 
	}