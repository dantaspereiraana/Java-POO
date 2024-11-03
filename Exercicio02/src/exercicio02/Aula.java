package exercicio02;

public class Aula {
    String materia;
    int alunos;
    String horario;
    boolean professor; 
    
    void status () {
        System.out.println("Matéria: " + this.materia);
        System.out.println("Quantidade de alunos: " + this.alunos);
        System.out.println("Horário da aulas: " + this.horario);
    }
    
    void comecarAula () {
        if (professor == true) {
            System.out.println("O professor já chegou! A aula irá começar.");
        } else {
            System.out.println("Hmmm... O professor ainda não chegou. Aguarde!");
        }
    }
    
   void chegou (){
       this.professor = true;
   }
   
   void naoChegou () {
       this.professor = false;
   }
}
