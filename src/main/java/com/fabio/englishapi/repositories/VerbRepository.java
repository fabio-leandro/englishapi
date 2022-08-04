package com.fabio.englishapi.repositories;

import com.fabio.englishapi.entities.Verb;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerbRepository extends JpaRepository<Verb,Long> {
}
