/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pollitopio.business;

/**
 * Clase dedicada a las operaciones del negocio.
 * @author castr
 */
public class Operacion {
    //*esto es un comentario:b*//
    /**
     * Calcula el costo de envio con base a la distancia.
     * 
     * @param distancia La distancia aproximada.
     * @return El costo de envio. 
     */
    public static double envio(double distancia){
        int costoEnvio = 30;
    int distancias[] = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

    for (int i = 0; i < distancias.length; i++) {
        if (distancia <= distancias[i]) {
            return costoEnvio;
        }
        costoEnvio += 30;
    }
    return costoEnvio;
}
    /**
     * Calcula el total a pagar.
     * 
     * @param precio El precio de un producto.
     * @param cantidad La cantidad de un producto.
     * @return El total a pagar.
     */
    public static double total(double precio,int cantidad){
     return precio*cantidad;  
    }
}
