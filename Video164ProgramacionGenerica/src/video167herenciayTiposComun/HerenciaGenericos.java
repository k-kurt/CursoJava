package video167herenciayTiposComun;

public class HerenciaGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * empleado administrativa=new empleado("elena",24,2500); jefe
		 * directorageneral=new jefe("olga",45,4000);
		 * 
		 * empleado nuevoEnpleado=directorageneral;
		 */
		
		parejas<empleado> administrativa=new parejas<empleado>();
		parejas<jefe> supervisor=new parejas<jefe>();
		
		parejas.imprimirTrabajador(administrativa);
		parejas.imprimirTrabajador(supervisor);
		
		
		
		
	}

}
