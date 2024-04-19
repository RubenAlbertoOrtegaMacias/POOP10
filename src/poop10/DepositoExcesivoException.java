/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Windows 10
 */
// La clase DepositoExcesivoException representa una excepción personalizada que se lanza cuando se intenta depositar una cantidad excesiva de dinero
public class DepositoExcesivoException extends Exception {
    // Constructor que establece el mensaje de la excepción
    public DepositoExcesivoException() {
        super("No puedes depositar más de $20,000 en una sola operación.");
    }
}
