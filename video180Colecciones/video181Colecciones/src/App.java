public class usandoLibro {
    public static void main(String[] args) throws Exception {
     
        Libro libro1=new Libro("java por kevin", "kevin", 25);
        Libro libro2=new Libro("java por kevin", "kevin", 25);

        if (libro1.equals(libro2)) {/* el metodo equals no funciona cuando se trata de una clase particular */
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }

    }
}
