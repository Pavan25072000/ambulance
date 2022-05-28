package com.ambulance.User;

public class UserDetails {
    // public void input(String args[]){
    // Scanner sc= new Scanner(System.in);
    // System.out.print("enter your name");
    String name;
    // System.out.print("enter your mail");
    String mail;
    // System.out.print("enter your passkey");
    String passkey;
    // System.out.print("enter your phoneno");
    String phone_no;
    // System.out.print("enter your age");
    int age;
    

    // }
    public static int givendetails;

    public static UserDetails data() {
        return null;

    }

    public String toString() {
        return name + "  " + mail + "  " + passkey + "  " + phone_no + "  " + String.valueOf(age);

    }

}

