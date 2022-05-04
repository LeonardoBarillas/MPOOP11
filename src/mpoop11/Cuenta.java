/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop11;

/**
 * Clase que muestra los datos de una Cuenta
 * @author Julia Hernandez - Leonardo Barillas - Ivan Romero
 */
public class Cuenta {
 private float saldo;

 /**
  * Metodo vacio
  */
    public Cuenta() {
    }
    
/**
 * Metodo que muestra los datos de una Cuenta Bancaria
 * @return 
 */
    public float getSaldo() {
        return saldo;
    }
    
    /**
     * Metodo para depositar dinero
     * @param monto Cntidad de dinero a depositar
     * @throws LimiteDepositoException 
     */
    public void depositar(float monto) throws LimiteDepositoException{
        System.out.println("Depositando...");
        if (monto > 20000) {
            throw new LimiteDepositoException();
        }else{
            saldo += monto;
        }
    }
    
    /**
     * Metodo para hacer retiros
     * @param monto Cantidad de dinero del retiro
     * @param noRetiros Contador de retiros realizados
     * @return Numero de retiros realizado
     * @throws SaldoInsuficienteException
     * @throws LimiteRetirosException 
     */
    public int retirar(float monto, int noRetiros) throws SaldoInsuficienteException, LimiteRetirosException{
        if (noRetiros < 3){    
            System.out.println("Retirando... $" + monto);
            if (saldo < monto) {
                throw new SaldoInsuficienteException();
            }
            else{
                saldo -= monto;
            }
            noRetiros += 1;
        }else{
            throw new LimiteRetirosException();
        }
        return noRetiros;
    }   
}
