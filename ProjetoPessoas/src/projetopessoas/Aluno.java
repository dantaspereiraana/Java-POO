package projetopessoas;
public class Aluno extends Pessoa{
    private boolean matricula;
    private String curso;
    
    public void cancelarMatricula (){
        if (this.getMatricula()) {
            this.setMatricula(false);
            System.out.println("Matrícula cancelada com sucesso!");
        } else {
            System.out.println("Essa matrícula já está cancelada.");
        }
    }

    public boolean getMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = true;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
