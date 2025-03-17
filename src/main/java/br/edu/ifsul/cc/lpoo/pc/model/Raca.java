/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pc.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author acer
 */

@Entity
@Table(name = "tb_raca")

public class Raca {
    
    @Id
    @SequenceGenerator(name= "seq_raca", sequenceName= "seq_raca_id", allocationSize =1)
    @GeneratedValue(generator= "seq_raca")
    private Integer id;
    private String nome;

    public Raca() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
