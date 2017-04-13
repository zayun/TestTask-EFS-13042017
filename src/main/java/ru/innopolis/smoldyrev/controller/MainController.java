package ru.innopolis.smoldyrev.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.innopolis.smoldyrev.exceptions.PeopleServiceException;
import ru.innopolis.smoldyrev.pojo.Man;
import ru.innopolis.smoldyrev.service.IPeopleService;

import java.util.List;

@Controller
public class MainController {

    private static Logger logger = Logger.getLogger(MainController.class);

    static {
        DOMConfigurator.configure("log4j.xml");
    }


    private IPeopleService peopleService;

    @Autowired
    public void setPeopleService(IPeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showListPage(Model model) throws Exception {

        List<Man> peoples = peopleService.getAll();

        if (peoples.size() > 0) {
            model.addAttribute("averHeight",
                    Math.round(peoples.stream().mapToInt(Man::getHeight).average().getAsDouble()));
            model.addAttribute("averWeight",
                    Math.round(peoples.stream().mapToInt((s) -> s.getWeight()).average().getAsDouble()));
        }
        model.addAttribute("peoples", peoples);
        return "list";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String showInfoPage(Model model,
                               @RequestParam int id) throws PeopleServiceException {
        Man man = peopleService.getById(id);
        model.addAttribute("man", man);
        return "info";
    }

}
