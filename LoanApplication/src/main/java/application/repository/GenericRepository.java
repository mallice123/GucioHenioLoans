package application.repository;

import java.util.Optional;

public interface GenericRepository<T, ID> {
    T save(T entity);
    Optional<T> findById(ID id);
    Iterable<T> findAll();
    void delete(T entity);
    void deleteById(ID id);
}
