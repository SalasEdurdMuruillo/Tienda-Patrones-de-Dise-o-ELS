/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Catalogo;

/**
 *
 * @author Luisf
 */
public class ProductoBuilder {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private Categoria categoria;
    
    public ProductoBuilder codigo(String codigo){ this.codigo = codigo; return this; }
    public ProductoBuilder nombre(String nombre){ this.nombre = nombre; return this; }
    public ProductoBuilder precio(double precio){ this.precio = precio; return this; }
    public ProductoBuilder stock(int stock){ this.stock = stock; return this; }
    public ProductoBuilder categoria(Categoria categoria){ this.categoria = categoria; return this; }

    public Producto build(){
        return new Producto(codigo, nombre, precio, stock, categoria);
    }
}
