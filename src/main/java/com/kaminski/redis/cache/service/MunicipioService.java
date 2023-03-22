package com.kaminski.redis.cache.service;

import com.kaminski.redis.cache.entity.Municipio;
import com.kaminski.redis.cache.repository.MunicipioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MunicipioService {

    private final MunicipioRepository repository;

    @Cacheable(cacheNames = "municipios", key="#root.method.name")
    public List<Municipio> listAll(){
        log.info("realizando consultando municipios.");
        return repository.findAll();
    }

    @CacheEvict(cacheNames = "municipios", allEntries = true)
    public Municipio create(Municipio municipio){
        log.info("realizando cadastrando municipio.");
        return repository.save(municipio);
    }

}