package com.facu.restfake.repositories;

import com.facu.restfake.entities.Localidad;
import com.facu.restfake.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long> {
}
