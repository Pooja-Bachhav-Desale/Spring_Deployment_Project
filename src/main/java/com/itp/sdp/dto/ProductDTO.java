package com.itp.sdp.dto;

import org.hibernate.annotations.processing.Pattern;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
public class ProductDTO {

		private Integer id;
	
		@Size(min=6,max = 100, message = "Product Title ust be between 6 to 100 characters")
	 	private String title;
	    
		@DecimalMin(value = "10.0" , message = "Product price must be grater than or equal to 10.00")
		private double price;
		
		@NotBlank(message = "Product description is required")
	    private String description;
		
		@NotBlank(message = "Product category is required")
	    private String category;
		
		@NotBlank(message = "Product image is required")
		@jakarta.validation.constraints.Pattern(
			regexp = "(?i).*\\\\.(png|jpg|pdf)$",
			message = "Image extension must be .png, .jpg or .pdf"
				)
	    private String image;
	   
		
	
}
