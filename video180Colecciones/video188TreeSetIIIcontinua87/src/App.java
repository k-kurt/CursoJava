/* 
    VIDEO 187

 * hicimos en el video anterior 2 treeset que uno ordenaba los string por defecto, que lo comentamos
 * y el otro treeset que era capaz de almacenar objetos creados por nosotros de tipo acticulos que ese ordenamiento
 * se producia por numero de articulo
 * AHORA en este programa vamos a ordenar por otro criterio, por descipcion, alfabeticamente. 
 * vamos a ver que hacemos si una clase no puede implmentar la interface comparable con el metodo compare to
 * vamos a utilizar otro constructor en la clase treeset el cual admite un argumento de tipo comparator con un
 * metodo compare que no es igual que el compare to
 */

/* VIDEO 188
 * 
la calse articulo sigue implementado la interface Comparator y eso es un problema por que tal vez queremos almacenar objtos que no hemos creado nosotros y que no necesita de dicha interface
Vamos a ver otra forma de programamar lo mismo que antes pero que no implemente la interface comparate

 */

import java.util.*;

public class App {
    public static void main(String[] args) {

        Articulo primerArticulo = new Articulo(1, "primer articulo");
        Articulo segundoArticulo = new Articulo(200, "segundo articulo");
        Articulo tercerArticulo = new Articulo(3, "este es el tercer articulo");

        TreeSet<Articulo> ordenararticulos = new TreeSet<Articulo>();

        ordenararticulos.add(tercerArticulo);
        ordenararticulos.add(segundoArticulo);
        ordenararticulos.add(primerArticulo);

        /*
         * Articulo comparadorArticulo=new Articulo();
         * TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(comparadorArticulo);
         * 
         * vamos a crear un nuevo comparador
         * 
         */


        ComparadorArticulos compara_Art=new ComparadorArticulos();
        TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(compara_Art);

        // VAMOS A CREAR UNA CLASE ANONIMA PARA SIMPLIFCAR CODIGO
        // no haria falta crear la variable compara_Art ni crear la clase ComparadorArticulos 
        
        // TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(new Comparator<Articulo>{
        //     public int compare(Articulo o1, Articulo2){
        //         String desc1=o1.getDescripcion();
        //         String desc2=o2.getDescripcion();

        //         return desc1.copareTo(desc2);
        //     }
        // });

        ordenaArticulos2.add(primerArticulo);
        ordenaArticulos2.add(segundoArticulo);
        ordenaArticulos2.add(tercerArticulo);

        for (Articulo articulo : ordenaArticulos2) {
            System.out.println(articulo.getDescripcion());
        }

    }

}

class Articulo implements Comparable<Articulo> {

    public Articulo(int num, String desc) {
        descripcion = desc;
        numero = num;

    }

    @Override
    public int compareTo(Articulo o) {
        // TODO Auto-generated method stub
        return numero - o.numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private String descripcion;
    private int numero;

}

/* al crear esta clase no obligamos a la calse articulo a implementar los metodos de la interface comparator */

class ComparadorArticulos implements Comparator<Articulo>{

    @Override
    public int compare(Articulo o1, Articulo o2) {
        
        String desc1=o1.getDescripcion();
        String desc2=o2.getDescripcion();

        return desc1.compareTo(desc2);


    }

}




/*
 * TREESET
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