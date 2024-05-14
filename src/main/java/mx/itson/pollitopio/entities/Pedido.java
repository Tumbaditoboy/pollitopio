/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pollitopio.entities;

/**
 *
 * @author castr
 */
public class Pedido {

    /**
     * @return the establecimiento
     */
    public Establecimiento getEstablecimiento() {
        return establecimiento;
    }

    /**
     * @param establecimiento the establecimiento to set
     */
    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the orden
     */
    public Orden getOrden() {
        return orden;
    }

    /**
     * @param orden the orden to set
     */
    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    
    private Establecimiento establecimiento;
    private Cliente cliente;
    private Orden orden;
}
