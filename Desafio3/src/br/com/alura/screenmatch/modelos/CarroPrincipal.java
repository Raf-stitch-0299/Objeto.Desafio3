package br.com.alura.screenmatch.modelos;

public class CarroPrincipal {
    public static void main(String[] args) {

        ModeloCarro Uno = new ModeloCarro();
        Uno.definirModelo("Uno");
        Uno.definirPrecos(34099, 27099, 99099);
        Uno.corDoCarro("Branco");
        Uno.unoComEscada("Tem Escadas");
        Uno.exibirInformacao();

    }
}
