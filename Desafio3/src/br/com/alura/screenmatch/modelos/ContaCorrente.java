package br.com.alura.screenmatch.modelos;

public class ContaCorrente extends ContaBancaria{
private double tarifaMensal;

public void cobrarTarifaMensal(){
    Saldo -= tarifaMensal;
    this.tarifaMensal = 34;
    System.out.println("Tarifa mensal de " + tarifaMensal + " Cobrança. ");

}
}
