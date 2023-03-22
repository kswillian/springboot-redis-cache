package com.kaminski.redis.cache.controller;

import com.kaminski.redis.cache.domain.ListaMunicipios;
import com.kaminski.redis.cache.entity.Municipio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("v1/municipios")
public interface MunicipioController {

    @GetMapping
    ResponseEntity<ListaMunicipios> findAll();

    @PostMapping
    ResponseEntity<Municipio> create(@RequestBody Municipio municipio);

}