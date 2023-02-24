import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import business.core.loging.DatabaseLogger;
import business.core.loging.EmailLogger;
import business.core.loging.FileLogger;
import business.core.loging.Logger;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entities.Category;
import entities.Course;
import entities.Instructor;


public class Main {
    public static void main(String[] args) throws Exception {

        //Kurs oluşturma
        Course course = new Course(1,"Java kursu","İleri seviye java",10000);
        Course course1 = new Course(2,".Net kursu","İleri seviye .Net",10);

        //Eğitmen oluşturma
        Instructor instructor = new Instructor(1,"Engin","Demiroğ");

        //Kategori oluşturma
        Category category = new Category(1,"Programlama","Programlama Detay");
        Category category1 = new Category(2,"Deneme","Deneme Detay");
        Category category2 = new Category(3,"Programlama","Programlama Detay");

        //loglama yeteneklerinin bir dizi içerisinde tutulması olayı
        Logger[] loggers = new Logger[] {new DatabaseLogger(),new FileLogger(), new EmailLogger()};

        //Kurs ekleme
        CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
        courseManager.add(course);
        //courseManager.add(course1);

        System.out.println("------------------------------");

        //Kategori ekleme
        CategoryManager categoryManager = new CategoryManager(new JdbcDao(),loggers);
        categoryManager.add(category);
        //categoryManager.add(category1);

        System.out.println("---------------------------------");

        //Eğitmen ekleme
        InstructorManager instructorManager = new InstructorManager(new JdbcDao(),loggers);
        instructorManager.add(instructor);

    }
}