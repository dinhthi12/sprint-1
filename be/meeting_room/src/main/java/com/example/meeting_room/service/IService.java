package com.example.meeting_room.service;

import java.util.List;
import java.util.Optional;

public interface IService <T,K>{
    List<T> getAll();

    Optional<T> getById(K key);

    T save(T entity);

    void deleteById(K key);
}
