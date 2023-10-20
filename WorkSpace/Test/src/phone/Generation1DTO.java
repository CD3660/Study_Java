package phone;

public class Generation1DTO extends SuperPhone {
	private String color;
	private String model;
	private boolean powerOnOff;//전원
	private boolean callOnOff;//전화통화 유무상태 

	public Generation1DTO(String color, String model) {
		super();
		this.color = color;
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isPowerOnOff() {
		return powerOnOff;
	}
	public void setPowerOnOff(boolean powerOnOff) {
		this.powerOnOff = powerOnOff;
	}
	public boolean isCallOnOff() {
		return callOnOff;
	}
	public void setCallOnOff(boolean callOnOff) {
		this.callOnOff = callOnOff;
	}

}
