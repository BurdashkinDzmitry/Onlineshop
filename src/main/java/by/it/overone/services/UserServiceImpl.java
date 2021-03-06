package by.it.overone.services;

import by.it.overone.dao.UserDao;
import by.it.overone.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    public UserDao userDao;

    @Override
    public void save(User user) {
         userDao.save(user);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public List<User> findAll() {

        return userDao.findAll();
    }

    @Override
    public void update(User user) {
userDao.update(user);
    }

    @Override
    public void delete(int id) {
userDao.delete(id);
    }
}
