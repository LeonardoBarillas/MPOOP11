/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop11;

/**
 * Clase Principal
 * @author Julia Hernandez - Leonardo Barillas - Ivan Romero
 */
public class MPOOP11 {

    /**
     * @param args the command line arguments
     * @throws mpoop11.LimiteDepositoException
     * @throws mpoop11.LimiteRetirosException
     * @throws mpoop11.SaldoInsuficienteException
     */
    public static void main(String[] args) throws LimiteDepositoException, LimiteRetirosException, SaldoInsuficienteException {
        // TODO code application logic here
        try{
            String[] mensajes = {"mensaje 1", "mensaje 2", "mensaje 3"};
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Sigue el codigo");
        System.out.println("\n######### Division entre 0 #########\n");
        try{    
            float x = 10/0;
            System.out.println("x = " + x);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }catch(ArithmeticException ex){
            System.out.println("Error " + ex.getMessage());
        }finally{
            System.out.println("A pesar de todo, se ejecuta el finally");
        }
        
        System.out.println("\n######### Propagacion de excepciones #########\n");
        try{
            double division = miMetodoDivision(20.0f, 0);
            System.out.println(division);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("\n######### Mi cuenta #########\n");
        Cuenta cuenta = new Cuenta();
        int noRetiros = 0;
        
        try {
            System.out.println(cuenta.getSaldo());
            cuenta.depositar(1000);
            System.out.println(cuenta.getSaldo());
            cuenta.retirar(1500, noRetiros);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Saldo final $" + cuenta.getSaldo());
        
        try {
            System.out.println(cuenta.getSaldo());
            cuenta.depositar(20001);
            System.out.println(cuenta.getSaldo());
        } catch(LimiteDepositoException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Saldo final $" + cuenta.getSaldo());
        
        try {
            noRetiros = cuenta.retirar(200, noRetiros);
            System.out.println("Saldo final $" + cuenta.getSaldo());
            noRetiros = cuenta.retirar(200, noRetiros);
            System.out.println("Saldo final $" + cuenta.getSaldo());
            noRetiros = cuenta.retirar(100, noRetiros);
            System.out.println("Saldo final $" + cuenta.getSaldo());
            noRetiros = cuenta.retirar(500, noRetiros);
            System.out.println("Saldo final $" + cuenta.getSaldo());
        } catch(LimiteRetirosException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    

    private static double miMetodoDivision(float f, double d) throws ArithmeticException {
        return f/d;
    }
    
}

    
