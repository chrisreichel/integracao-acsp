package br.net.acsp.bean;

import java.util.Date;

public class FakeUser {

	private String number, gender, givenName, middleInitial, surname, streetAddress, city, state, zipCode, 
		emailAddress, username, password,telephoneNumber, ccType, cCNumber, cvv2, ccExpires, 
		nationalID, ups, company, vehicle;
	
	private Date birthday;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getCcType() {
		return ccType;
	}

	public void setCcType(String ccType) {
		this.ccType = ccType;
	}

	public String getcCNumber() {
		return cCNumber;
	}

	public void setcCNumber(String cCNumber) {
		this.cCNumber = cCNumber;
	}

	public String getCvv2() {
		return cvv2;
	}

	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}

	public String getCcExpires() {
		return ccExpires;
	}

	public void setCcExpires(String ccExpires) {
		this.ccExpires = ccExpires;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public String getUps() {
		return ups;
	}

	public void setUps(String ups) {
		this.ups = ups;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "FakeUser [number=" + number + ", gender=" + gender
				+ ", givenName=" + givenName + ", middleInitial="
				+ middleInitial + ", surname=" + surname + ", streetAddress="
				+ streetAddress + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", emailAddress=" + emailAddress
				+ ", username=" + username + ", password=" + password
				+ ", telephoneNumber=" + telephoneNumber + ", ccType=" + ccType
				+ ", cCNumber=" + cCNumber + ", cvv2=" + cvv2 + ", ccExpires="
				+ ccExpires + ", nationalID=" + nationalID + ", ups=" + ups
				+ ", company=" + company + ", vehicle=" + vehicle
				+ ", birthday=" + birthday + "]";
	}
}
