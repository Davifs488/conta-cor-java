package aula05;
 public class Aula05 {
  public static void main(String[] args) {
      //POO
      //Feita na IDE NetBens
      //E um modelo de contas correste ou pupança
      //Abertura e fechamento
      //Saques e depoistpos
    ContaBanco p1 = new ContaBanco();
    p1.setNumConta(1111);
    p1.setDono("Davi");
    p1.abrirConta("CC");
    
    ContaBanco p2 = new ContaBanco();
    p2.setNumConta(33333);
    p2.setDono("Saraly");
    p2.abrirConta("CP");
    
    
   // p1.depositar(100);
    p2.depositar(500);
    p2.sacar(650);
    //p2.sacar(1000);
    
    p2.fecharConta();
   
    //p1.sacar(150);
    //p1.fecharConta();
    
    
    p1.estadoAtual();
    p2.estadoAtual();
    }
    
}
