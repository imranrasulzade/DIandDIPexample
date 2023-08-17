package com.matrix.dianddiptaskm5l8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DIandDiPtaskM5L8Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DIandDiPtaskM5L8Application.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
//        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        StudentServiceImpl studentServiceImpl = (StudentServiceImpl) context.getBean("studentServiceImpl");
//
//        System.out.println(studentServiceImpl.hello());
    }
}
