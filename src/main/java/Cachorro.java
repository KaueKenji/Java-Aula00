public class Cachorro {
  // atributos
  String nome, raca;
  int idade;

  // Metodos
  void latir() {
    System.out.println(nome + ": Au au au");
  }

  void info() {
    System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nRaça: " + raca);
  }

}