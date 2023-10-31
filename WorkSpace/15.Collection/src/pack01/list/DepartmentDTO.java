package pack01.list;

public class DepartmentDTO {
	private int deparmentId, managerId, locationId;
	private String departmentName;
	
	public DepartmentDTO(int deparmentId, int managerId, int locationId, String departmentName) {
		super();
		this.deparmentId = deparmentId;
		this.managerId = managerId;
		this.locationId = locationId;
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDeparmentId() {
		return deparmentId;
	}

	public void setDeparmentId(int deparmentId) {
		this.deparmentId = deparmentId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
