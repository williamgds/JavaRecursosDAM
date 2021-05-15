import java.util.Scanner;

public class ControladorPersonas 
{
	Persona arrayDePersonas[] = new Persona[5];
	String nombre, correoElectronico;

	private static String validarEntrada(String msg, Scanner tec)
	{
		String entrada = "";
		do
		{
			System.out.println(msg);
			entrada = tec.nextLine();
		}	while(entrada.isEmpty());
		return entrada;
	}
	public static boolean tieneCaracter(String texto, char caracter)
	{
		for (int i = 0; i < texto.length(); i++) {
			if(caracter == texto.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	public void consultarMailConNombre()
	{
		Scanner OtroTeclado = new Scanner(System.in);
		String nomb = validarEntrada("\nEscriba el nombre de la persona que busca: ", OtroTeclado);
		String nombreQueBuscas;
		Boolean encontrado = false;
		for (int i=0; i < arrayDePersonas.length; i++) {
			nombreQueBuscas = arrayDePersonas[i].getNombre();
			if(nombreQueBuscas.equalsIgnoreCase(nomb)) {
				encontrado = true;
				System.out.println("\nEl correo de " + nomb + " es " + arrayDePersonas[i].getCorreoElectronico());
				break;
			}
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado a la persona que buscaba.");
		}
	}
	
	public void devolverCorreosElectronicosSinArroba() {
		String mail;
		System.out.println("\nCorreos sin arroba: ");
		for (int i=0; i < arrayDePersonas.length; i++) {
			mail = arrayDePersonas[i].getCorreoElectronico();
			if(!tieneCaracter(mail,'@')) {
				System.out.println(mail);
			}
		}
	}
	public void imprimirFraseSeparadaPorLineas() {
		String frase = "";
		Scanner NuevoTeclado = new Scanner(System.in);
		String[] arrayFrase;
		frase = validarEntrada("\nIntroducir frase para separar", NuevoTeclado);
		if(frase.equals("")) {
			System.out.println("¡No puede estar vacía la frase!");
		} else {
			arrayFrase = frase.split("\\s+");
			System.out.println("\nSeparando frase...");
			for (int i = 0; i < arrayFrase.length; i++) {
				System.out.println(arrayFrase[i]);
			}
		}
		NuevoTeclado.close();

	}
	public void init()
	{
		Scanner Teclado = new Scanner(System.in);
		for (int i=0; i < arrayDePersonas.length; i++)
		{
			System.out.println("Por favor, introduzca los datos de la persona nº " + (i+1));
			nombre = validarEntrada("Introducir nombre: ", Teclado);
			correoElectronico = validarEntrada("Correo electrónico: ", Teclado);
			arrayDePersonas[i] = new Persona(nombre,correoElectronico);
			arrayDePersonas[i].imprimirTodosLosAtributos();
			System.out.println("\n");
		}
		System.out.println("Personas creadas con éxito");
	}
	
}
