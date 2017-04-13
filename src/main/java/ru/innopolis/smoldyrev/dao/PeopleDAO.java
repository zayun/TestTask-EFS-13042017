package ru.innopolis.smoldyrev.dao;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import ru.innopolis.smoldyrev.pojo.Man;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by smoldyrev on 12.04.17.
 */
@Repository
@Scope("prototype")
public class PeopleDAO implements IPeopleDAO {

    private static Logger logger = Logger.getLogger(PeopleDAO.class);

    private static final List<Man> PEOPLES = loadDataFromResource();

    private static final String FILE_PATH = "tempData.txt";

    private static List<Man> loadDataFromResource() {

        List<Man> peoples = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try (InputStream stream = PeopleDAO.class.getClassLoader().getResourceAsStream(FILE_PATH);
             BufferedReader br = new BufferedReader(new InputStreamReader(stream))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\s");
                Man man = new Man(Integer.parseInt(data[0]),
                        data[1], sdf.parse(data[2]), Integer.parseInt(data[3]),
                        Integer.parseInt(data[4]), new Boolean(data[5]));
                peoples.add(man);
            }
        } catch (FileNotFoundException ex) {
            logger.error("файл не найден!!!");
        } catch (IOException e) {
            logger.error("проблемка");
        } catch (ParseException e) {
            logger.error("некорректная дата");
        }
        return peoples;
    }

    public List<Man> getAll() {
        return PEOPLES;
    }

    public Man getById(Integer id) {
        for (Man man :
                PEOPLES) {
            if (man.getNumber().equals(id)) return man;
        }
        return null;
    }

}
