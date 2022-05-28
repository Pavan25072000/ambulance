package com.ambulance.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class UserInterface {
    Scanner sc = new Scanner(System.in);
    List<UserDetails> userStorage;

    public UserInterface() {
        userStorage = new ArrayList<>();
    }

    public void user_signup() {

        UserDetails userdetails = new UserDetails();
        System.out.println("enter your name");
        userdetails.name = sc.nextLine();
        System.out.println("enter your mail");
        userdetails.mail = sc.next();
        System.out.println("enter your passkey");
        userdetails.passkey = sc.next();
        System.out.println("enter your age");
        userdetails.age = sc.nextInt();
        System.out.println("enter your phone number");
        userdetails.phone_no = sc.next();
        userStorage.add(userdetails);
        System.out.println(userStorage);
    }

    public void user_signin() {
        String mail = sc.next();
        String passkey = sc.next();

        for (int i = 0; i < userStorage.size(); i++) {
            if (mail.equals(userStorage.get(i).mail) && passkey.equals(userStorage.get(i).passkey)) {
                System.out.println("access is successfull");

            } else {
                System.out.println("access is denied");
            }
        }
    }

}
