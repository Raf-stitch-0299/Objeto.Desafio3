import br.com.alura.screenmatch.modelos.ContaBancaria;
import br.com.alura.screenmatch.modelos.ContaCorrente;

public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();
        contaCorrente.cobrarTarifaMensal();


    }
}
