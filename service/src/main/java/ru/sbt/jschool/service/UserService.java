package ru.sbt.jschool.service;

import ru.sbt.jschool.model.User;
import ru.sbt.jschool.util.exception.NotFoundException;

import java.util.List;

public interface UserService {
    User create(User user);

    boolean delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    List<User> getAll();
}
