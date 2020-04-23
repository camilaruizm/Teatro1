/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Paises_Origen;

/**
 *
 * @author Alejo
 */
public class ControlPaises_Origen {

    public LinkedList<Paises_Origen> consultarPaisesOrigen() {
        LinkedList<Paises_Origen> lpo=new LinkedList<>();
        String sql="select * from paises_origen";
        Paises_Origen objpo=new Paises_Origen();
        lpo=objpo.consultarPaisesOrigen(sql);
        
        return lpo;
    }

    
    
}
