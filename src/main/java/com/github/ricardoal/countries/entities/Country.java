package com.github.ricardoal.countries.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity(name = "Country")
@Table(name = "pais")
public class Country {

  @Id
  private Long id;

  @Column(name = "nome")
  private String name;

  @Column(name = "nome_pt")
  private String portugueseName;

  @Column(name = "sigla")
  private String code;

  private Integer bacen;

  public Country() {
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getPortugueseName() {
    return portugueseName;
  }

  public String getCode() {
    return code;
  }

  public Integer getBacen() {
    return bacen;
  }

  @Override
  public String toString() {
    return "Country{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", portugueseName='" + portugueseName + '\'' +
            ", code='" + code + '\'' +
            ", bacen=" + bacen +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Country country = (Country) o;
    return Objects.equals(id, country.id) &&
            Objects.equals(name, country.name) &&
            Objects.equals(portugueseName, country.portugueseName) &&
            Objects.equals(code, country.code) &&
            Objects.equals(bacen, country.bacen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, portugueseName, code, bacen);
  }

}
