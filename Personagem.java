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
  void cacar(){
    System.out.println(nome + " caçando");
  }
  void comer(){
    //printf permite o uso de cod. especiais "%s"
    System.out.printf("%s comendo\n", nome);
  }
  void dormir(){
    System.out.print(nome + "dormindo");
  }
}