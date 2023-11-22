package trabajoAdicional;

public class Libro 
{
	private String nombre = new String();
	private Autor autor = new Autor();
	private double precio;
	private int cantidad;
	
	public Libro(String nombre, Autor autor, double precio, int cantidad) 
	{
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public Libro()
	{}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public Autor getAutor() 
	{
		return autor;
	}

	public void setAutor(Autor autor) 
	{
		this.autor = autor;
	}

	public double getPrecio() 
	{
		return precio;
	}

	public void setPrecio(double precio)
	{
		this.precio = precio;
	}

	public int getCantidad() 
	{
		return cantidad;
	}

	public void setCantidad(int cantidad) 
	{
		this.cantidad = cantidad;
	}

	@Override
	public String toString() 
	{
		return nombre + " | By: " + this.autor.toString();
	}	
}