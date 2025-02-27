package aula12;
public class Mamifero extends Animal {
    private String corPelo;
    
//Métodos Getters e Setters

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
//Métodos abstratos de "Animal"
    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de mamifero...");
    }
    
}
