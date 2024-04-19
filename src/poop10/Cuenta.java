/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author poo01alu02
 */
// La clase Cuenta representa una cuenta bancaria con operaciones básicas como depositar y retirar
public class Cuenta {
    // El saldo de la cuenta
    private float saldo;
    // El número de retiros realizados
    private int retiros;

    // Constructor por defecto
    public Cuenta() {
        this.saldo = 0;
        this.retiros = 0;
    }

    // Constructor con un saldo inicial
    public Cuenta(float saldo) {
        this.saldo = saldo;
        this.retiros = 0;
    }

    // Getter para el saldo
    public float getSaldo() {
        return saldo;
    }

    // Setter para el saldo
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // Método para depositar dinero en la cuenta
    public void depositar(float monto) throws DepositoExcesivoException {
        // Si el monto a depositar es mayor a 20000, se lanza una excepción
        if (monto > 20000) {
            throw new DepositoExcesivoException();
        }
        // Se añade el monto al saldo
        saldo += monto;
        // Se consulta el saldo
        consultar();
    }

    // Método para retirar dinero de la cuenta
    public void retirar(float monto) throws SaldoInsuficienteException, RetirosExcesivosException {
        // Si se han realizado 3 o más retiros, se lanza una excepción
        if (retiros >= 3) {
            throw new RetirosExcesivosException();
        }
        // Si el monto a retirar es mayor al saldo, se lanza una excepción
        if (monto > saldo) {
            throw new SaldoInsuficienteException();
        }
        // Se resta el monto del saldo
        saldo -= monto;
        // Se incrementa el contador de retiros
        retiros++;
        // Se consulta el saldo
        consultar();
    }

    // Método para consultar el saldo
    public void consultar(){
        System.out.println("Tu saldo es: " + getSaldo());
    }
}