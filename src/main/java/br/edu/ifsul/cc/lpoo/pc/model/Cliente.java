/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pc.model;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author acer
 */

@Entity
@Table(name = "tb_cliente")
@DiscriminatorValue("C")

public class Cliente extends Pessoa {
    
       @Column (nullable = false, length = 50) //n precisa id pois herda de pessoa
    private String cnpj;
    
    @Column (nullable = false, length = 50)
    private Calendar data_ultima_compra;
    
    @Column (nullable = false, precision = 2)
    private Float valor_compras;

    public Cliente() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Calendar getData_ultima_compra() {
        return data_ultima_compra;
    }

    public void setData_ultima_compra(Calendar data_ultima_compra) {
        this.data_ultima_compra = data_ultima_compra;
    }

    public Float getValor_compras() {
        return valor_compras;
    }

    public void setValor_compras(Float valor_compras) {
        this.valor_compras = valor_compras;
    }
    
}
