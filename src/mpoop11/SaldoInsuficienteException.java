/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 * Exepcion que muestra los datos de un Saldo Insuficiente
 * @author Julia Hernandez - Leonardo Barillas - Ivan Romero
 */
public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(){
        super("Tu saldo es insuficiente para realizar esta operacion");
    }
}
    
