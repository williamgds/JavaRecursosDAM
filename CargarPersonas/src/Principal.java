
public class Principal 
{
	public static void main(String[] args)
	{
		ControladorPersonas cp = new ControladorPersonas();
		cp.init();
		cp.devolverCorreosElectronicosSinArroba();
		cp.consultarMailConNombre();
		cp.imprimirFraseSeparadaPorLineas();
	}
}

