
package SprAnn;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
//@Scope("prototype")
public class ComercialExperimentado implements Empleados
{
   /* @Autowired
    public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }*/
    @Override
    public String getTareas() {
        return "vender banda";
    }

    @Override
    public String getInforme() {
        
        return nuevoInforme.getInformeFinanciero() ;
    }
    
    public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }
    
    @Autowired
    @Qualifier("informeTrim2")
    CreacionInformeFinanciero nuevoInforme;
    
    
}