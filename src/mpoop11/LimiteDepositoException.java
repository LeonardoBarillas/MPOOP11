/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 * Excepcion que muestra los datos de un Limite de Deposito
 * @author Julia Hernandez - Leonardo Barillas - Ivan Romero
 */
public class LimiteDepositoException extends Exception{
    public LimiteDepositoException() {
        super("Has superdo el limite de deposito, para cualquier aclaracion "
                + "contacta con Banco MPOO");
    }
}
