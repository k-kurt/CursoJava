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
        capitales.add("bogota");
        capitales.add("ciudad de mexico");
        capitales.add("lima");

        // System.out.println(paises+"    "+capitales);

// 
// agregar las capitales a la coleccion de paises
//         
        ListIterator<String> iterA=paises.listIterator();
        ListIterator<String> iterB=capitales.listIterator();

        
        while(iterB.hasNext()){
            if (iterA.hasNext()) {
                iterA.next();
            }
            iterA.add(iterB.next());
        }
        System.out.println(paises);
// 
//  eliminar las capitales e las posiciones par
//         
        iterB=capitales.listIterator(); //volver el iterador al comienzo 

        while(iterB.hasNext()){
            iterB.next();
            if(iterB.hasNext()){
                iterB.next();
                iterB.remove();
            }
        }
        System.out.println(capitales);

// 
// eliminar las que coinciden en la coleccion capitales
// 

        paises.removeAll(capitales);
        System.out.println(paises);

    }

    

    

}
