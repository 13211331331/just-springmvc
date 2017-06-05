package cn.iszt.springmvc.demo.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Created by hanlin.huang on 2017/6/5.
 */
public class MyWebAppInitializer implements WebApplicationInitializer {

    /**
     * Servlet容器启动时会自动运行该方法
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
/*
        servletContext.setInitParameter("contextConfigLocation", "classpath:applicationContext.xml");


        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
        registration.setInitParameter("contextConfigLocation", "classpath:mvc-web.xml");

        servletContext.addListener(new ContextLoaderListener());*/



        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(AppConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));

        AnnotationConfigWebApplicationContext webContext = new AnnotationConfigWebApplicationContext();
        webContext.register(WebConfig.class);
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet(webContext));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}