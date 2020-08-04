package device;

public class ConcreteScanner extends Device implements Scanner{
	
	
	public ConcreteScanner(String serieNumber) {
		super(serieNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		
		System.out.println("Scanner doc " + doc);
		
	}
	
	@Override
	public String scan() {
		return "Scanned Content";
	}
	
	
}
