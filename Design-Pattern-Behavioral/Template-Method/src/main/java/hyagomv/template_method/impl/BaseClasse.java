package hyagomv.template_method.impl;

/*
 * 	- Permite/Obriga que as subclasses estendam/substituidas etapas individuais
 * 	- Permite transforma um algoritmo monolitico em etapas individuais sem alterar sua lógica de comportamento
 *  - Elimina duplicação de código
 */
public abstract class BaseClasse {

	// -------------------------------------------------------------------------
	// ===========================   Método Template ===========================  
	// -------------------------------------------------------------------------

	// Este método chama as etapas em uma ordem específica do "Algoritmo QualQuerCoisa"
	// Nota: NÃO DEVE ser substituido por nenhuma subclasse, este método DEVE ser INTOCÁVEL
	public final void templateMethod() {
		// O Método Template contém a lógica de comportamento do algortimo,
		stepOne(); 	 // Etapa UM do algortimo
		stepTwo(); 	 // Etapa DOIS do algortimo
		stepThree(); // Etapa TRÊS do algortimo
	}
	
	// ----------------------------------------------------------------------------------------
	
	// Abstract Steps 	-	DEVE ser substituida
	protected abstract void stepOne(); // Cada subclasse tem uma implementação diferente para esta etapa

	// Optional Steps	-	PODE ser substituida
	protected  void stepTwo() {
		System.out.println("Etapa DOIS do Algoritmo [PADRÃO]"); // Implementação Padrão do "Algoritmo QualQuerCoisa"
	};
	
	// Hook Steps	-	PODE ser substituida
	protected  void stepThree() {
		/*	Notas:
		 *  1) Esta etapa não tem uma Implementação Padrão
		 *  2) Esta é uma etapa Adicional do "Algoritmo QualQuerCoisa"
		 *  3) O Método Template DEVE funcionar mesmo se este método não for substituido. 
		 */
	};
	
	
}
