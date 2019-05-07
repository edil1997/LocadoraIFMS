/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.mapeamento.pessoa;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author laboratoriodm
 */
@Entity
public class Cliente extends Pessoa implements Serializable{
    
private boolean pessoaJuridica;
private boolean bomPagador;

    public Cliente(){
        this.pessoaJuridica = true;
        this.bomPagador=true;
        
    }

    public boolean isPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(boolean pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public boolean isBomPagador() {
        return bomPagador;
    }

    public void setBomPagador(boolean bomPagador) {
        this.bomPagador = bomPagador;
    }
}