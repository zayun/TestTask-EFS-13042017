package ru.innopolis.smoldyrev.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.innopolis.smoldyrev.dao.IPeopleDAO;
import ru.innopolis.smoldyrev.exceptions.PeopleServiceException;
import ru.innopolis.smoldyrev.pojo.Man;

import java.util.List;

@Service
public class PeopleService implements IPeopleService {

    private static Logger logger = Logger.getLogger(PeopleService.class);

    private IPeopleDAO peopleDAO;

    @Autowired
    public void setPeopleDAO(IPeopleDAO peopleDAO) {
        this.peopleDAO = peopleDAO;
    }

    public List<Man> getAll() throws PeopleServiceException {
        List<Man> peoples = peopleDAO.getAll();
        if (peoples.size()==0) {
            logger.error("TROUBLE WITH LOADING");
            throw new PeopleServiceException("Данные не загружены!");
        }
        return peopleDAO.getAll();
    }

    public Man getById(Integer id) throws PeopleServiceException {
        Man man = peopleDAO.getById(id);
        if (man == null) {
            logger.error("MAN WITH ID: "+id+"NOT FOUND");
            throw new PeopleServiceException("Человек с таким ID не найден!");
        }
        return man;
    }

}
