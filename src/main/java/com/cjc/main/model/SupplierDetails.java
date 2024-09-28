package com.cjc.main.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int supplierId;
	private String supplierName;
	@Column(unique = true)
	private String supplierEmail;
	private String supplierAddress;
	private int pincode;
	
}
