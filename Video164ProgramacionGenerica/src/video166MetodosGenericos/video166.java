package video166MetodosGenericos;

public class video166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String elementos[] = { "jose", "maria", "anuel" };

		// UTILIZAMOS EL METODO GENERICO PARA PASARLE UN OBJETO DE TIPO EMPLEADO3 Y UN
		// ARRAY DE STRING

		String nombres = MisArrays.getElementos(elementos);

		System.out.println(nombres);

		empleado3 listaEmpleados[] = { new empleado3("kevin", 45, 2500), new empleado3("kevin", 45, 2500),
				new empleado3("kevin", 45, 2500), new empleado3("kevin", 45, 2500), new empleado3("kevin", 45, 2500) };

		System.out.println(MisArrays.getElementos(listaEmpleados));

	}

}

class MisArrays {

	public static <T> String getElementos(T[] a) {
		return "el array tiene " + a.length + " elementos";
	}
}