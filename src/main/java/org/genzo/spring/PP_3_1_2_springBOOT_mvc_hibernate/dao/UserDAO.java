package org.genzo.spring.PP_3_1_2_springBOOT_mvc_hibernate.dao;

import org.genzo.spring.PP_3_1_2_springBOOT_mvc_hibernate.entity.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);
}

