/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5.ServiciosMeses;

import java.util.Scanner;
import poo5.Datos;
/**
 *
 * @author Mauro
 */
public class Servicios {
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    
    public Datos consultarDatos(){
        System.out.println("Ingrese le mes:");
        String mes = teclado.next();
        mes = mes.toLowerCase();
        ArrayMes(mes);
        return new Datos(mes);
    }
    
    public void ArrayMes(String mes){
        String [] vector = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        String mesSecreto = vector[6];
        
        boolean flag = false;
        
        while(flag){
            if(mesSecreto.equals(mes)){
                System.out.println("AH ACERTADO!");
                flag = true;
            }else{
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: "+mes);
            }
        }
    }
}
