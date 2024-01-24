package org.genzo.spring.PP_3_1_2_springBOOT_mvc_hibernate.service;

import org.genzo.spring.PP_3_1_2_springBOOT_mvc_hibernate.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);


}
