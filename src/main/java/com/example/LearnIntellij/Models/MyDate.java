package com.example.LearnIntellij.Models;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class MyDate {
    Date date;
    String dateString;
}
