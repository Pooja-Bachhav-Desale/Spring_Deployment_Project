package com.itp.sdp.model;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Product {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private Integer id;
		
		@Column(nullable = false, length = 100)
	    private String productTitle;
		
		@Column(nullable = false)
	    private double price;
		
		@Column(nullable = false , length = 100)
	    private String description;
		
		@Column(nullable = false , length = 50)
	    private String category;
		
		@Column(nullable = false)
	    private String image;
	    
	    @Column(nullable = false , updatable = false)
	    private LocalDateTime createdAt;
	    
	    @Column(nullable = false)
	    private LocalDateTime modifiedAt;
	    
	    @PrePersist
	    protected void atCreation() {
	    	LocalDateTime now = LocalDateTime.now();
	    	this.createdAt = now;
	    	this.modifiedAt = now;
	    }
	    
	    @PreUpdate
	    protected void atUpdation() {
	    	this.modifiedAt = LocalDateTime.now();
	    }
}
