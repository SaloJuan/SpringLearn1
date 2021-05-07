package SprAnn;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	
	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero){
		
		this.informeFinanciero = informeFinanciero;
		
	}
	
	public String getEmail(){
		
		return this.email;
	}
	
	public String getnombreEmpresa(){
		
		return nombreEmpresa;
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
	@Value("${email}")	
	private String email;
	
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;

}
