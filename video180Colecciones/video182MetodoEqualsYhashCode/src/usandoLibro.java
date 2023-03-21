public class usandoLibro {
    public static void main(String[] args){
     
        Libro libro1=new Libro("java por kevin","kevin", 25);
        Libro libro2=new Libro("java por kevin","kevin", 25);
        libro1=libro2;

        if(libro1.equals(libro2)){/* ahora funciona por que fue modificado en la clase Libro */
            System.out.println("son iguales");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }else{
            System.out.println("no son iguales");
        }
        System.out.println(libro1.hashCode());
        System.out.println(libro2.hashCode());

    }
}
