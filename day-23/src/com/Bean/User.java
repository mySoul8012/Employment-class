package com.Bean;

import java.util.Arrays;

public class User {
    private String text;
    private String[] checkbox;

    public User(String text, String[] checkbox) {
        this.text = text;
        this.checkbox = checkbox;
    }

    @Override
    public String toString() {
        return "User{" +
                "text='" + text + '\'' +
                ", checkbox=" + Arrays.toString(checkbox) +
                '}';
    }

    public User() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String[] checkbox) {
        this.checkbox = checkbox;
    }
}
