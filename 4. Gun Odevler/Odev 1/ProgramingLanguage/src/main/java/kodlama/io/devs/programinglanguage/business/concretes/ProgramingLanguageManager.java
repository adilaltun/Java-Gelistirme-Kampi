package kodlama.io.devs.programinglanguage.business.concretes;

import kodlama.io.devs.programinglanguage.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.programinglanguage.dataAccess.abstracts.ProgramingLanguageRepository;
import kodlama.io.devs.programinglanguage.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramingLanguageManager implements ProgramingLanguageService {
    private ProgramingLanguageRepository programingLanguageRepository;

    @Autowired
    public ProgramingLanguageManager(ProgramingLanguageRepository programingLanguageRepository) {
        this.programingLanguageRepository = programingLanguageRepository;
    }


    @Override
    public void add(ProgramingLanguage programingLanguage) throws Exception{
        //Program ismi boş mu kontrolü için
        boolean empty = programingLanguage.getName().isEmpty();
        if (empty == true) {
            throw new Exception("Program ismi boş olamaz.");
            //Program ismi tekrar ediyor mu kontrolü için
        } else if (programingLanguageRepository.getAll().contains(programingLanguage)) {
            throw new Exception("Bu program daha önceden kayıtlıdır.");
        }else {
            programingLanguageRepository.add(programingLanguage);
        }
    }

    @Override
    public void delete(ProgramingLanguage programingLanguage) {
        programingLanguageRepository.delete(programingLanguage);
    }

    @Override
    public void update(ProgramingLanguage programingLanguage, String name) {
        programingLanguageRepository.update(programingLanguage,name);
    }

    @Override
    public List<ProgramingLanguage> getAll() {
        return programingLanguageRepository.getAll();
    }

    @Override
    public ProgramingLanguage getById(Integer id) {
        return programingLanguageRepository.getById(id);
    }
}
