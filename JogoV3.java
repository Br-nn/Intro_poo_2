import java.util.Random;
public class JogoV3 {
  public static void main(String[] args) throws Exception {
    var p = new Personagem("Bruno");
    var gerador = new Random();
    for ( ; ; ){//loop infinito
      //sortear número entre 1, 2 e 3
      int oQFazer = gerador.nextInt(3);
      switch(oQFazer+1){
      //se for 1, o personagem caça
        case 1:  
          p.cacar();
          break;
      //se for 2, o personagem dorme
        case 2:
          p.dormir();
          break;
      //se for 3, o personagem come
        case 3:
          p.comer();
          break;

      }
      p.exibirEstado();
      System.out.println("-----------------------");
      Thread.sleep(8000);
    }
  }
}
