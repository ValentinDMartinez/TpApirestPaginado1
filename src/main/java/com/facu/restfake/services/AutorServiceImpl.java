package com.facu.restfake.services;

import com.facu.restfake.entities.Autor;
import com.facu.restfake.entities.Persona;
import com.facu.restfake.repositories.AutorRepository;
import com.facu.restfake.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

@Autowired
private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {

        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        return null;
    }
}
