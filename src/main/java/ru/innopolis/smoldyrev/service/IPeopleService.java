package ru.innopolis.smoldyrev.service;

import ru.innopolis.smoldyrev.exceptions.PeopleServiceException;
import ru.innopolis.smoldyrev.pojo.Man;

import java.util.List;

public interface IPeopleService {

    List<Man> getAll() throws PeopleServiceException;

    Man getById(Integer id) throws PeopleServiceException;
}
