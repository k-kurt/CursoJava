import java.util.*;
public class App {
    public static void main(String[] args)  {
    
    /* TreeSet<String> oredenarPersonas=new TreeSet<String>();

    oredenarPersonas.add("laura");
    oredenarPersonas.add("elias");
    oredenarPersonas.add("matias");
    

    for (String coleccion : oredenarPersonas) {
        System.out.println(coleccion);
    } */


    Articulo primerArticulo=new Articulo(1, "primer articulo");
    Articulo segundoArticulo=new Articulo(200, "segundo articulo");
    Articulo tercerArticulo=new Articulo(3, "tercer articulo");

    TreeSet<Articulo> ordenararticulos=new TreeSet<Articulo>();

    ordenararticulos.add(tercerArticulo);
    ordenararticulos.add(segundoArticulo);
    ordenararticulos.add(primerArticulo);


    for (Articulo art : ordenararticulos) {
        System.out.println(art.getDescripcion());
    }
    
}
}

class Articulo implements Comparable<Articulo>{

    public Articulo(int num, String desc){
        descripcion=desc;
        numero=num;

    }

    @Override
    public int compareTo(Articulo o) {
        // TODO Auto-generated method stub
        return numero - o.numero;
    }

    public String getDescripcion(){
        return descripcion;
    }

    private String descripcion;    
    private int numero;
    
}

/* TREESET
 * ventajas:
 * 
 * no permiten elementos duplicados
 * usosencillo del metodo add que ademas asegura no elemenos dulicados
 * 
 * incovenientes:
 * 
 * no tienen acceso aleatorios
 * poca eficiencia a la hra de ordenar elementos ( y no siempre se puede)
 * ordena alfabeticamente 
 */