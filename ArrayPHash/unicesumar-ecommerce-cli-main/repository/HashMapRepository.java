package repository;

import entities.Entity;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class HashMapRepository<T extends Entity> implements EntityRepository<T> {
    private HashMap<UUID, T> dataStore = new HashMap<>();

    @Override
    public void save(T entity) {

    }

    @Override
    public Optional<T> findById(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<T> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(UUID id) {

    }
}
