package aula07;

import java.util.Random;

public class Luta {
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos
    public void marcarLuta (Lutadores l1, Lutadores l2){
       if (l1.getCategoria().equals(l2.getCategoria()) 
           && l1 != l2) {
           this.aprovada = true;
           this.desafiado = l1;
           this.desafiante = l2;
       } else {
           this.aprovada = false;
           this.desafiado = null;
           this.desafiante = null;
       }
       
    }
    
    public void lutar() {
        if (this.aprovada) {
            System.out.println("####DESAFIADO###");
            this.desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor) {
                case 0 -> {
                    System.out.println("EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> { 
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                }                     
            }
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    
    //Métodos Getters e Setters 

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
