package com.kaminski.redis.cache.domain;

import com.kaminski.redis.cache.entity.Municipio;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class ListaMunicipios implements Serializable {

    private List<Municipio> municipios;

}