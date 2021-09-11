package com.example.LearnIntellij.Services;

import com.example.LearnIntellij.Models.MyDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class GetCurrentTimeService {
    @Autowired
    MyDate myDate;

    public String getCurrentTime() {
        myDate.setDate(Calendar.getInstance().getTime());
        myDate.setDateString(myDate.getDate().toString());
        return myDate.getDateString();
    }
}
