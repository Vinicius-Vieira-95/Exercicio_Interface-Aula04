package device;

public class ComboDevice extends Device implements Scanner, Printer {

	
	/*
	 * ComboDevice esta pegando metodos impplementados em Concrete Scanner e Concrete Printer
	 * com a ajuda da interface. 
	 */
	
	public ComboDevice(String serieNumber) {
		super(serieNumber);
		
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo Device Process doc :"+ doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo device print :"+ doc);
		
	}

	@Override
	public String scan() {
		return "Combo device scan";
	}

}
