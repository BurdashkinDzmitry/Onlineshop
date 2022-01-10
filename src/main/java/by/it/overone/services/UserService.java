package by.it.overone.services;

import by.it.overone.entity.User;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface UserService {

  void save (User user);
  User getById(int id);

  List<User> findAll();
  void update (User user);
  void delete (int id);
}
