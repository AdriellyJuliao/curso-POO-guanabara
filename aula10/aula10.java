public class aula10 {
   public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();
    
    p1.setNome("Diego"); 
    p2.setNome("Adrielly");
    p3.setNome("Rafael");
    p4.setNome("Maisa");;

    p1.setSexo("M");
    p4.setSexo("F");
    p2.setIdade(18);

    p2.setCurso("Informática");
    p3.setSalario(2500.75f);
    p4.setSetor("Estoque");

    p3.ReceberAum(550.20f);
    p4.mudarTrabalho();
    p2.cancelaMatr();

    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
    System.out.println(p4.toString());
    }
}
