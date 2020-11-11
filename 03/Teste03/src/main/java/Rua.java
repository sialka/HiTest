/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sidnei
 */
public class Rua implements Comparable<Rua> {

    String cep;
    String nome;

    public Rua(String cep, String nome) {
        this.cep = cep;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Rua o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.nome.compareTo(o.nome);
    }

}
