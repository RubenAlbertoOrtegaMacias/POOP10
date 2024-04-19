/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Windows 10
 */
// La clase RetirosExcesivosException representa una excepción personalizada que se lanza cuando se intenta realizar más retiros de los permitidos
public class RetirosExcesivosException extends Exception {
    // Constructor que establece el mensaje de la excepción
    public RetirosExcesivosException() {
        super("Has alcanzado el límite de 3 retiros.");
    }
}
