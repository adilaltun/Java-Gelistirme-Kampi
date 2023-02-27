package kodlama.io.devs.programinglanguage.dataAccess.abstracts;

import kodlama.io.devs.programinglanguage.entities.concretes.ProgramingLanguage;

import java.util.List;

public interface ProgramingLanguageRepository {
    void add(ProgramingLanguage programingLanguage);
    void delete(ProgramingLanguage programingLanguage);
    void update(ProgramingLanguage programingLanguage, String name);
    List<ProgramingLanguage> getAll();
    ProgramingLanguage getById(Integer id);
}
