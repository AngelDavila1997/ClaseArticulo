/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author PC
 */
public class Articulo {
    //Declaración de variables
    public int sku;
    protected int existencia;
    protected double precio;
    protected double costo;
    public String descripcion;
    //Constructor
    //Se inicializan los atributos de la clase
    public Articulo(int sku, int existencia, double precio, double costo, String descripcion){
        this.sku = sku;
        this.existencia = existencia;
        this.precio = precio;
        this.costo = costo;
        this.descripcion= descripcion;
    }
    public Articulo(){//Este constructor llama al otro constructor para predefinir los datos de la cuenta
        this(1, 0, 1.00, 0.00, "SinDescripcion");
    }
    
    //get y set
    public int getSku(){
        return this.sku;
    }
    public void setSku(int sku){
        this.sku = sku;
    }
    public int getExistencia(){
        return this.existencia;
    }
    public void setExistencia(int existencia){
        this.existencia = existencia;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double getCosto(){
        return this.costo;
    }
    public void setCosto(double costo){
        this.costo = costo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    //Metodos
    //compra modifica la existencia y el costo del producto
    public void compra(int articulosComprados, double costo){
        this.existencia += articulosComprados;
        this.costo = costo;
    }
    //venta verifica la existencia antes de restar existencias y devuelve 
    //un valor booleano que verifica si se realiza la venta
    public boolean venta(int cantidadVenta){
        //El ciclo verifica que existan articulos a los que se les pueda
        //restar la cantidad vendida
        if (existencia >= cantidadVenta){
            this.existencia -= cantidadVenta;
            return true;
        }else{
            System.out.println("Existencia insuficiente. No se puede realizar la venta.");
            return false;
        }
    }
    //verificarExistencia devuelve el valor del atributo existencia
    public int verificarExistencia(){
        return this.existencia;
    }
    //actualizaPrecio modifica el atributo precio
    public void actualizaPrecio(double precio){
        this.precio = precio;
        System.out.println("El precio cambio a "  + precio);
    }
}
    
