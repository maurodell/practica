/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author Mauro
 */
public class Datos {
    private String Mes;
    
    public Datos (String Mes){
        this.Mes = Mes;
    }
    public Datos(){
        
    }
    
    public String getMes() {
        return Mes;
    }
    public void setMes(String Mes){
        this.Mes = Mes;
    }

    @Override
    public String toString() {
        return "Datos{" + "Mes=" + Mes + '}';
    }

    
}
