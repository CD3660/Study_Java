package phone;

public class Generation2DTO extends Generation1DTO {
	private int channel;
	private boolean dmbOnOff;

	public Generation2DTO(String color, String model, int channel) {
		super(color, model);
		this.channel = channel;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public boolean isDmbOnOff() {
		return dmbOnOff;
	}

	public void setDmbOnOff(boolean dmbOnOff) {
		this.dmbOnOff = dmbOnOff;
	}

}
