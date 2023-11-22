package trabajoAdicional;

public class Autor 
{
	private String nombreCompleto = new String();
	private String email = new String();
	private char genero;
	
	public Autor(String nombreCompleto, String email, char genero) 
	{
		this.nombreCompleto = nombreCompleto;
		this.email = email;
		this.genero = genero;
	}
	
	public Autor()
	{}

	public String getNombreCompleto() 
	{
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) 
	{
		this.nombreCompleto = nombreCompleto;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public char getGenero() 
	{
		return genero;
	}

	public void setGenero(char genero) 
	{
		this.genero = genero;
	}

	@Override
	public String toString() 
	{
		return nombreCompleto + "(" + genero + ")" + ". Email: " + email;
	}
}