
package SprAnn;

import org.springframework.stereotype.Component;

@Component
public class InformeTrim1 implements CreacionInformeFinanciero { 

    @Override
    public String getInformeFinanciero() {
        return "informe corresp al t1";
    }
    
}
