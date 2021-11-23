package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultarModelo {

	
	private boolean buscarLibro(String nombre) {
		String query = "Select id, name, isbn, autor from libros where name = " + nombre;
		return true;
	}
	
	private boolean buscarLibroLimit(String nombre) {
		String query = "Select id, name, isbn, autor from libros where name = " + nombre + " limit 1";
		return true;
	}
	
}
