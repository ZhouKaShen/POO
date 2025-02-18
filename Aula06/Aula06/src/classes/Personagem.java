package classes;

import javax.swing.*;

public class Personagem {

    // Atributos da classe
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;

    // Construtor
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 5000;
        if (classe.equals("Guerreiro") || classe.equals("guerreiro")) {
            forca = nivel * 2;
        } else {
            forca = nivel;
        }

    }

    // Métodos específicos(não são construtores, inclusive getters e setters)
    public void mostrarStatus() {
        // Permite definir um valor de uma variável do tipo primitivo, usando o padrão de formatação format
        // É parecido com System.out.format();
        String status = String.format("Nome: %s\nNível: %d\nVida: %d\nClasse: %s\nForça: %d",
            nome,
            nivel,
            vida,
            classe,
            forca);
        JOptionPane.showMessageDialog(null, status, "Status do personagem", JOptionPane.INFORMATION_MESSAGE);
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel() {
        this.nivel = nivel;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}