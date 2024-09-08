package com.tasktracker.backend.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private Integer id;
    private String text;
    private String day;
    private boolean reminder;
}