import java.util.*;

 class cuentaUsuario {
    
    public static void main(String[] args) {

        cliente cl1=new cliente("alejandro", "00001", 200000);
        cliente cl2=new cliente("jorge", "00002", 300000);
        cliente cl3=new cliente("milagros", "00003", 350000);
        cliente cl4=new cliente("pajarito", "00004", 180000);
        cliente cl5=new cliente("pajarito", "00004", 180000);

        /* no agrega al ultimo por que utilizamos el equal y el hascode para diferenciar los usuarios por n de cuenta */


        Set <cliente> cuentaUsuario=new HashSet<cliente>();
            /* esto es programacion generica */
            /* HashSet contiene un conjunto de objetos, pero de una manera que le permite determinar fácil y rápidamente si un objeto ya está en el conjunto o no.
             Lo hace administrando internamente una matriz y almacenando el objeto utilizando un índice que se calcula a partir del código hash del objeto. */

 
     cuentaUsuario.add(cl1);
     cuentaUsuario.add(cl2);
     cuentaUsuario.add(cl3);
     cuentaUsuario.add(cl4);
     cuentaUsuario.add(cl5);
       
     /* ----------------------------------------------------------------------------------------------------------------------------------------------------------- */
    //  for (cliente cliente : cuentaUsuario) { 
            
    //         if (cliente.getNombre().equals("milagros")) {
    //             cuentaUsuario.remove(cliente);
    //         }
    //         }
            /* No se remover un objeto cuando se esta iterando a la vez para eso usamos un iterador, a continuacion... */

    Iterator<cliente>it=cuentaUsuario.iterator();

    while(it.hasNext()){
        String nombre_de_usuario=it.next().getNombre();
        if(nombre_de_usuario.equals("milagros")){
            it.remove();
        }
    }


    for (cliente cliente : cuentaUsuario) {
        System.out.println(cliente.getNombre());
    }


     /* ----------------------------------------------------------------------------------------------------------------------------------------------------------- */


      /* ----------------------------------------------------------------------------------------------------------------------------------------------------------- */
     
     for (cliente cliente : cuentaUsuario) { 
            System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+" "+cliente.getSaldo());
        }


        Iterator<cliente>it2=cuentaUsuario.iterator();
        while (it2.hasNext()) {
            String Nombre_Cliente=it2.next().getNombre();
            System.out.println(Nombre_Cliente);

    //         String N_cuenta_cliente=it.next().getN_cuenta();/* Se puede usar pero solo mostrara los datos de 2 objetos por que cada vez que se utiliza el .next() se salta al siguiente objeto */
    //         System.out.println(N_cuenta_cliente);
    //     }
         /* ----------------------------------------------------------------------------------------------------------------------------------------------------------- */
        


    }
}
}
