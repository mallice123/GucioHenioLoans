package application.repository;

import application.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataStubRepository extends JpaRepository<PersonEntity,Long> {

}
