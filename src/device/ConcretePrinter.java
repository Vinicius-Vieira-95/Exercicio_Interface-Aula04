package device;

public class ConcretePrinter extends Device implements Printer{

	public ConcretePrinter(String serieNumber) {
		super(serieNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer: " +doc);
		
	}
	@Override
	public void print(String doc) {
		System.out.println("Priting :" + doc);
	}

}
