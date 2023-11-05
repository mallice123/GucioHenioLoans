package application.repository.impl;

import application.model.OccupationEntity;
import application.repository.OccupationRepository;

import java.util.Optional;

public class OccupationRepositoryImpl implements OccupationRepository {

    @Override
    public OccupationEntity save(OccupationEntity entity) {
        return null;
    }

    @Override
    public Optional<OccupationEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Iterable<OccupationEntity> findAll() {
        return null;
    }

    @Override
    public void delete(OccupationEntity entity) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
