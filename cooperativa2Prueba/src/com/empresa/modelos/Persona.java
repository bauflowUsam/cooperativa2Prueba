package com.empresa.modelos;

public class Persona {
private String nombre;
private String apellido;
private String numeroDocumento;


public String getNombre() {
	return nombre;
}


public Persona() {
	super();
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}


public String getNumeroDocumento() {
	return numeroDocumento;
}


public void setNumeroDocumento(String numeroDocumento) {
	this.numeroDocumento = numeroDocumento;
}


}
