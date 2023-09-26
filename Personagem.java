public class Personagem{
  //variáveis de instâncias (variáveis de objeto)
  String nome;
  int energia;
  int fome;
  int sono;
  //tipo de retorno --> void (executa e some)
  //nome --> caçar (sempre sem caracteres especiais ou espaço)
  //lista de parâmetros --> "()" lita vazia
  //corpo --> {}
  //printf permite o uso de cod. especiais "%s"
  void cacar(){
    if (energia >= 2){
      energia -=2;
      System.out.printf("%s caçando...\n", nome);
    }else{
      System.out.printf("%s está sem energia para caçar!", nome);
    }
    fome = fome + 1 >= 10 ? 10 : fome + 1;
    sono = sono + 1 >= 10 ? 10 : sono + 1;
  }
  void comer(){
    if (fome >= 1){
      System.out.printf("%s comendo...\n", nome);
      --fome;
      energia = energia + 1 >= 10 ? 10 : energia + 1;
    }else{
      System.out.printf("%s está sem fome.\n");
    }
  }
  void dormir(){
    if (sono >= 1){
      System.out.printf("%s dormindo...\n");
      --sono;
      energia = energia + 1 <= 10 ? energia++ : 10;
    }else{
      System.out.printf("%s está sem sono!\n", nome);
    }
  }
}