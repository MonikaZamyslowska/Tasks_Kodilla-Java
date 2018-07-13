package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    TaskList toDo;
    TaskList inProgress;
    TaskList done;

    @Bean
    public Board board() {
        return new Board(toDo, inProgress, done);
    }

    @Bean(name = "report back")
    @Scope("prototype")
    public TaskList getListToDo() {
        return new TaskList();
    }

}
