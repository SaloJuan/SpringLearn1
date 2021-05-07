
package SprAnn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UsoAnnotations {
    
    public static void main(String[] args) {
        
        /*ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("SprAnn/applicationContext.xml");
    	
    	
        
        Empleados emp1 = contexto.getBean("ComercialExperimentado", Empleados.class);
        
        Empleados emp2 = contexto.getBean("ComercialExperimentado", Empleados.class);
        
        if (emp1 == emp2)
        	System.out.println(emp1 + "\n" + emp2 );					EJEMPLO CON XML
        
        System.out.println(emp1.getInforme());
        
        contexto.close(); */
    	AnnotationConfigApplicationContext  contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
    	
    	/*Empleados emp1 = contexto.getBean("directorFinanciero", Empleados.class);
    	
    	System.out.println(emp1.getTareas());
    	System.out.println(emp1.getInforme());*/
    	
    	DirectorFinanciero empleado = contexto.getBean("directorFinanciero", DirectorFinanciero.class);
    	
    	System.out.println(empleado.getEmail());
    	
    	System.out.println(empleado.getnombreEmpresa());
    	
    	
    	
        
    }
    
}
