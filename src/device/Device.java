package device;

public abstract class Device {

	private String serieNumber;

	public Device(String serieNumber) {
		this.serieNumber = serieNumber;
	}

	public String getSerieNumber() {
		return serieNumber;
	}

	public void setSerieNumber(String serieNumber) {
		this.serieNumber = serieNumber;
	}

	public abstract void processDoc(String doc);

}
