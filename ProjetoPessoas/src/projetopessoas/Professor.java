package projetopessoas;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario = 1570.62f;
    
    private void ReceberAum(float p){
        this.salario+=p;
        System.out.println("Salário aumentado para R$" + this.getSalario());
    }   

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
