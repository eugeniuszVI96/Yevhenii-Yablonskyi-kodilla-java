package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {


    @Bean
    public TaskList taskList1() {
        return new TaskList();
    }

    @Bean
    public TaskList taskList2() {
        return new TaskList();
    }

    @Bean
    public TaskList taskList3() {
        return new TaskList();
    }

    @Bean
    public Board board() {
        return new Board(taskList1(), taskList2(), taskList3());
    }
}
