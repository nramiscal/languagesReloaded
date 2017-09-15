package com.nramiscal.languages.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nramiscal.languages.models.Language;

@Repository
public interface LangRepo extends CrudRepository<Language, Long> {

}
