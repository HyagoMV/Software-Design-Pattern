package hyagomv.template_method.demo;

import hyagomv.template_method.impl.ConcretClassA;
import hyagomv.template_method.impl.ConcretClassB;
import hyagomv.template_method.impl.ConcretClassC;

// Classe que utiliza o método template
public class Cliente {
public static void main(String[] args) {
		
		// Executando o algoritmo
		new ConcretClassA().métodoTemplate();  // A
		
		System.out.println(); // Nova linha
		
		new ConcretClassB().métodoTemplate();  // B
		
		System.out.println(); // Nova linha
		
		new ConcretClassC().métodoTemplate();  // C
	}	
}
