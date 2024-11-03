package aula12;
public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        c.setPeso(60);
        c.setIdade(23);
        c.setMembros(4);
        c.setCorPelo("Marrom");
        System.out.println("CANGURU \nPeso " + c.getPeso() + "kg. \nExpectativa de vida: " + c.idade + " anos. \nCor do pelo: " + c.getCorPelo());
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        
        System.out.println("---------------------------------------------------");
        
        Cachorro ch = new Cachorro();
        ch.setPeso(15);
        ch.setIdade(13);
        ch.setMembros(4);
        ch.setCorPelo("Preto");
        System.out.println("CACHORRO \nPeso " + ch.getPeso() + "kg. \nExpectativa de vida: " + ch.getIdade() + " anos.\nQuantidade de patas: " + ch.getMembros() + "\nCor do pelo: " + ch.getCorPelo());
        ch.locomover();
        ch.alimentar();
        ch.emitirSom();
        ch.enterrarOsso();
        ch.abanarRabo();
        
        
        System.out.println("---------------------------------------------------");
        
        Cobra co = new Cobra();
        co.setPeso(5);
        co.setIdade(15);
        co.setMembros(0);
        co.setCorEscama("preto, vermelho e branco");
        System.out.println("COBRA \nPeso " + co.getPeso() + "kg. \nExpectativa de vida: " + co.getIdade() + " anos.\nQuantidade de patas: " + co.getMembros() + "\nCor das escamas: " + co.getCorEscama());
        co.locomover();
        co.alimentar();
        co.emitirSom();
        
        System.out.println("---------------------------------------------------");
        
        Tartaruga t = new Tartaruga();
        t.setPeso(135);
        t.setIdade(90);
        t.setMembros(4);
        System.out.println("TARTARUGA \nPeso " + t.getPeso() + "kg. \nExpectativa de vida: " + t.getIdade() + " anos.\nQuantidade de patas: " + t.getMembros());
        t.locomover();
        t.alimentar();
        t.emitirSom();
        
        System.out.println("---------------------------------------------------");
        
        Goldfish g = new Goldfish();
        g.setPeso(4);
        g.setIdade(20);
        g.setMembros(0);
        g.setCorEscama("douradas/laranjas");
        System.out.println("PEIXE DOURADO \nPeso " + g.getPeso() + "g. \nExpectativa de vida: " + g.getIdade() + " anos. \nQuantidade de patas: " + g.getMembros() + "\nCor das escamas: " + g.getCorEscama());
        g.locomover();
        g.alimentar();
        g.emitirSom();
        g.soltarBolhar();
        
        
        Arara ar = new Arara();
        ar.setPeso(1.7f);
        ar.setIdade(50);
        ar.setMembros(2);
        ar.setCorPena("azul e amarelo.");
        System.out.println("Arara \nPeso " + ar.getPeso() + "g. \nExpectativa de vida: " + ar.getIdade() + " anos.\nQuantidade de patas: " + ar.getMembros() + "\nCor das penas: " + ar.getCorPena());
        ar.locomover();
        ar.alimentar();
        ar.emitirSom();
             
    }
    
}
