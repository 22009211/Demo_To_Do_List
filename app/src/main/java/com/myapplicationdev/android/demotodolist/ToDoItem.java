package com.myapplicationdev.android.demotodolist;

import java.util.Calendar;

public class ToDoItem {

    private String title;
    private Calender date;

    public ToDoItem(String title, Calender date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Calender getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Calender date) {
        this.date = date;
    }

    @Override
    public String toString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"
                +date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR)
                + " (" + getDay(date.get(Calendar.DAY_OF_WEEK)) + ")";
        return str;
    }

    private String getDay(int day) {
        //;
    }
}
