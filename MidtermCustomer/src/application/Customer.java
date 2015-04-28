package application;

import java.util.ArrayList;

public class Customer {

		private String firstName;
		private String middleI;
		private String lastName;
		private String gender;
		private String address;
		private String city;
		private String state;
		private String zipCode;
		
		public Customer() {
		}

		public Customer(String firstName, String middleI, String lastName,
				String gender, String address, String city, String state,
				String zipCode) {
			super();
			this.firstName = firstName;
			this.middleI = middleI;
			this.lastName = lastName;
			this.gender = gender;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
		}


		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getMiddleI() {
			return middleI;
		}

		public void setMiddleI(String middleI) {
			this.middleI = middleI;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
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
		
		
}

