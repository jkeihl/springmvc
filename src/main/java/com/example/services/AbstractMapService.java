package com.example.services;

import com.example.domain.DomainObject;

import java.util.*;

/**
 * Created by jeff on 5/3/2017.
 */
public class AbstractMapService {
    protected Map<Integer, DomainObject> domainMap;

    public AbstractMapService() {

        domainMap = new HashMap<>();
    }

    public List<DomainObject> listAll() {
        return new ArrayList<>(domainMap.values());
    }

    public DomainObject getById(Integer id) {
        return domainMap.get(id);
    }

    public DomainObject saveOrUpdate(DomainObject domainObject) {
        if (domainObject != null){

            if (domainObject.getId() == null){
                domainObject.setId(getNextKey());
            }
            domainMap.put(domainObject.getId(), domainObject);

            return domainObject;
        } else {
            throw new RuntimeException("Object Can't be null");
        }
    }

    public void delete(Integer id) {
        domainMap.remove(id);
    }

    private Integer getNextKey(){
    System.out.println("Got Here");
    // This is causing an error...if I comment out and hardcode to 1 it works
        if (domainMap.isEmpty()) {
            return 1;
        } else {
            return Collections.max(domainMap.keySet()) + 1;
        }

    }
}
