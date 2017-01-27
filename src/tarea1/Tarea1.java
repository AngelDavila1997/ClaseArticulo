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
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de objetos
        Articulo miArticulo = new Articulo(); 
        Articulo miOtroArticulo = new Articulo(2, 3, 25.00, 10.00, "Articulo1");
        //Muestra la informacion del objeto "miArticulo"
        prueba(miArticulo);
        //Muestra la informacion del objeto "miOtroArticulo" que contiene valores predeterminados
        prueba(miOtroArticulo);
        
        //Demostracion de metodos de la clase
        //Se comprara 1 articulo y se cambiara el costo a 24
        miOtroArticulo.compra(1, 14.00);
        //Se verifica la existencia despues de la compra (habia 3, ahora 4)
        miOtroArticulo.verificarExistencia();
        //Muestra el nuevo costo
        System.out.println("nuevo costo = " + miOtroArticulo.getCosto());
        //Se vendera 1 articulo
        miOtroArticulo.venta(1);
        //Se verifica la existencia despues de la compra (habia 4, ahora 3)
        miOtroArticulo.verificarExistencia();
        //Se venderan 12 articulos (como no hay suficientes se muestra un mensaje)
        miOtroArticulo.venta(12);
        //Se actualiza el precio del articulo
        miOtroArticulo.actualizaPrecio(18.00);
    }
    public static void prueba (Articulo a){
        System.out.println("sku = " + a.getSku());
        System.out.println("existencia = " + a.getExistencia());
        System.out.println("precio = " + a.getPrecio());
        System.out.println("costo = " + a.getCosto());
        System.out.println("descripcion = " + a.getDescripcion());
    }
}
