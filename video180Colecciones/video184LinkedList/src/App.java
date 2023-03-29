import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<String> personas=new LinkedList<String>();
        personas.add("pablo");
        personas.add("kevin");
        personas.add("lautaro");
        personas.add("luis");

        ListIterator<String> it=personas.listIterator();
        it.next();
        it.add("juan");
        for (String persona : personas) {
            System.out.println(persona);
        }

    }
}
