package ru.innopolis.smoldyrev.dao;
import ru.innopolis.smoldyrev.pojo.Man;

import java.util.List;

public interface IPeopleDAO {

    List<Man> getAll();

    Man getById(Integer id);

}
