package model;

public class Customer extends Base{
	private String fullname;
	private String phone;
	private String email;
	public Customer() {
		super();
	}
	public Customer(String fullname, String phone, String email) {
		super();
		this.fullname = fullname;
		this.phone = phone;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "["+ super.toString()+ ", fullname=" + fullname + ", phone=" + phone + ", email=" + email + "]";
	}

}
