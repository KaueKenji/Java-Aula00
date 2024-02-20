// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Cachorro cao = new Cachorro();

    cao.nome = "Snoopy";
    cao.idade = 74;
    cao.raca = "Beagle";

    cao.info();
    cao.latir();

  }

  // @Test
  // void addition() {
  // assertEquals(2, 1 + 1);
  // }
}