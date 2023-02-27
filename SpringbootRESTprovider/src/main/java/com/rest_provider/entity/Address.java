package com.rest_provider.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private Integer addressNumber;
	private String addressSubUnit;
	private String street;
	private String city;
	private String provinceOrState;
	private String country;
	private String postalCode;
	
	public Integer getAddressId() {
		return addressId;
	}
	
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	
	public Integer getAddressNumber() {
		return addressNumber;
	}
	
	public void setAddressNumber(Integer addressNumber) {
		this.addressNumber = addressNumber;
	}
	
	public String getAddressSubUnit() {
		return addressSubUnit;
	}
	
	public void setAddressSubUnit(String addressSubUnit) {
		this.addressSubUnit = addressSubUnit;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getProvinceOrState() {
		return provinceOrState;
	}
	
	public void setProvinceOrState(String provinceOrState) {
		this.provinceOrState = provinceOrState;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
