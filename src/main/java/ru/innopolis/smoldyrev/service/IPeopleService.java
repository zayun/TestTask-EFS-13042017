package ru.innopolis.smoldyrev.service;

import ru.innopolis.smoldyrev.pojo.Man;

import java.util.List;

/**
 * Created by smoldyrev on 12.04.17.
 */
public interface IPeopleService {

    List<Man> getAll();

    Man getById(Integer id);
}
