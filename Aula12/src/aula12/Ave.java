package aula12;
public class Ave extends Animal{
    private String corPena;

//Métodos Getters e Setters
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {    
        this.corPena = corPena;
    }
    
//Métodos Especiais
    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }

//Métodos abstratos de "Animal"
    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave...");
    }
    
}
