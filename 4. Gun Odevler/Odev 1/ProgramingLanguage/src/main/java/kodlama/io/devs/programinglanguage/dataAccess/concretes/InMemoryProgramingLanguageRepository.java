package kodlama.io.devs.programinglanguage.dataAccess.concretes;

import kodlama.io.devs.programinglanguage.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.devs.programinglanguage.entities.concretes.ProgramingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgramingLanguageRepository implements ProgramingLanguageRepository {

    List<ProgramingLanguage> programingLanguages;

    public InMemoryProgramingLanguageRepository() {
        programingLanguages = new ArrayList<ProgramingLanguage>();
        programingLanguages.add(new ProgramingLanguage(1,"Java"));
        programingLanguages.add(new ProgramingLanguage(2,"Python"));
        programingLanguages.add(new ProgramingLanguage(3,"C#"));
    }

    @Override
    public void add(ProgramingLanguage programingLanguage) {
        programingLanguages.add(programingLanguage);
    }

    @Override
    public void delete(ProgramingLanguage programingLanguage) {
        programingLanguages.remove(programingLanguage);
    }

    @Override
    public void update(ProgramingLanguage programingLanguage,String name) {
        programingLanguage.setName(name);
    }

    @Override
    public List<ProgramingLanguage> getAll() {
        return programingLanguages;
    }

    @Override
    public ProgramingLanguage getById(Integer id) {
        for (ProgramingLanguage programingLanguage : programingLanguages) {
            if (programingLanguage.getId() == id) {
                return programingLanguage;
            }
        }
        return null;
    }
}
