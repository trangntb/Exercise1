package dao;

public class BuildingDAO {
	private String id;
	private String name;
	private String street;
	private String ward;
	private String district;
	private String floorarea;
	private String type;
	
	public BuildingDAO() {
		super();
	}

	public BuildingDAO(String id, String name, String street, String ward, String district,String floorarea,
			String type) {
		super();
		this.id = id;
		this.name = name;
		this.street = street;
		this.ward = ward;
		this.district = district;
		this.floorarea = floorarea;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFloorarea() {
		return floorarea;
	}

	public void setFloorarea(String floorarea) {
		this.floorarea = floorarea;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "BuildingModelDAO [id=" + id + ", name=" + name + ", floorarea=" + floorarea + ", street=" + street
				+ ", ward=" + ward + ", district=" + district + ", type=" + type + "]";
	}
	
	
}
