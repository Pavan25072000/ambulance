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
    UserDetails userdetails = new UserDetails();

    public void user_signup() {

        
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
        System.out.println("enter your lattitude");
        userdetails.lattitude = sc.nextFloat();
        System.out.println("enter your longitude");
        userdetails.longitude = sc.nextFloat();
        System.out.println("enter your maximum range to book a application ");
        userdetails.maximum_distance = sc.nextFloat();
        userStorage.add(userdetails);
        System.out.println(userStorage);
    }

    public void user_signin() {
        String mail = sc.next();
        String passkey = sc.next();

        for (int i = 0; i < userStorage.size(); i++) {
            if (mail.equals(userStorage.get(i).mail) && passkey.equals(userStorage.get(i).passkey)) {
                System.out.println("access is successfull");
                userdetails.lattitude = sc.nextFloat();
                System.out.println("enter your longitude");
                 userdetails.longitude = sc.nextFloat();
                 System.out.println("enter your maximum range to book a application ");
                 userdetails.maximum_distance = sc.nextFloat();

            } else {
                System.out.println("access is denied");
            }
        }
    }

}
