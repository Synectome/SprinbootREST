package com.rest_provider.dto;

import jakarta.validation.constraints.NotNull;

public class AddressDTO {

	private Integer addressId;
	@NotNull(message = "Must enter addr number")
	private Integer addressNumber;
	private String addressSubUnit;
	@NotNull(message = "Must Enter addr street")
	private String street;
	@NotNull(message = "Must Enter city")
	private String city;
	@NotNull(message = "Must Enter province or state")
	private String provinceOrState;
	@NotNull(message = "Must Enter country")
	private String country;
	@NotNull(message = "Must Enter postal code")
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
