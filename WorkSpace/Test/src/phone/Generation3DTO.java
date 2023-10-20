package phone;



public class Generation3DTO extends Generation2DTO{
	private boolean internetOnOff;
	private boolean webtoonOnOff;
	public Generation3DTO(String color, String model, int channel) {
		super(color, model, channel);
	}
	public boolean isInternetOnOff() {
		return internetOnOff;
	}
	public void setInternetOnOff(boolean internetOnOff) {
		this.internetOnOff = internetOnOff;
	}
	public boolean isWebtoonOnOff() {
		return webtoonOnOff;
	}
	public void setWebtoonOnOff(boolean webtoonOnOff) {
		this.webtoonOnOff = webtoonOnOff;
	}
	
}
