/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sidnei
 */
public class Casa {

    Rua rua;
    int numero;
    int totalEleitores;

    public Casa(Rua rua, int numero, int totalEleitores) {
        this.rua = rua;
        this.numero = numero;
        this.totalEleitores = totalEleitores;
    }

    @Override
    public String toString() {
        return rua.nome;
    }

}
 