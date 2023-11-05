package application.repository.impl;

import application.model.PersonEntity;
import application.repository.PersonRepository;

import java.util.Optional;

public class AddressRespositoryImpl implements PersonRepository {
    @Override
    public PersonEntity save(PersonEntity entity) {
        return null;
    }

    @Override
    public Optional<PersonEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Iterable<PersonEntity> findAll() {
        return null;
    }

    @Override
    public void delete(PersonEntity entity) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
