import java.util.*;

 class cuentaUsuario {
    
    public static void main(String[] args) {

        cliente cl1=new cliente("alejandro", "00001", 200000);
        cliente cl2=new cliente("jorge", "00002", 300000);
        cliente cl3=new cliente("milagros", "00003", 350000);
        cliente cl4=new cliente("pajarito", "00004", 180000);


        Set <cliente> cuentaUsuario=new HashSet<cliente>();
            /* esto es programacion generica */


     cuentaUsuario.add(cl1);
     cuentaUsuario.add(cl2);
     cuentaUsuario.add(cl3);
     cuentaUsuario.add(cl4);

        for (cliente cliente : cuentaUsuario) {
            System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+" "+cliente.getSaldo());
        }
    }
}
