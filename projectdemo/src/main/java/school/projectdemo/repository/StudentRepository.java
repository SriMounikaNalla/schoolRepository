package school.projectdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import school.projectdemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
