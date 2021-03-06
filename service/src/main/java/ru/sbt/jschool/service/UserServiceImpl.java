package ru.sbt.jschool.service;

import ru.sbt.jschool.model.User;
import ru.sbt.jschool.repository.UserRepository;
import ru.sbt.jschool.util.exception.NotFoundException;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public boolean delete(int id) throws NotFoundException {
        if (!repository.delete(id))
            throw new NotFoundException("User with id = " + id + " not found");
        return true;
    }

    @Override
    public User get(int id) throws NotFoundException {
        return repository.get(id);
    }

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }
}
