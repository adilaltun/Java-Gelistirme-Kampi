package business;

import business.core.loging.Logger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception{
        //kurs isim kontrol işlemi
        /*for (Course course1 : courses){
            if (course.getCourseName().equals(course1.getCourseName())){
                throw new Exception("Bu kurs daha önceden kayıt edilmiştir.");
            }
        }*/

        if (course.getCoursePrice()<=0){
            throw new Exception("Ürünün fiyatı 0'dan küçük olamaz.");
        }

        //Kurs ekleme
        courseDao.add(course);

        //Loglama işlemi
        for (Logger logger: loggers){
            logger.log(course.getCourseName());
        }
    }

}
