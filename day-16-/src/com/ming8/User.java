package com.ming8;

import java.util.Objects;

public class User {
    private String user;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user1 = (User) o;
        return Objects.equals(getUser(), user1.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getPassword());
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }
}
