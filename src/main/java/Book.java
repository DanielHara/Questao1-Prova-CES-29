package main.java;

public class Book {

	String titulo;
	
	public Book (String _titulo)
	{
		titulo = _titulo;
	}
	
	public boolean hasTitle (String _titulo)
	{
		return (titulo.compareTo(_titulo) == 0);
	}
}
