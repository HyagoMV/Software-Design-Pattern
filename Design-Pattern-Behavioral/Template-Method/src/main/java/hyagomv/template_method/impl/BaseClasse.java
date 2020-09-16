package hyagomv.template_method.impl;

/*
 * 	1) Transforma um método grande(Algoritmo) em vários métodos menores(Etapas), 
 * 		preservando o fluxo de execução original
 * 	2) Permite que as subclasses modifiquem os métodos menores(Etapas),
 * 		sem que altere o fluxo de execução original
 *  
 *  Nota: Um ALGORITMO é composto por uma sequencia ETAPAS
 */
public abstract class BaseClasse {

	public final void métodoTemplate() {
		/*
		 *  Notas:
		 *  	1) O Método Template preservando o fluxo de execução do algortimo 
		 *  	2) NÃO DEVE ser substituido por nenhuma subclasse, 
		 *  		este método DEVE ficar INTOCÁVEL
		 */
		passoUm(); 	 
		passoDois(); 
		passoTrês(); 
	}
	
	// ----------------------------------------------------------------------------------------
	
	// Hook Steps - Substituição OBRIGATÓRIA
	protected abstract void passoUm(); 
	// Cada subclasse tem uma implementação diferente para esta etapa

	
	
	// Hook Steps - Substituição OPCIONAL com uma Implementação Padrão
	protected  void passoDois() {
		/*	Notas:
		 *  	1) Esta Operação Primitiva tem uma Implementação Padrão
		 *  	2) Esta é uma Operação Primitiva do algoritmo
		 *  	3) O Método Template DEVE funcionar mesmo se este método não for substituido. 
		 */
		System.out.printf("%s%7s%30s%10s%21s%n", "Classe Base", "|","Etapa DOIS do Algoritmo", "|", "[ETAPA PADRÃO]");
	};
    
	
	
	// Hook Steps - Substituição OPCIONAL sem uma Implementação Padrão
	protected  void passoTrês() {
		/*	Notas:
		 *  1) Esta Operação Primitiva não tem uma Implementação Padrão
		 *  2) Esta é uma Operação Primitiva Adicional do algoritmo
		 *  3) O Método Template DEVE funcionar mesmo se este método não for substituido. 
		 */
	};

    
}

