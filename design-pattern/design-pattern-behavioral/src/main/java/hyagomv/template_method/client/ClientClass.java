package hyagomv.template_method.client;

import hyagomv.template_method.impl.BaseClasse;

public class ClientClass {
	
	private BaseClasse template;
		
	public ClientClass(BaseClasse template) {
		this.template = template;
	}

	public void templateMethod() {
		template.templateMethod();
	}
}
