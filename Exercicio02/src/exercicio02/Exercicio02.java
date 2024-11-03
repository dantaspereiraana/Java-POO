package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        Aula a1 = new Aula ();
       
        a1.materia = "Sintaxe";
        a1.alunos = 53;
        a1.horario = "18h45";
        a1.naoChegou();
        a1.status();
        a1.comecarAula();
        
        System.out.println("-------------------------");
        
        Aula a2 = new Aula();
        a2.materia = "Literatura Portuguesa";
        a2.alunos = 48;
        a2.horario = "19h15";
        a2.chegou();
        a2.status();
        a2.comecarAula();
    }
    
}
