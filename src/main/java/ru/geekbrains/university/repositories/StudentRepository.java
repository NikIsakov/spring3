package ru.geekbrains.university.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.university.model.Student;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {


}




































//    Optional<Student> findByName(String name);
//    List<Student> findAllByScoreBetweenAndIdGreaterThan(int min, int max, int minId);
//
//    @Query("select s from Student s where s.id = ?1 and s.name = ?2")
//    Optional<Student> customFinderById(Long id, String name);
