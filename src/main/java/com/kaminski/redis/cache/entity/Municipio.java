package com.kaminski.redis.cache.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
public class Municipio implements Serializable {

    @Id
    private Integer codigoIBGE;
    private String nome;
    private Float latitude;
    private Float longitude;
    private Boolean capital;
    private Integer uf;

}