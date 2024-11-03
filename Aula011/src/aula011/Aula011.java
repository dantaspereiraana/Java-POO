package aula011;
public class Aula011 {
    public static void main(String[] args) {
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(123456);
        a1.setCurso("Informatica");
        a1.setIdade(25);
        a1.setSexo("Masculino");
        a1.pagarMensalidade();
     
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(24513);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Luis");
        t1.praticar();
        
        Professor p1 = new Professor();
        p1.setNome("Nivaldo");
        p1.setEspecialidade("BNCC");
        p1.setSalario(1500);
        p1.receberAum(100);
        System.out.println("O atual salário de " + p1.getNome() + " é de R$" + p1.getSalario());
    }
}
