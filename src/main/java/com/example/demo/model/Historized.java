package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public  class Historized {
    
	
	
	@Column
	@CreationTimestamp
	private LocalDateTime createDateTime;

	@Column
	@UpdateTimestamp
	private LocalDateTime updateDateTime;

	
	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	
	
}
