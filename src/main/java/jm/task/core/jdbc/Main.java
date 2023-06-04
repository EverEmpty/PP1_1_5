package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Bob", "Akerman", (byte) 29);
        userService.saveUser("Mike", "Dsmbr", (byte) 27);
        userService.saveUser("Nik", "Ivanov", (byte) 40);
        userService.saveUser("Nicole", "Goldman", (byte) 24);
        userService.saveUser("Lidia", "Tereshkina", (byte) 55);
        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.close();
    }
}
