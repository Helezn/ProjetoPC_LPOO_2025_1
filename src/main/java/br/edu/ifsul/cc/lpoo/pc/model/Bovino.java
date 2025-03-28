/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pc.model;

import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author telmo
 */
@Entity
@Table(name = "tb_bovino")

public class Bovino {

    @Id
    private Integer id;

    @Column(nullable = false, length = 8)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_inicio;

    @Column(nullable = false, length = 8)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar data_fim;

    @Column(nullable = false, length = 8)
    private Float peso_chegada;

    @Column(nullable = false, length = 8)
    private Float peso_atual;

    @Column(nullable = false, length = 8)
    private Float valor_kg_compra;

    @Column(nullable = false, length = 8)
    private Float valor_kg_venda;

    @Column(nullable = false, length = 8)
    private Float custo_diario;

    @Column(nullable = false, length = 8)
    private Float valor_liquido;

    @Column(nullable = false, length = 8)
    private Raca raca;

    @OneToMany(mappedBy = "bovino") //mappedBy deve apontar para a referencia de Bovino dentro de Pesagem
    private List<Pesagem> pesagens;

    @Column(nullable = false)
    @Enumerated
    private Situacao situacao;

    public Bovino() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Calendar data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Calendar getData_fim() {
        return data_fim;
    }

    public void setData_fim(Calendar data_fim) {
        this.data_fim = data_fim;
    }

    public Float getPeso_chegada() {
        return peso_chegada;
    }

    public void setPeso_chegada(Float peso_chegada) {
        this.peso_chegada = peso_chegada;
    }

    public Float getPeso_atual() {
        return peso_atual;
    }

    public void setPeso_atual(Float peso_atual) {
        this.peso_atual = peso_atual;
    }

    public Float getValor_kg_compra() {
        return valor_kg_compra;
    }

    public void setValor_kg_compra(Float valor_kg_compra) {
        this.valor_kg_compra = valor_kg_compra;
    }

    public Float getValor_kg_venda() {
        return valor_kg_venda;
    }

    public void setValor_kg_venda(Float valor_kg_venda) {
        this.valor_kg_venda = valor_kg_venda;
    }

    public Float getCusto_diario() {
        return custo_diario;
    }

    public void setCusto_diario(Float custo_diario) {
        this.custo_diario = custo_diario;
    }

    public Float getValor_liquido() {
        return valor_liquido;
    }

    public void setValor_liquido(Float valor_liquido) {
        this.valor_liquido = valor_liquido;
    }

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public List<Pesagem> getPesagens() {
        return pesagens;
    }

    public void setPesagens(List<Pesagem> pesagens) {
        this.pesagens = pesagens;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

}
