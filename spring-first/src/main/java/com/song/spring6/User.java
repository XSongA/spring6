package com.song.spring6;

public class User {
    public User() {
        System.out.println("noArgsConstructor...");
    }

    public void add() {
        System.out.println("add...");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
