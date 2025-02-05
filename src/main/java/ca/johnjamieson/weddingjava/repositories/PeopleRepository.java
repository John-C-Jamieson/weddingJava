package ca.johnjamieson.weddingjava.repositories;

import ca.johnjamieson.weddingjava.models.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Provides basic CRUD operations for the People entity
@Repository
public interface PeopleRepository extends JpaRepository<People, Long>
{
    // Additional query methods (if needed) can be defined here.
}
