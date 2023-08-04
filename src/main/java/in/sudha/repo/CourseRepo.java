package in.sudha.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sudha.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
