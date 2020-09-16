package hyagomv.template_method.impl;

/*
 * 	1) Transforma um m�todo grande(Algoritmo) em v�rios m�todos menores(Etapas), 
 * 		preservando o fluxo de execu��o original
 * 	2) Permite que as subclasses modifiquem os m�todos menores(Etapas),
 * 		sem que altere o fluxo de execu��o original
 *  
 *  Nota: Um ALGORITMO � composto por uma sequencia ETAPAS
 */
public abstract class BaseClasse {

	public final void m�todoTemplate() {
		/*
		 *  Notas:
		 *  	1) O M�todo Template preservando o fluxo de execu��o do algortimo 
		 *  	2) N�O DEVE ser substituido por nenhuma subclasse, 
		 *  		este m�todo DEVE ficar INTOC�VEL
		 */
		passoUm(); 	 
		passoDois(); 
		passoTr�s(); 
	}
	
	// ----------------------------------------------------------------------------------------
	
	// Hook Steps - Substitui��o OBRIGAT�RIA
	protected abstract void passoUm(); 
	// Cada subclasse tem uma implementa��o diferente para esta etapa

	
	
	// Hook Steps - Substitui��o OPCIONAL com uma Implementa��o Padr�o
	protected  void passoDois() {
		/*	Notas:
		 *  	1) Esta Opera��o Primitiva tem uma Implementa��o Padr�o
		 *  	2) Esta � uma Opera��o Primitiva do algoritmo
		 *  	3) O M�todo Template DEVE funcionar mesmo se este m�todo n�o for substituido. 
		 */
		System.out.printf("%s%7s%30s%10s%21s%n", "Classe Base", "|","Etapa DOIS do Algoritmo", "|", "[ETAPA PADR�O]");
	};
    
	
	
	// Hook Steps - Substitui��o OPCIONAL sem uma Implementa��o Padr�o
	protected  void passoTr�s() {
		/*	Notas:
		 *  1) Esta Opera��o Primitiva n�o tem uma Implementa��o Padr�o
		 *  2) Esta � uma Opera��o Primitiva Adicional do algoritmo
		 *  3) O M�todo Template DEVE funcionar mesmo se este m�todo n�o for substituido. 
		 */
	};

    
}

