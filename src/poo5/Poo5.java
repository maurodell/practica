/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
 */
package poo5;

import poo5.ServiciosMeses.Servicios;

/**
 *
 * @author Mauro
 */
public class Poo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios ingreso = new Servicios();
        
        Datos mostrar = ingreso.consultarDatos();
        
        System.out.println(mostrar.toString());
        
        String dato = mostrar.toString();
        ingreso.ArrayMes(dato);
        
    }
    
}
