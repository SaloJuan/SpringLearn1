
package SprAnn;

import org.springframework.stereotype.Component;

@Component
public class InformeTrim4 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "informe corresp al trim 4";
    }
    
}
