package hyagomv.template_method.impl;

public class ConcretClassB extends BaseClasse {

	public void passoUm() {
		System.out.printf("%s%10s%28s%12s%26s%n", "Classe B", "|","Etapa UM do Algoritmo", "|", "[ETAPA OBRIGATÓRIO]");
	}

	public void passoDois() {
		System.out.printf("%s%10s%28s%12s%26s%n", "Classe B", "|","Etapa UM do Algoritmo", "|", "[ETAPA CUSTOMIZADA]");
	}

}
