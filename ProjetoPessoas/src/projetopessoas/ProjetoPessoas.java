package projetopessoas;
public class ProjetoPessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa ();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        
        p1.setNome("Pedro");
        p1.setGênero("M");
        
        p2.setNome("Maria");
        p2.setIdade(23);
        p2.setCurso("Informática.");
        
        p3.setNome("Claudio");
        p3.setSalario(2500.75f);
        
        p4.setNome("Fabiano");
        p4.setGênero("F");
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
