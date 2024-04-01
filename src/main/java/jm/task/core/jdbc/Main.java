package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;



public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();


        userDao.saveUser("Marina", "Salnikova", (byte) 23);
        userDao.saveUser("Ivan", "Semenov", (byte) 25);
        userDao.saveUser("Sergey", "Ivanov", (byte) 31);
        userDao.saveUser("Olga", "Sergeeva", (byte) 38);

        userDao.removeUserById(1);
        System.out.println(userDao.getAllUsers());

        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}

