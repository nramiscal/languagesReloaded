package com.nramiscal.languages.repositories;

import org.springframework.data.repository.CrudRepository;
import com.nramiscal.languages.models.Language;

public interface LangRepo extends CrudRepository<Language, Long> {

}
