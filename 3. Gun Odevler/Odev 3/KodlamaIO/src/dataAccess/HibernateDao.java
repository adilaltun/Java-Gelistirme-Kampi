package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateDao implements CategoryDao,CourseDao, InstructorDao{

    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " Hibernate ile veritabanına eklendi.");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getInstructorName() + " Hibernate ile veritabanına eklendi.");
    }
}
