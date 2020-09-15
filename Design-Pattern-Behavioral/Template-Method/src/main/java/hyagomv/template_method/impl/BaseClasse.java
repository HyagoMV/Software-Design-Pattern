package hyagomv.template_method.impl;

/*
 * 	- Permite/Obriga que as subclasses estendam/substituidas etapas individuais
 * 	- Permite transforma um algoritmo monolitico em etapas individuais sem alterar sua l�gica de comportamento
 *  - Elimina duplica��o de c�digo
 */
public abstract class BaseClasse {

	// -------------------------------------------------------------------------
	// ===========================   M�todo Template ===========================  
	// -------------------------------------------------------------------------

	// Este m�todo chama as etapas em uma ordem espec�fica do "Algoritmo QualQuerCoisa"
	// Nota: N�O DEVE ser substituido por nenhuma subclasse, este m�todo DEVE ser INTOC�VEL
	public final void templateMethod() {
		// O M�todo Template cont�m a l�gica de comportamento do algortimo,
		stepOne(); 	 // Etapa UM do algortimo
		stepTwo(); 	 // Etapa DOIS do algortimo
		stepThree(); // Etapa TR�S do algortimo
	}
	
	// ----------------------------------------------------------------------------------------
	
	// Abstract Steps 	-	DEVE ser substituida
	protected abstract void stepOne(); // Cada subclasse tem uma implementa��o diferente para esta etapa

	// Optional Steps	-	PODE ser substituida
	protected  void stepTwo() {
		System.out.println("Etapa DOIS do Algoritmo [PADR�O]"); // Implementa��o Padr�o do "Algoritmo QualQuerCoisa"
	};
	
	// Hook Steps	-	PODE ser substituida
	protected  void stepThree() {
		/*	Notas:
		 *  1) Esta etapa n�o tem uma Implementa��o Padr�o
		 *  2) Esta � uma etapa Adicional do "Algoritmo QualQuerCoisa"
		 *  3) O M�todo Template DEVE funcionar mesmo se este m�todo n�o for substituido. 
		 */
	};
	
	
}
