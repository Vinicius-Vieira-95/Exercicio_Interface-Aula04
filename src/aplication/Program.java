package aplication;

import device.ComboDevice;
import device.ConcretePrinter;
import device.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcreteScanner s = new ConcreteScanner("1234");
		s.processDoc("Process scanner");
		System.out.println(s.scan());
		
		System.out.println();
		ConcretePrinter p = new ConcretePrinter("5678");
		p.processDoc("Process Printer");
		p.print("Baby");
		
		System.out.println();
		ComboDevice c = new ComboDevice("0007");
		c.print("combo");
		c.processDoc("Process");
		System.out.println(c.scan());
	}

}
