package com.example.services;

/**
 * Created by jeff on 5/3/2017.
 */

import java.util.List;
// T denotes Type - it will accept any types that extend the interface

public interface CRUDService<T> {
    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate(T domainObject);

    void delete(Integer id);
}