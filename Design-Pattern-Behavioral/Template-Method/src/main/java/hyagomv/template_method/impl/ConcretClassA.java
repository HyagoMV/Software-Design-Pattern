package hyagomv.template_method.impl;

public class ConcretClassA extends BaseClasse {

	@Override
	public void passoUm() {
		System.out.printf("%s%10s%28s%12s%26s%n", "Classe A", "|","Etapa UM do Algoritmo", "|", "[ETAPA OBRIGATÓRIO]");
	}

	@Override
	public void passoTrês() {
		System.out.printf("%s%10s%30s%10s%24s%n", "Classe A", "|","Etapa TRÊS do Algoritmo", "|", "[ETAPA ADICIONAL]");
	}

}
