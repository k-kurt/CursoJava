public class usandoLibro {
    public static void main(String[] args){
     
        Libro libro1=new Libro("java por kevin","kevin", 24);
        Libro libro2=new Libro("java por kevin","kevin", 25);

        if(libro1.equals(libro2)){/* ahora funciona por que fue modificado en la clase Libro */
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }

    }
}
