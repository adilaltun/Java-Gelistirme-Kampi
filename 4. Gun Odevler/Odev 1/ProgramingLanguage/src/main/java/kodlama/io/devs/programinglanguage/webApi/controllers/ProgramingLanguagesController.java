package kodlama.io.devs.programinglanguage.webApi.controllers;

import kodlama.io.devs.programinglanguage.business.abstracts.ProgramingLanguageService;
import kodlama.io.devs.programinglanguage.entities.concretes.ProgramingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programingLanguage")
public class ProgramingLanguagesController {

    private ProgramingLanguageService programingLanguageService;

    @Autowired
    public ProgramingLanguagesController(ProgramingLanguageService programingLanguageService) {
        this.programingLanguageService = programingLanguageService;
    }

    //Programımızda bir şeyleri kayıt ederken @PostMapping anotasyonunu kullanırız. Bunun nedeni URL'de gözükmemesi içindir.
    @PostMapping("/add")
    public void add(@RequestBody ProgramingLanguage programingLanguage) throws Exception {
        programingLanguageService.add(programingLanguage);
    }

    //Bir şeyleri sileceğimiz zaman @DeleteMapping kullanırız.
    @DeleteMapping("/delete")
    public void delete(@RequestBody ProgramingLanguage programingLanguage){
        programingLanguageService.delete(programingLanguage);
    }

    //Bir şeyleri update edeceğimiz zaman @PutMapping kullanırız.
    @PutMapping("/update")
    public void update(@RequestBody ProgramingLanguage programingLanguage,@RequestParam String name){
        programingLanguageService.update(programingLanguage,name);
    }

    //Bir şeyleri sorgularken ya da listelemek istediğimizde @GetMapping kullanılır.
    @GetMapping("/getAll")
    public List<ProgramingLanguage> getAll(){
        return programingLanguageService.getAll();
    }

    //@PatVariable -> PathVariable anotasyonu url de bulunan değişkenleri ilgili metodlara aktararak ilgili metodun işlemi yapmasını sağlamaktayız
    //yani url kısmında localhost:8080/getById/1 yazarsak bizim birinci id'mizdeki dataları getirir.
    @GetMapping("/getById/{id}")
    public ProgramingLanguage getById(@PathVariable Integer id){
        return programingLanguageService.getById(id);
    }

}
