package br.com.alura.screenmatch.modelos;

public class ContaBancaria {
    double Saldo;

    public void depositar (double valor){
        Saldo += valor;
        System.out.println("Deposito de " + valor + " Realizado. " );
    }

   public void sacar(double valor){
        if (valor <= Saldo ){
            Saldo -= valor;
            System.out.println("saque de " + valor + " Realizado. " );

        }else {
            System.out.println("Saldo insuficiente para realizar saque. ");

        }

   }

   public void consultarSaldo(){
       System.out.println("Saldo atual: " + Saldo );
   }
}
