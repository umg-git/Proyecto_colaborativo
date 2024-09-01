
package com.mycompany.ventas;


public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;
    private int stock;
    
    public Producto(String codigo, String nombre, double precio, int cantidad, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.stock = stock;
    }
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad no puede ser negativa.");
        }
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        stock -= cantidad;
    }

           // aqui para mostrar la información del producto
         public void mostrarInformacion() {
              System.out.println("Código: " + codigo);
                 System.out.println("Nombre: " + nombre);
                    System.out.printf("Precio: $%.2f\n", precio);
                        System.out.println("Cantidad disponible: " + cantidad);
          }

    /// aqui el metoodo para actualizar el stock del producto
    public void actualizarStock(int cantidadVendida) {
            if (cantidadVendida > 0 && cantidadVendida <= stock) {
            stock -= cantidadVendida;
            System.out.println("Stock actualizado. Nueva cantidad: " + stock);
            } else {
                 System.out.println("Cantidad vendida no válida o insuficiente.");
        }    
}
}
