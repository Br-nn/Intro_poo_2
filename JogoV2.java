import java.util.Scanner;
public class JogoV2 {
  public static void main(String[] args) throws Exception {
    var scanner = new Scanner(System.in);
    var p = new Personagem();
    System.out.print("Insira o nome do personagem: ");
    p.nome = scanner.next();
    scanner.close();
    while (true){
      p.cacar();
      p.comer();
      p.dormir();
      p.exibirEstado();
      System.out.println("----------------------------");
      Thread.sleep(8000);
    }
  }
}
