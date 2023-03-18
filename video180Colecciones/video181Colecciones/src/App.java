public class App {
    public static void main(String[] args) throws Exception {
     
        libro libro1=new libro("java por kevin", "kevin", 25);
        libro libro2=new libro("java por kevin", "kevin", 25);

        if (libro1.equals(libro2)) {/* el metodo equals no funciona cuando se trata de una clase particular */
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }

    }
}
