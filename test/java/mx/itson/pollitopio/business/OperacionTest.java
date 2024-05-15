/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.pollitopio.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author darkheaven
 */
public class OperacionTest {
    
    public OperacionTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of envio method, of class Operacion.
     */
    @Test
    public void testEnvio() {
        System.out.println("envio");
        double distancia = 7.2;
        double expResult = 90.0;
        double result = Operacion.envio(distancia);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of total method, of class Operacion.
     */
    @Test
    public void testTotal() {
        System.out.println("total");
        double precio = 110.9;
        int cantidad = 3;
        double expResult = 332.7;
        double result = Operacion.total(precio, cantidad);
        assertEquals(expResult, result, 1);
    }
    
}
