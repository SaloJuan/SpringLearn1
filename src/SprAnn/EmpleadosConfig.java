package SprAnn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("SprAnn") //this is similar to the label that specifies the base package in the xml
public class EmpleadosConfig {
	
	//definir bean para InformeFinancieroDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras(){
		
		return new InformeFinancieroDtoCompras();
	}
	
	//definir bean para DirectorFinanciero e inyectar dependencias
	
	@Bean
	public Empleados directorFinanciero(){
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
		
	}
	

}
 