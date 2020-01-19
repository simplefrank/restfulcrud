package com.my.restfulcrud.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyListener implements ServletRequestListener, ServletContextListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("my request is destroyed!");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("my request is initialized!");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("my web is initialized!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("my web is destroyed!");
    }
}
