/* 
 * la coleccion maps nos permite tener objetos cn index como si fuese una base de datos, acepta indice nulo pero no repetidos
 */
/* 
 * ESTE MAP VA A COLECCIONAR EMPLEADOS CON SU CORRESPONDIENTE CLAVE
 */

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        /* HashMap recibe 2 parametros, primero la clave y luego el valor
         * puede recibir objetos de valor tipo generico 
        */


        HashMap<String, Empleado> personal=new HashMap<String, Empleado>();
        /* introducimos elementos dentro del mapa */
        personal.put("123", new Empleado("alejandro"));
        personal.put("110", new Empleado("mariela"));
        personal.put("02", new Empleado("kevin"));
        personal.put("03", new Empleado("genesis"));

        System.out.println(personal);

        /* eliminamos un elemento */
        personal.remove("03");

        System.out.println(personal);

        /* reemplazmos un elementos */
        personal.put("110", new Empleado("pepe"));
        System.out.println("-----3------"+personal);


        /* vamos  a mostrar el map como una lista con el set para poder manipular el key y el valor separados */

        // System.out.println(personal.entrySet()+"4----");

        for(Map.Entry<String, Empleado> entrada: personal.entrySet()) {
            String key=entrada.getKey();
            Empleado valor=entrada.getValue();
            System.out.println("Calve: "+ key+" , valor: "+ valor);
        }

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
