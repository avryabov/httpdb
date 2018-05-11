package ru.sbt.jschool.repository;

import ru.sbt.jschool.model.User;
import ru.sbt.jschool.util.exception.NotFoundException;

import java.util.List;

public interface UserRepository {
    User save(User user);

    boolean delete(int id);

    User get(int id) throws NotFoundException;

    List<User> getAll();
}
