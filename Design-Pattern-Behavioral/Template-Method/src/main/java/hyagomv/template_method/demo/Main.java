package hyagomv.template_method.demo;

import hyagomv.template_method.client.ClientClass;
import hyagomv.template_method.impl.ConcretClassA;
import hyagomv.template_method.impl.ConcretClassB;
import hyagomv.template_method.impl.ConcretClassC;

public class Main {
public static void main(String[] args) {
		ClientClass cliente; 
		
		cliente = new ClientClass(new ConcretClassA()); // A
		cliente.templateMethod();
		
		
		System.out.println(); // Nova linha
		
		
		cliente = new ClientClass(new ConcretClassB()); // B
		cliente.templateMethod();
		
		
		System.out.println(); // Nova linha
		
		
		cliente = new ClientClass(new ConcretClassC()); // C
		cliente.templateMethod();
	}	
}
