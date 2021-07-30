package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    @Query(value = "SELECT * FROM PERSON WHERE FIRST_NAME = ?1", nativeQuery = true)
    List<Person> findByName(String name);
}
