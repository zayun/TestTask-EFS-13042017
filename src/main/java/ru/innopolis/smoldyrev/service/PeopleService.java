package ru.innopolis.smoldyrev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import ru.innopolis.smoldyrev.dao.IPeopleDAO;
import ru.innopolis.smoldyrev.pojo.Man;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smoldyrev on 12.04.17.
 */
@Service
public class PeopleService implements IPeopleService {


    private IPeopleDAO peopleDAO;

    @Autowired
    public void setPeopleDAO(IPeopleDAO peopleDAO) {
        this.peopleDAO = peopleDAO;
    }

    public List<Man> getAll() {
        return peopleDAO.getAll();
    }

    public Man getById(Integer id) {
        return peopleDAO.getById(id);
    }

}
