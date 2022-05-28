package com.ambulance.User;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DriverInterface {
    Scanner sc = new Scanner(System.in);
   public List<DriverDetails> driverstorage;

    public DriverInterface() {
        driverstorage = new ArrayList<>();
    }
    DriverDetails driverdetails = new DriverDetails();

    public void Driver_signup() {
        System.out.println("enter your name");
        driverdetails.name = sc.nextLine();
        System.out.println("enter your mail");
        driverdetails.mail = sc.next();
        System.out.println("enter your passkey");
        driverdetails.passkey = sc.next();
        System.out.println("enter your age");
        driverdetails.age = sc.nextInt();
        System.out.println("enter your phone number");
        driverdetails.phone_no = sc.next();
        System.out.println("enter your ambulance number");
        driverdetails.ambulance_number = sc.next();
        System.out.println("enter hospital name that you are working at");
        driverdetails.hospital_name = sc.next();
        System.out.println("enter your location with a referance of  longitude");
        driverdetails.driverlocation.longitude = sc.nextFloat();
        System.out.println("enter your location with a referance of  lattitude");
        driverdetails.driverlocation.lattitude = sc.nextFloat();
        driverstorage.add(driverdetails);
    }

    public void Driver_login() {
        String mail = sc.next();
        String passkey = sc.next();
        for (int i = 0; i < driverstorage.size(); i++) {
            if (mail.equals(driverstorage.get(i).mail) && passkey.equals(driverstorage.get(i).passkey)) {
                System.out.println("Access Accepted");
                while(true){
                System.out.println("please enter  location or menu");
                String location = sc.nextLine();
                if(location.equals("location")){
                    System.out.println("enter your location with a referance of  longitude");
                    driverdetails.driverlocation.longitude = sc.nextFloat();
                    System.out.println("enter your location with a referance of  lattitude");
                    driverdetails.driverlocation.lattitude = sc.nextFloat();
                }
                if(location.equals("menu")){
                    continue;
                }
                else{
                    System.out.println("sorry we didnot have your option");
                }
            }

            } else {
                System.out.println("Access denied");
            }
        }
    }
    public List<DriverDetails> shortest_distance(){
        for(int i=0 ; i<driverstorage.size();i++)
        
        return null;
        
    }
    

}
