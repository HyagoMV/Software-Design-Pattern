package hyagomv.template_method.demo;

import hyagomv.template_method.impl.ConcretClassA;
import hyagomv.template_method.impl.ConcretClassB;
import hyagomv.template_method.impl.ConcretClassC;

// Classe que utiliza o m�todo template
public class Cliente {
public static void main(String[] args) {
		
		// Executando o algoritmo
		new ConcretClassA().m�todoTemplate();  // A
		
		System.out.println(); // Nova linha
		
		new ConcretClassB().m�todoTemplate();  // B
		
		System.out.println(); // Nova linha
		
		new ConcretClassC().m�todoTemplate();  // C
	}	
}
