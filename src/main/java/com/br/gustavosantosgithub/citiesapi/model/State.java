package com.br.gustavosantosgithub.citiesapi.model;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity(name = "State")
@Table(name = "estado")
@TypeDefs({
        @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {

    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "uf")
    private String uf;

    @Column(name = "ibge")
    private Integer ibge;

   /* @Column(name = "pais")
    private Integer countryId;*/

    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;

    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "ddd", columnDefinition = "jsonb")
    private List<Integer> ddd;

    public State(){

    }
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    /*public Integer getCountryId() {
        return countryId;
    }*/

    public List<Integer> getDdd() {
        return ddd;
    }
    public Country getCountry(){
        return country;
    }

}
