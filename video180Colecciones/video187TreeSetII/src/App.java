/* 
 * hicimos en el video anterior 2 treeset que uno ordenaba los string por defecto, que lo comentamos
 * y el otro treeset que era capaz de almacenar objetos creados por nosotros de tipo acticulos que ese ordenamiento
 * se producia por numero de articulo
 * AHORA en este programa vamos a ordenar por otro criterio, por descipcion, alfabeticamente. 
 * vamos a ver que hacemos si una clase no puede implmentar la interface comparable con el metodo compare to
 * vamos a utilizar otro constructor en la clase treeset el cual admite un argumento de tipo comparator con un
 * metodo compare que no es igual que el compare to
 */


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
    Articulo tercerArticulo=new Articulo(3, "este es el tercer articulo");

    TreeSet<Articulo> ordenararticulos=new TreeSet<Articulo>();

    ordenararticulos.add(tercerArticulo);
    ordenararticulos.add(segundoArticulo);
    ordenararticulos.add(primerArticulo);

/* 
    for (Articulo art : ordenararticulos) {
        System.out.println(art.getDescripcion());
    } */
    
    
    Articulo comparadorArticulo=new Articulo();
    TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(comparadorArticulo);

    ordenaArticulos2.add(primerArticulo);
    ordenaArticulos2.add(segundoArticulo);
    ordenaArticulos2.add(tercerArticulo);

    for (Articulo articulo : ordenaArticulos2) {
        System.out.println(articulo.getDescripcion());
    }

}

}

class Articulo implements Comparable<Articulo>, Comparator<Articulo>{

    public Articulo(){

    }

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


    @Override
    public int compare(Articulo o1, Articulo o2) {
    
        String descipsionA=o1.getDescripcion();
        String descripcionB=o2.getDescripcion();

        return descipsionA.compareTo(descripcionB);
    }
    
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
 * 
 * video 186 terminado, me equivoque en el commit
 */