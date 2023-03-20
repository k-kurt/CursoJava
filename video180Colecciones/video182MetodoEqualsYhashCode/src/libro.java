public class libro {

    public libro(String titulo,String autor, int ISBN){

    }
    
private String titulo;
private String autor;
private int ISBN;

public String getDatos(){
    return "El titulo de libro: "+titulo+". El autor es: "+autor+". Y el ISBN es: "+ ISBN;
}

public boolean equals(Object obj){
    if(obj instanceof libro){/* instanceof es para ver si el objeto pertenece a la instancia de la clase */
        libro otro=(libro)obj;/* instanciamos una variable donde guardamos el casing del parametro obj */
        if(this.ISBN==otro.ISBN){
            return true;
        }else{
            return false;
        }
    }else{
        return false;
    }
}

}
 