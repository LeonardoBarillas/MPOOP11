/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 * Exepcion que muestra los datos de un Limite de Retiros
 * @author Julia Hernandez - Leonardo Barillas - Ivan Romero
 */
public class LimiteRetirosException extends Exception{
    public LimiteRetirosException() {
        super("Has superado el limite de retiros, para cualquier aclaracion "
                + "contacta con Banco MPOO");
    }
}
