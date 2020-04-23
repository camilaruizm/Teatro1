/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Ciudad;

/**
 *
 * @author Alejo
 */
public class ControlCiudad {

    public boolean insertarCiudades(LinkedList<Ciudad> listaCiudades) {
        boolean t=false;
        Ciudad objc=new Ciudad();
        for (int i = 0; i < listaCiudades.size(); i++) {
            Ciudad get = listaCiudades.get(i);
            String sql="insert into ciudades(nombreC) value('"+get.getNombreC()+"');";
            
            t=objc.insertarCiudad(sql);
        }
        
        return t;
        
        
        
    }
    
}
