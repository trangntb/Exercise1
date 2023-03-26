package model;

public class CustomerSearchOutput {
	private String firstname; //ten
	private String lastname; //ho
	private String phone;
	private String email;
	
	public CustomerSearchOutput() {
		super();
	}

	public CustomerSearchOutput(String firstname, String lastname, String phone, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "[firstname=" + firstname + ", lastname=" + lastname + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
}
