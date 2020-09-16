package hyagomv.template_method.impl;

public class ConcretClassC extends BaseClasse {

	@Override
	protected void passoUm() {
		System.out.printf("%s%10s%28s%12s%26s%n", "Classe C", "|","Etapa UM do Algoritmo", "|", "[ETAPA OBRIGATÓRIO]");
	}

}
