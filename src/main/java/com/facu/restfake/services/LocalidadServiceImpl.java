package com.facu.restfake.services;

import com.facu.restfake.entities.Localidad;
import com.facu.restfake.entities.Persona;
import com.facu.restfake.repositories.BaseRepository;
import com.facu.restfake.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {

        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        return null;
    }
}
