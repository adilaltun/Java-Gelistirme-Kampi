package business;

import business.core.loging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.ArrayList;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;
    private ArrayList<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception{

        //Kategori ismi için denetim
        /*for(int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getCategoryName() == category.getCategoryName()) {
                throw new Exception("Bu kategori zaten mevcut.");
            }
        }*/

        categoryDao.add(category);

        //Loglama işlemi
        for (Logger logger: loggers){
            logger.log(category.getCategoryName());
        }
    }
}
