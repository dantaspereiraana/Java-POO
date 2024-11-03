package aula12;
public class Peixe extends Animal{
    private String corEscama;
    
//Métodos Getters e Setters
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
//Métodos especiais
    public void soltarBolhar(){
        System.out.println("Soltando bolhas...");
    }
    
    
//Métodos abstratos de "Animal"
    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo animais marinhos...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sem som...");
    }
    
}
