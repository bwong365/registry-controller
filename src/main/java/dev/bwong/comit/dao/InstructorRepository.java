package dev.bwong.comit.dao;

import dev.bwong.comit.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(allowCredentials = "true")
public interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
