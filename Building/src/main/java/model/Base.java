package model;

public class Base {
	private long id;

	public Base() {
		super();
	}

	public Base(long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "id=" + id;
	}
	
}
