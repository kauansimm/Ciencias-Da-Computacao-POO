/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Entidades;

import Entidades.Enum.DiaDaSemana;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kauan
 */
public class IngressoCinemaTest {
    
    public IngressoCinemaTest() {
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
    
    @Test
    public void testPrecoCinemaSegunda(){
        IngressoCinema instanceSegunda = new IngressoCinema(DiaDaSemana.SEGUNDA, true);
        Double expResult = 10.5;
        Double result = instanceSegunda.precoCinema();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPrecoCinemaQuarta(){
        IngressoCinema instanceQuarta = new IngressoCinema(DiaDaSemana.QUARTA, false);
        Double expResult = 7.50;
        Double result = instanceQuarta.precoCinema();
        assertEquals(expResult, result);
        
        instanceQuarta.setEstudante(true);
        expResult = 7.50;
        result = instanceQuarta.precoCinema();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPrecoCinemaSabado(){
        IngressoCinema instanceSabado = new IngressoCinema(DiaDaSemana.SABADO, true);
        Double expResult = 14.7;
        Double result = instanceSabado.precoCinema();
        assertEquals(expResult, result);
        
        instanceSabado.setEstudante(false);
        expResult = 21.0;
        result = instanceSabado.precoCinema();
        assertEquals(expResult, result);
    }
}
