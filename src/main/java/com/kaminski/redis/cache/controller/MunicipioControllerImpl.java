package com.kaminski.redis.cache.controller;

import com.kaminski.redis.cache.domain.ListaMunicipios;
import com.kaminski.redis.cache.entity.Municipio;
import com.kaminski.redis.cache.service.MunicipioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MunicipioControllerImpl implements MunicipioController {

    private final MunicipioService service;

    @Override
    public ResponseEntity<ListaMunicipios> findAll() {

        var response = new ListaMunicipios(service.listAll());

        return ResponseEntity.ok(response);

    }

    @Override
    public ResponseEntity<Municipio> create(Municipio municipio) {
        var response = service.create(municipio);
        return ResponseEntity.ok(response);
    }

}