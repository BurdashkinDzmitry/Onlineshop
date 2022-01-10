package by.it.overone.dao;

import by.it.overone.entity.User;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface UserDao {

    void save (User user);
    User getById(int id);


    List<User> findAll();
void update (User user);
    void delete (int id);


}
