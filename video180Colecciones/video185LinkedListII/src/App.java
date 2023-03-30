import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    public static void main(String[] args)  {

        LinkedList<String> paises=new LinkedList<String>();

        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");

         LinkedList<String> capitales=new LinkedList<String>();

        capitales.add("madrid");
        capitales.add("medellin");
        capitales.add("ciudad de mexico");
        capitales.add("lima");

        // System.out.println(paises+"    "+capitales);

        ListIterator<String> iterA=paises.listIterator();
        ListIterator<String> iterB=capitales.listIterator();

        

    }
}
