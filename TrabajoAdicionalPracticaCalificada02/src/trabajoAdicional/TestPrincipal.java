package trabajoAdicional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestPrincipal 
{
	public static void main(String[] args) 
	{
		/*----AUTORES----*/

		Autor autor01 = new Autor("Gabriel García Márquez", "gabrielgarcia@gmail.com", 'm');
		Autor autor02 = new Autor("J. R. R. Tolkien", "jrrtolkien@email.com", 'm');
		Autor autor03 = new Autor("George Orwell", "georgeorwell@email.com", 'm');
		Autor autor04 = new Autor("Aldous Huxley", "aldoushuxley@email.com", 'm');
		Autor autor05 = new Autor("Jane Austen", "janeausten@email.com", 'f');
		Autor autor06 = new Autor("Fiódor Dostoyevski", "fiodordostoyrvski@email.com", 'm');
		Autor autor07 = new Autor("Vladimir Nabokov", "vladimirnabokov@email.com", 'm');
		Autor autor08 = new Autor("James Joyce", "jamesjoyce@email.com", 'm');
		Autor autor09 = new Autor("Gustave Flaubert", "gustaveflaubert@email.com", 'm');
		Autor autor10 = new Autor("Marcel Proust", "marcelproust@email.com", 'm');
		Autor autor11 = new Autor("Miguel de Cervantes", "miguelcervantes@email.com", 'm');
		Autor autor12 = new Autor("Oscar Wilde", "oscarwilde@email.com", 'm');
		Autor autor13 = new Autor("Antoine de Saint-Exupéry", "antoinesaint@email.com", 'm');
		Autor autor14 = new Autor("William Faulkner", "williamfaulkner@email.com", 'm');
		Autor autor15 = new Autor("Jonathan Swif", "jonathanswif@email.com", 'm');
		Autor autor16 = new Autor("Arthur Golden", "arthurgolden@email.com", 'm');
		Autor autor17 = new Autor("Suzanne Collins", "suzannecollins@email.com", 'f');
		Autor autor18 = new Autor("J. K. Rowling", "jkrowling@email.com", 'f');
		Autor autor19 = new Autor("Victor Hugo", "victorhug@email.com", 'm');
		Autor autor20 = new Autor("C. S. Lewis", "cslewis@eamil.com", 'm');
		
		/*----LIBROS----*/
		
		Libro libro01 = new Libro("Cien años de soledad", autor01, 200.00, 400);
		Libro libro02 = new Libro("El señor de los anillos (Trilogía)", autor02, 1500.00, 1200);
		Libro libro03 = new Libro("1984", autor03, 500.00, 300);
		Libro libro04 = new Libro("Un mundo feliz", autor04, 320.00, 500);
		Libro libro05 = new Libro("Orgullo y prejuicio", autor05, 130.00, 700);
		Libro libro06 = new Libro("Crimen y castigo", autor06, 230.00, 540);
		Libro libro07 = new Libro("Lolita", autor07, 140.00, 456);
		Libro libro08 = new Libro("Ulises", autor08, 158.00, 400);
		Libro libro09 = new Libro("Madame Bovary", autor09, 120.00, 430);
		Libro libro10 = new Libro("En busca del tiempo perdido", autor10, 345.00, 450);
		Libro libro11 = new Libro("Don Quijote de la Mancha", autor11, 340.00, 123);
		Libro libro12 = new Libro("El retrato de Dorian Gray", autor12, 125.00, 67);
		Libro libro13 = new Libro("El Principito", autor13, 259.00, 345);
		Libro libro14 = new Libro("El ruido y la furia", autor14, 134.00, 246);
		Libro libro15 = new Libro("Los viajes de Gulliver", autor15, 186.00, 234);
		Libro libro16 = new Libro("Memorias de una geisha", autor16, 195.00, 234);
		Libro libro17 = new Libro("Los juegos del hambre", autor17, 181.00, 234);
		Libro libro18 = new Libro("Harry Potter y la piedra filosofal", autor18, 650.00, 4000);
		Libro libro19 = new Libro("Los miserables", autor19, 23.00, 245);
		Libro libro20 = new Libro("Las crónicas de Narnia", autor20, 456.00, 444);
		
		/*---LISTA DE LIBROS----*/
		
		ArrayList<Libro> listaLibros = new ArrayList<Libro>();
		listaLibros.add(libro01);
		listaLibros.add(libro02);
		listaLibros.add(libro03);
		listaLibros.add(libro04);
		listaLibros.add(libro05);
		listaLibros.add(libro06);
		listaLibros.add(libro07);
		listaLibros.add(libro08);
		listaLibros.add(libro09);
		listaLibros.add(libro10);
		listaLibros.add(libro11);
		listaLibros.add(libro12);
		listaLibros.add(libro13);
		listaLibros.add(libro14);
		listaLibros.add(libro15);
		listaLibros.add(libro16);
		listaLibros.add(libro17);
		listaLibros.add(libro18);
		listaLibros.add(libro19);
		listaLibros.add(libro20);
		
		/*----CODIGO----*/
		
		int numeroLibro = 0;
		int opcionMP;
		
		Scanner entrada = new Scanner(System.in);

		for(int contador = 0; contador < listaLibros.size(); contador++)
		{
			numeroLibro = contador + 1;
			
			System.out.println(numeroLibro + " ---> " + listaLibros.get(contador).toString());
		}
		
		System.out.println("");
		System.out.println("QUE DESEA HACER?");
		System.out.println("1 ---> Mostrar libros");
		System.out.println("2 ---> Agregar un libro y su autor");
		System.out.println("3 ---> Eliminar libro");
		System.out.println("4 ---> Editar libro");
		System.out.println("5 ---> Buscar libro por titulo");
		System.out.println("6 ---> Buscar autor por libro");
		System.out.println("7 ---> Ordenar libros por autor");
		System.out.println("");
		
		System.out.println("Ingrese la opcion: ");
		opcionMP = entrada.nextInt();
		
		switch(opcionMP)
		{
			case 1:
			{
				System.out.println("");
				
				System.out.println("----MOSTRAR LIBROS----");
				
				for(int contador = 0; contador < listaLibros.size(); contador++)
				{
					numeroLibro = contador + 1;
					
					System.out.println(numeroLibro + " ---> " + listaLibros.get(contador).toString());
				}
				
				System.out.println("");
				break;
			}
			
			case 2:
			{
				String nombreNA = new String();
				String emailNA = new String();
				String nombreNL = new String();
				String generoNA = new String();
				
				char generoNAFinal = ' ';
				
				int cantidadNL  = 0;
				
				double precioNL = 0.00;
				
				System.out.println("");
				
				System.out.println("----AGREGAR LIBRO Y SU AUTOR----");
				
				System.out.println("Ingrese el nombre del autor: ");
				entrada.nextLine();
				nombreNA = entrada.nextLine();
				
				System.out.println("Ingrese el email del autor: ");
				emailNA = entrada.next();
				
				System.out.println("Ingrese el genero del autor: ");
				System.out.println("m ---> Masculino");
				System.out.println("f ---> Femenino");
				generoNA = entrada.next();
				generoNAFinal = generoNA.charAt(0);
				
				Autor nuevoAutor = new Autor(nombreNA, emailNA, generoNAFinal);
				
				System.out.println("Ingrese el nombre del libro: ");
				entrada.nextLine();
				nombreNL = entrada.nextLine();
				
				System.out.println("Ingrese el precio del libro: ");
				precioNL = entrada.nextDouble();
						
				System.out.println("Ingrese la cantidad (Stock) del libro: ");
				cantidadNL = entrada.nextInt();
				
				Libro nuevoLibro = new Libro(nombreNL, nuevoAutor, precioNL, cantidadNL);
				listaLibros.add(nuevoLibro);
				
				System.out.println("Libro agregado.");
				System.out.println("");
				break;
			}
			
			case 3:
			{
				String nombreLE = new String();
				
				Libro libroEliminar = new Libro();
				
				System.out.println("");
				
				System.out.println("----ELIMINAR LIBRO----");
				
				System.out.println("Ingrese el nombre del libro que va a eliminar: ");
				entrada.nextLine();
				nombreLE = entrada.nextLine();
				
				for(Libro libro : listaLibros)
				{
					if(nombreLE.equalsIgnoreCase(libro.getNombre()))
					{
						libroEliminar = libro;
						break;
					}
				}
				
				if(libroEliminar != null)
				{
					listaLibros.remove(libroEliminar);
					System.out.println("Libro eliminado.");
					System.out.println("");
					
				}
				
				break;
			}
			
			case 4:
			{
				int opcionME = 0;
				int cantidadM = 0;
				int  contador1 = 0;
				
				double precioM = 0.00;
				
				String nombreM = new String();
				String nombreB = new String();
				
				boolean salirBuscar = false;
				
				System.out.println("");
				
				System.out.println("----EDITAR LIBRO----");
				
				
				System.out.println("Ingrese el nombre del libro que va a eliminar: ");
				entrada.nextLine();
				nombreB = entrada.nextLine();
				
				do
				{
					if(nombreB.equalsIgnoreCase(listaLibros.get(contador1).getNombre()))
					{
						salirBuscar = true;
					}
					
					contador1++;
				}
				while(salirBuscar == false || contador1 > listaLibros.size());
				
				if(salirBuscar == true) 
				{
					System.out.println("QUE DESEA MODIFICAR?");
					System.out.println("1 ---> Nombre");
					System.out.println("2 ---> Precio");
					System.out.println("3 ---> Cantidad");
					
					System.out.println("");
					
					System.out.println("Ingrese la opcion: ");
					opcionME = entrada.nextInt();
						
					switch(opcionME)
					{
						case 1:
						{
							System.out.println("Ingrese el nuevo nombre: ");
							entrada.nextLine();
							nombreM = entrada.nextLine();
							listaLibros.get(contador1 - 1).setNombre(nombreM);
							System.out.println("Libro modificado con exito.");
							System.out.println("");
							break;
						}
						
							case 2:
						{
							System.out.println("Ingrese el nuevo precio: ");
							precioM = entrada.nextDouble();
							listaLibros.get(contador1 - 1).setPrecio(precioM);
							System.out.println("Libro modificado con exito.");
							System.out.println("");
							break;	
						}
						
						case 3:
						{
							System.out.println("Ingrese la nueva cantidad: ");
							cantidadM = entrada.nextInt();
							listaLibros.get(contador1 - 1).setCantidad(cantidadM);
							System.out.println("Libro modificado con exito.");
							System.out.println("");
							break;
						}
						
						default:
						{
							System.out.println("ERROR. OPCION INVALIDA");
							break;
						}
					}
				}
				
				else
				{
					System.out.println("Libro no encontrado.");
					System.out.println("");
				}
				
				break;
			}
				
			
			case 5:
			{
				String nombreB1 = new String();
				
				System.out.println("");
				System.out.println("----BUSCAR LIBRO----");
				
				System.out.println("Ingrese el nombre del libro: ");
				entrada.nextLine();
				nombreB1 = entrada.nextLine();
				
				for(Libro libro : listaLibros)
				{
					if(nombreB1.equalsIgnoreCase(libro.getNombre()))
					{
						System.out.println("");
						System.out.println("Libro encontrado: ");
						System.out.println(libro.toString());
						System.out.println("");
						break;
					}
				}
				
				break;
			}
			
			case 6:
			{
				String nombreB2 = new String();
				
				Libro libroReferencia = new Libro();
				
				System.out.println("");
				System.out.println("----BUSCAR AUTOR POR LIBRO----");
				
				System.out.println("Ingrese el nombre del libro: ");
				entrada.nextLine();
				nombreB2 = entrada.nextLine();
				
				for(Libro libro : listaLibros)
				{
					if(nombreB2.equalsIgnoreCase(libro.getNombre()))
					{
						libroReferencia = libro;
						break;
					}
				}
				
				System.out.println("El autor del libro " + nombreB2 + " es: ");
				System.out.println(libroReferencia.getAutor().toString());
				System.out.println("");
				
				break;
			}
			
			case 7:
			{
				ArrayList<Libro> librosOrdenadosAutor = new ArrayList<Libro>();
				ArrayList<String> apellidosAutores = new ArrayList<String>();
				
				String apellidoAutor1 = new String();
				String[] noSeComoNombrarEsto1 = new String[1];
				
				System.out.println("");
				
				System.out.println("----MOSTRAR LIBROS POR AUTORES----");
				
				System.out.println("");
				
				for(Libro libro : listaLibros)
				{
					noSeComoNombrarEsto1 = libro.getAutor().getNombreCompleto().split(" ");
					apellidoAutor1 = noSeComoNombrarEsto1[1];
					apellidosAutores.add(apellidoAutor1);
				}
				
				Collections.sort(apellidosAutores);
				
				for (String apellido : apellidosAutores) 
				{
				    for (Libro libro : listaLibros) 
				    {
				        String apellidoAutor = libro.getAutor().getNombreCompleto().split(" ")[1];
				        if (apellido.equals(apellidoAutor) && !librosOrdenadosAutor.contains(libro)) 
				        {
				            librosOrdenadosAutor.add(libro);
				        }
				    }
				}
				
				for(int contador = 0; contador < librosOrdenadosAutor.size(); contador++)
				{
					numeroLibro = contador + 1;
					
					System.out.println(numeroLibro + " ---> " + librosOrdenadosAutor.get(contador).toString());
				}
				
				System.out.println("");
				
				break;
			}
			
			default:
			{
				System.out.println("ERROR. OPCION INVALIDA.");
				break;
			}
		}
		
		for(int contador = 0; contador < listaLibros.size(); contador++)
		{
			numeroLibro = contador + 1;
			
			System.out.println(numeroLibro + " ---> " + listaLibros.get(contador).toString());
		}
		
		entrada.close();
		
		/*
		----MENSAJE----
		Hola profesora
		Me disculpo por no utilizar bucles en este programa
		No hay validación de datos
		Tampoco hay try-catch
		Intentar hacer todo eso junto siempre me salía mal
		Aun no soy lo suficiente bueno
		Me faltan algunos tutoriales
		Mis mas sinceras disculpas por eso
		Espero que pueda comprenderlo
		Raul
		 */
	}
}