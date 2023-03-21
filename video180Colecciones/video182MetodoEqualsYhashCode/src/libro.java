public class Libro {

    public Libro(String titulo,String autor, int ISBN){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
    }
    


public String getDatos(){
    return "El titulo de Libro: "+titulo+". El autor es: "+autor+". Y el ISBN es: "+ ISBN;
}

// public boolean equals(Object obj){
//     if(obj instanceof Libro){/* instanceof es para ver si el objeto pertenece a la instancia de la clase */
//      Libro otro= (Libro)obj;/* instanciamos una variable donde guardamos el casing del parametro obj */
//         if(this.ISBN==otro.ISBN){
//             return true;
//         }else{
//             return false;
//         }
//     }else{
//         return false;
//     }
// }



/* aca hice de todas las variables pero el importante era el ISBN */

private String titulo;
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
    result = prime * result + ((autor == null) ? 0 : autor.hashCode());
    result = prime * result + ISBN;
    return result;
}



@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Libro other = (Libro) obj;
    if (titulo == null) {
        if (other.titulo != null)
            return false;
    } else if (!titulo.equals(other.titulo))
        return false;
    if (autor == null) {
        if (other.autor != null)
            return false;
    } else if (!autor.equals(other.autor))
        return false;
    if (ISBN != other.ISBN)
        return false;
    return true;
}

private String autor;
private int ISBN;

}
 