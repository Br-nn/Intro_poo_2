public class Personagem{
  //variáveis de instâncias (variáveis de objeto)
  String nome;
  private int energia = 10;
  private int fome = 0;
  private int sono = 0;
  private int comida = 0;
  //construtor padrão (lista de parâmetros vazia)
  Personagem(){
    System.out.println("Construindo um personagem...");
  }

  Personagem(int energia, int fome, int sono){
    this.energia = energia > 10 || energia < 0 ? this.energia : energia;
    this.fome = fome > 10 || fome < 0 ? this.fome : fome;
    this.sono = sono > 10 || sono < 0 ? this.sono : sono;
  }
  Personagem(String nome){
    this.nome = nome;
  }
  //tipo de retorno --> void (executa e some)
  //nome --> caçar (sempre sem caracteres especiais ou espaço)
  //lista de parâmetros --> "()" lita vazia
  //corpo --> {}
  //printf permite o uso de cod. especiais "%s"

  void cacar(){
    if(energia == 0 || fome == 10 || sono == 10){
    System.out.printf("%s morreu! ", nome);
    System.exit(0);
    }else if (energia >= 2){
      energia -=2;
      System.out.printf("%s caçando...\n", nome);
      comida++;
    }else{
      System.out.printf("%s está sem energia para caçar!\n", nome);
    }
    fome = fome + 1 >= 10 ? 10 : fome + 1;
    sono = sono + 1 >= 10 ? 10 : sono + 1;
  }
  void comer(){
     if(energia == 0 || fome == 10 || sono == 10){
    System.out.printf("%s morreu! ", nome);
    System.exit(0);
     }else if (fome >= 1 && comida >=1){
      System.out.printf("%s comendo...\n", nome);
      --fome;
      energia = energia + 1 >= 10 ? 10 : energia + 1;
    }else{
      System.out.printf("%s não consegue comer!\n", nome);
    }
  }
  void dormir(){
     if(energia == 0 || fome == 10 || sono == 10){
    System.out.printf("%s morreu! ", nome);
    System.exit(0);
     }else if (sono >= 1){
      System.out.printf("%s dormindo...\n", nome);
      --sono;
      energia = energia + 1 <= 10 ? energia++ : 10;
    }else{
      System.out.printf("%s está sem sono!\n", nome);
    }
  }

  void exibirEstado(){
    System.out.printf("%s: E: %d / F: %d / S: %d\n", nome, energia, fome, sono);
  }
}