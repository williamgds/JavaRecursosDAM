
public class Persona {
	
	private String nombre, correoElectronico;
	
	public Persona()
	{
		this.nombre = "";
		this.correoElectronico = "";
	}
	
	public Persona(String nombre,String email)
	{
		this.nombre = nombre;
		this.correoElectronico = email;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public String getCorreoElectronico()
	{
		return this.correoElectronico;
	}
	
	public void setNombre(String n)
	{
		this.nombre = n;
	}
	
	public void setCorreoElectronico(String c)
	{
		this.correoElectronico = c;
	}
	
	public void imprimirTodosLosAtributos()
	{
		System.out.println("\nAtributos: "+ this.nombre + " " + this.correoElectronico);
	}
}

