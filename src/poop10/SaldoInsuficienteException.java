/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author poo01alu02
 */
// La clase SaldoInsuficienteException representa una excepción personalizada que se lanza cuando se intenta retirar una cantidad mayor al saldo disponible
public class SaldoInsuficienteException extends Exception {
    // Constructor que establece el mensaje de la excepción
    public SaldoInsuficienteException() {
        super("Saldo insuficiente...");
    }
}
