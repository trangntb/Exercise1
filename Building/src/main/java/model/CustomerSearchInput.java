package model;

public class CustomerSearchInput {
	private String fullname;
	private String phone;
	
	public CustomerSearchInput() {
		super();
	}
	public CustomerSearchInput(String fullname, String phone) {
		super();
		this.fullname = fullname;
		this.phone = phone;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "[fullname=" + fullname + ", phone=" + phone + "]";
	}
}
