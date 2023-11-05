package application.repository;

import application.modelDto.model.PersonEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends GenericRepository<PersonEntity, Long> {

}
