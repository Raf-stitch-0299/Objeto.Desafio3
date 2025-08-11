import br.com.alura.screenmatch.modelos.Animal;
import br.com.alura.screenmatch.modelos.Cachorro;
import br.com.alura.screenmatch.modelos.Gato;


public class AnimalPrincipal {
    public static void main(String[] args) {

        Cachorro Scooby = new Cachorro();
       Scooby.emitirSom();
       Scooby.abanarRabo();

       Gato deBotas = new Gato();
       deBotas.emitirSom();
       deBotas.arranharMoveis();

    }
}
