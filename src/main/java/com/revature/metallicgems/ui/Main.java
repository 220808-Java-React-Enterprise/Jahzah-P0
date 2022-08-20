package com.revature.metallicgems.ui;

import com.revature.metallicgems.daos.UserDAO;
import com.revature.metallicgems.services.UserService;
import com.revature.metallicgems.ui.LoginMenu;
import com.revature.metallicgems.utils.database.ConnectionFactory;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        /* dependency injection */
//        UserDAO userDAO = new UserDAO();
//        UserService userService = new UserService(userDAO);
//        new LoginMenu(userService).start();

        new LoginMenu(new UserService(new UserDAO())).start();
    }
}
