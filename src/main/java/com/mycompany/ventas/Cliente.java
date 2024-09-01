
package com.mycompany.ventas;


public class Cliente {
    	private String _nombre = "";
	private String _apellido = "";
	private String _nit = "";
	private String _telefono = "";
	
	
    public Cliente(String nombre, String apellido, String nit, String telefono) {
	_nombre = nombre;
	_apellido = apellido;
	_nit = nit;
	_telefono = telefono;
    }
    
    	public String get_nombre() {
		return _nombre;
	}


	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}


	public String get_apellido() {
		return _apellido;
	}


	public void set_apellido(String _apellido) {
		this._apellido = _apellido;
	}


	public String get_nit() {
		return _nit;
	}


	public void set_nit(String _nit) {
		this._nit = _nit;
	}


	public String get_telefono() {
		return _telefono;
	}


	public void set_telefono(String _telefono) {
		this._telefono = _telefono;
	}
}
