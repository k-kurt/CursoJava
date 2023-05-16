/* 
 * la coleccion maps nos permite tener objetos cn index como si fuese una base de datos, acepta indice nulo pero no repetidos
 */
/* 
 * ESTE MAP VA A COLECCIONAR EMPLEADOS CON SU CORRESPONDIENTE CLAVE
 */

import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* HashMap recibe 2 parametros, primero la clave y luego el valor
         * puede recibir objetos de valor tipo generico 
        */


        HashMap<String, Empleado>

    }
}

class Empleado{
    public Empleado(String n){
         nombre=n;
         sueldo=2000;
    }

    public String toString(){
        return "[nombre="+ nombre +" , sueldo=" + sueldo + "]";
    }

    private String nombre;
    private double sueldo;
}
