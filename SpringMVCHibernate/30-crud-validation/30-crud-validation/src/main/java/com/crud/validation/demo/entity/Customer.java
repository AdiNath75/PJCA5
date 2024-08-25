package com.crud.validation.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {
	
	// define fields
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
		
		@Size(min = 3, max = 50)
		private String firstName;
		
		@Size(min = 3, max = 50)
		private String lastName;
		
		@NotBlank
		@Email(message = "Please enter a valid e-mail address")
		private String email;
		
		@NotBlank
		@Size(min = 8, max = 15)
		private String password;
		
		@NotBlank
		private String gender;
		
		@NotBlank
		private String profession;

		@Min(value = 20_000)
		@Max(value = 200_000)
		private long income;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getProfession() {
			return profession;
		}

		public void setProfession(String profession) {
			this.profession = profession;
		}

		public long getIncome() {
			return income;
		}

		public void setIncome(long income) {
			this.income = income;
		}

		@Override
		public String toString() {
			return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
					+ password + ", gender=" + gender + ", profession=" + profession + ", income=" + income + "]";
		}
		

}
