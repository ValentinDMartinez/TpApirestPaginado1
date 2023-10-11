package com.facu.restfake.repositories;

import com.facu.restfake.entities.Autor;
import com.facu.restfake.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
}
