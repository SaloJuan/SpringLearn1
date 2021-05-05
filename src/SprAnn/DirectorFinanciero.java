package SprAnn;

public class DirectorFinanciero implements Empleados {
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero){
		
		this.informeFinanciero = informeFinanciero;
		
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "tareas de director financiero bla";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	
	
	private CreacionInformeFinanciero informeFinanciero;

}
