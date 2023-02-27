package kodlama.io.devs.programinglanguage.business.abstracts;

import kodlama.io.devs.programinglanguage.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface ProgramingLanguageService {
    void add(ProgramingLanguage programingLanguage) throws Exception;
    void delete(ProgramingLanguage programingLanguage);
    void update(ProgramingLanguage programingLanguage, String name);
    List<ProgramingLanguage> getAll();
    ProgramingLanguage getById(Integer id);
}
