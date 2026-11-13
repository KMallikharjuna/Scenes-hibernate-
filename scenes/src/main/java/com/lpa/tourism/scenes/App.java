package com.lpa.tourism.scenes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lpa.tourism.scenes.config.EmployeeService;
import com.lpa.tourism.scenes.entities.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        service.menu();
    }
}
