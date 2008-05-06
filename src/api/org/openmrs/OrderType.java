/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs;

import java.util.Date;

import org.openmrs.synchronization.Synchronizable;

/**
 * OrderType
 * @version 1.0
 */
public class OrderType implements java.io.Serializable, Synchronizable {

	public static final long serialVersionUID = 23232L;

	// Fields

	private Integer orderTypeId;
	private String name;
	private String description;
	private User creator;
	private Date dateCreated;
	private String guid;
    private transient String lastRecordGuid;
    
    public String getLastRecordGuid() {
        return lastRecordGuid;
    }

    public void setLastRecordGuid(String lastRecordGuid) {
        this.lastRecordGuid = lastRecordGuid;
    }
	
  public String getGuid() {
      return guid;
  }

  public void setGuid(String guid) {
      this.guid = guid;
  }

	// Constructors

	/** default constructor */
	public OrderType() {
	}

	/** constructor with id */
	public OrderType(Integer orderTypeId) {
		this.orderTypeId = orderTypeId;
	} 

	/** 
	 * Compares two objects for similarity
	 * 
	 * @param obj
	 * @return boolean true/false whether or not they are the same objects
	 */
	public boolean equals(Object obj) {
		if (obj instanceof OrderType) {
			OrderType o = (OrderType)obj;
			if (o != null)
				return (getOrderTypeId().equals(o.getOrderTypeId()));
		}
		return false;
	}
	
	public int hashCode() {
		if (this.getOrderTypeId() == null) return super.hashCode();
		return this.getOrderTypeId().hashCode();
	}

	// Property accessors

	/**
	 * @return Returns the creator.
	 */
	public User getCreator() {
		return creator;
	}

	/**
	 * @param creator The creator to set.
	 */
	public void setCreator(User creator) {
		this.creator = creator;
	}

	/**
	 * @return Returns the dateCreated.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated The dateCreated to set.
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	/**
	 * @return Returns the description.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description The description to set.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the orderTypeId.
	 */
	public Integer getOrderTypeId() {
		return orderTypeId;
	}

	/**
	 * @param orderTypeId The orderTypeId to set.
	 */
	public void setOrderTypeId(Integer orderTypeId) {
		this.orderTypeId = orderTypeId;
	}

	
}