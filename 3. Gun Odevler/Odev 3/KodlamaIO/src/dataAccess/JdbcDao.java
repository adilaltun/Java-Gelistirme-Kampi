package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;


public class JdbcDao implements CategoryDao,CourseDao, InstructorDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + " Jdbc ile veritabanına eklendi.");
    }

    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + " Jdbc ile veritabanına eklendi.");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getInstructorName() + " Jdbc ile veritabanına eklendi.");
    }
}
