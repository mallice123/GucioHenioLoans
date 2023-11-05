package application.repository;

import application.modelDto.model.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataStubRepository extends JpaRepository<PersonEntity,Long> {

}
