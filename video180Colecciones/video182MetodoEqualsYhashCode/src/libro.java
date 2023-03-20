public class Libro {

    public Libro(String titulo,String autor, int ISBN){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
    }
    


public String getDatos(){
    return "El titulo de Libro: "+titulo+". El autor es: "+autor+". Y el ISBN es: "+ ISBN;
}

public boolean equals(Object obj){
    if(obj instanceof Libro){/* instanceof es para ver si el objeto pertenece a la instancia de la clase */
     Libro otro= (Libro)obj;/* instanciamos una variable donde guardamos el casing del parametro obj */
        if(this.ISBN==otro.ISBN){
            return true;
        }else{
            return false;
        }
    }else{
        return false;
    }
}

private String titulo;
private String autor;
private int ISBN;

}
 