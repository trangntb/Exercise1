package dao;

import java.sql.Date;

public class CustomerDAO {
	private Long id;
	private String fullname;
	private String phone;
	private String email;
	private Date createdate;
	private Date modifieddate;
	private String createby;
	private String modifiedby;
	
	public CustomerDAO() {
		super();
	}
	public CustomerDAO(Long id, String fullname, String phone, String email, Date createdate, Date modifieddate,
			String createby, String modifiedby) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.phone = phone;
		this.email = email;
		this.createdate = createdate;
		this.modifieddate = modifieddate;
		this.createby = createby;
		this.modifiedby = modifiedby;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public String getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(String modifiedby) {
		this.modifiedby = modifiedby;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", fullname=" + fullname + ", phone=" + phone + ", email=" + email
				+ ", createdate=" + createdate + ", modifieddate=" + modifieddate + ", createby=" + createby
				+ ", modifiedby=" + modifiedby + "]";
	}
	
	
	
}
