package com.nramiscal.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nramiscal.languages.models.Language;
import com.nramiscal.languages.repositories.LangRepo;

@Service
public class LangService {
	
	private LangRepo langRepo;
	
	public LangService(LangRepo langRepo) {
		this.langRepo = langRepo;
	}
    
    public List<Language> allLanguages() {
    			return (List<Language>) langRepo.findAll();
    
    }
    
    public Language findLangById(Long id) {
    			return langRepo.findOne(id);
    }
    
    public void addLang(Language language) {
    			langRepo.save(language);
    }
    
    public void updateLang(Long id, Language language) {
    			langRepo.save(language);
    			
    }
    
    public void deleteLang(Long id) {
    			langRepo.delete(id);
    }
}