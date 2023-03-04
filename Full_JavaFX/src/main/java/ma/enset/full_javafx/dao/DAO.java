package ma.enset.full_javafx.dao;

import java.util.List;

public interface DAO <T,U>{

    T findById(U id);
    List<T> findAll();
    T save(T object);
    T update(T object);
    void delete(U id);
}
