package aula12;
public class Reptil extends Animal{
    private String corEscama; 

//Métodos Getters e Setters

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
//Métodos abstratos de "Animal"
    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais e insetos...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de reptil...");
    }
    
}
