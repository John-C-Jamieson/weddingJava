package ca.johnjamieson.weddingjava.repository;

import ca.johnjamieson.weddingjava.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Provides basic CRUD operations for the People entity
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>
{
    // Additional query methods can be defined here.
}
