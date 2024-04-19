/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// El paquete poop10 contiene todas las clases relacionadas con este proyecto
package poop10;

// La clase POOP10 contiene el método principal (main) que se ejecuta al iniciar el programa

public class POOP10 {

    // El método main es el punto de entrada de cualquier aplicación Java
    public static void main(String[] args) throws SaldoInsuficienteException, RetirosExcesivosException, DepositoExcesivoException {
        // Creación de un array de dos elementos
        int[] arr1 = new int[2];
        try{
            // Llenado del array
            for (int i = 0; i < 2; i++) {
                arr1[i]=i;
            }
            // Intento de acceso a un índice fuera de los límites del array
            for (int i = 0; i <= 2; i++) {
                System.out.println(arr1[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            // Manejo de la excepción ArrayIndexOutOfBoundsException
            System.out.println(e.getMessage());
        }
        // Impresión del primer elemento del array
        System.out.println(arr1[0]);
        // Impresión de un mensaje de saludo
        System.out.println("Hola Mundo");
        
        // Declaración de variables para la operación de división
        int a, b, c=10;
        try{
            // Asignación de valores a las variables
            a=10;
            b=0;
            // Intento de división por cero
            c=a/b;  
        }catch(ArrayIndexOutOfBoundsException e){
            // Manejo de la excepción ArrayIndexOutOfBoundsException
            System.out.println(e.getMessage());
            System.out.println("Codigo del ArrayIndexOutOfBoundsException e");
        }catch(ArithmeticException e){
            // Manejo de la excepción ArithmeticException
            System.out.println(e.getMessage());
            System.out.println("Codigo del ArithmeticException");
        }
        // Impresión del resultado de la división
        System.out.println(c);
        // Impresión de una línea de separación
        System.out.println("########################");
        
        // Impresión del resultado de una división
        System.out.println("El resultado es: " + division(1,2));
        try{
            // Intento de división por cero
            System.out.println("El resultado de la segunda division es: " + division(100,0));  
            division(5,2);
        }catch(ArithmeticException e){
            // Manejo de la excepción ArithmeticException
            System.out.println(e.getMessage());
        }
        
        System.out.println("#####################");
        // Creación de una nueva cuenta con un saldo inicial de 100
        Cuenta cuenta = new Cuenta(100);
        // Consulta del saldo de la cuenta
        cuenta.consultar();
        try {
            // Intento de realizar varios retiros
            cuenta.retirar(50);
            cuenta.retirar(50);
            cuenta.retirar(500);  // Este retiro debería lanzar una SaldoInsuficienteException
        } catch (SaldoInsuficienteException ex) {
            // Manejo de la excepción SaldoInsuficienteException
            System.out.println(ex.getMessage());
        }
        
        // Nuevo apartado para manejar las nuevas excepciones
        System.out.println("#####################");
        Cuenta cuenta1 = new Cuenta(500);
        cuenta1.consultar();
        
        try {
            // Intento de depositar una cantidad mayor a la permitida
            cuenta1.depositar(500);  // Depositndo 500´pesos
            // Intento de realizar más retiros de los permitidos
            cuenta1.retirar(50);
            cuenta1.retirar(50);
            cuenta1.retirar(50);  
            cuenta1.depositar(50000);  // Esto debería lanzar una DepositoExcesivoException
            cuenta1.retirar(50);  // Esto debería lanzar una RetirosExcesivosException
        } catch (RetirosExcesivosException | DepositoExcesivoException ex) {
            // Manejo de las nuevas excepciones
            System.out.println(ex.getMessage());
        }
        // Manejo de las nuevas excepciones
        
        // Impresión de un mensaje final
        System.out.println("Despues de todo me sigo ejecutando");
        
    }

    // Método para realizar una división controlada
    private static float division(int a, int b) throws ArithmeticException{
        if (b==0){
            // Lanzamiento de una excepción en caso de división por cero
            throw new ArithmeticException("Error");
        }else{
            // Retorno del resultado de la división
            return(float) a/b;
        }
    }
    
}