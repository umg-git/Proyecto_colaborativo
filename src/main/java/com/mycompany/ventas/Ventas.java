
package com.mycompany.ventas;
import java.util.Scanner;

public class Ventas {

    private static void mensaje(String cadena){
        System.out.println(cadena);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nombre = "Tadeo";
	String apellido = "Almanza";
	String nit = "101050";
	String telefono = "87654321";
        
        String codigo = "001";
        String producto = "Camisa";
        double precio = 100;
        int stock=20;
        int cantidad = 1;
        
        Cliente objC = new Cliente(nombre,apellido,nit,telefono);
        Producto objP = new Producto(codigo,producto,precio,cantidad, stock);
        mensaje("Bienvenio al sistema.");
        
        mensaje("El cliente: " + objC.get_nombre() + " " + objC.get_apellido());
        mensaje("Ha comprado una comprado " + objP.getNombre() + " código: " + objP.getCodigo());
        mensaje("NIT: "+objC.get_nit());
        mensaje("Telefono: "+objC.get_telefono());
        mensaje("Precio: " + objP.getPrecio());
        objP.actualizarStock(cantidad);

    }
    
    
    
}
