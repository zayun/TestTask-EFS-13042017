package ru.innopolis.smoldyrev.service;

import ru.innopolis.smoldyrev.exceptions.PeopleServiceException;
import ru.innopolis.smoldyrev.pojo.Man;

import java.util.List;

/**
 * Created by smoldyrev on 12.04.17.
 */
public interface IPeopleService {

    List<Man> getAll() throws PeopleServiceException;

    Man getById(Integer id) throws PeopleServiceException;
}
