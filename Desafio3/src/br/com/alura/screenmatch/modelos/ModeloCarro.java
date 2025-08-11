package br.com.alura.screenmatch.modelos;

public class ModeloCarro extends Carro {

    private String cor;
    private String escada;

  public   void unoComEscada(String escada){
      this.escada = escada;
      System.out.println("Duas escadas, duas vezes mais rapido que a luz." );
  }

  public void corDoCarro(String cor){
      this.cor = cor;
      System.out.println("Dependendo da cor e mais rapido.");
  }

}
