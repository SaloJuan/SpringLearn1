package SprAnn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("SprAnn") //this is similar to the label that specifies the base package in the xml
@PropertySource("datosempresa.propiedades")
public class EmpleadosConfig {
	
	//definir bean para InformeFinancieroDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras(){ //sete será el id del bean inyectado
		
		return new InformeFinancieroDtoCompras();
	}
	
	//definir bean para DirectorFinanciero e inyectar dependencias
	
	@Bean
	public Empleados directorFinanciero(){
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
		
	}
	

}
 