public class App {
    public static void main(String[] args) throws Exception {
     
        libro libro1=new libro("java por kevin", "kevin", 24);
        libro libro2=new libro("java por kevin", "kevin", 25);

        if(libro1.equals(libro2)){/* ahora funciona por que fue modificado en la clase libro */
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }

    }
}
