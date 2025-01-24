package br.casasbahia.index.demo.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table
public class Animal implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    private Long id;
    @Column(length = 50,nullable = false )
    private String name;
    @Column(nullable = false, name = "data_nascimento")
    private Date dataNascimento;
    @Column(nullable = false)
    private String raca;
    @Column(nullable = false)
    private String cor;
    @Column(nullable = false)
    private BigDecimal peso;
    @Column(nullable = false, length = 1)
    private String sexo;

    public Boolean getVacinasEmDia() {
        return vacinasEmDia;
    }

    public String getSexo() {
        return sexo;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }

    public String getRaca() {
        return raca;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @Column(nullable = false, length = 50)
    private Boolean vacinasEmDia;



}
