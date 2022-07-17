package com.github.ricardoal.states.entities;

import com.github.ricardoal.countries.entities.Country;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

@Entity(name = "State")
@Table(name = "estado")
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class State {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  private String uf;

  private Integer ibge;

  /* 1st
  @Column(name = "pais")
  private Integer countryId;*/

  // 2nd - @ManyToOne
  @ManyToOne
  @JoinColumn(name = "pais", referencedColumnName = "id")
  private Country country;

  @Type(type = "jsonb")
  @Basic(fetch = FetchType.LAZY)
  @Column(name = "ddd", columnDefinition = "jsonb")
  private List<Integer> ddd;

  public State() {
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getUf() {
    return uf;
  }

  public Integer getIbge() {
    return ibge;
  }

  public List<Integer> getDdd() {
    return ddd;
  }

  public Country getCountry() {
    return country;
  }

  @Override
  public String toString() {
    return "State{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", uf='" + uf + '\'' +
            ", ibge=" + ibge +
            ", country=" + country +
            ", ddd=" + ddd +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    State state = (State) o;
    return Objects.equals(id, state.id) &&
            Objects.equals(name, state.name) &&
            Objects.equals(uf, state.uf) &&
            Objects.equals(ibge, state.ibge) &&
            Objects.equals(country, state.country) &&
            Objects.equals(ddd, state.ddd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, uf, ibge, country, ddd);
  }

}
