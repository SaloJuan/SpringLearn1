/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SprAnn;

import org.springframework.stereotype.Component;

@Component
public class InformeTrim3 implements CreacionInformeFinanciero{

    @Override
    public String getInformeFinanciero() {
        return "informe corresp al trim 3";
    }
    
}
