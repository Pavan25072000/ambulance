package com.ambulance.User;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DriverInterface {
    Scanner sc = new Scanner(System.in);
    public List<DriverDetails> driverstorage;
    public DriverDetails driverdetails;

    public DriverInterface() {
        // driverdetails = new DriverDetails();
        // driverstorage = new ArrayList<>();
        // driverdetails.name = "naveen";
        // driverdetails.age = 24;
        // driverdetails.ambulance_number ="KD01EQ1866";
        // driverdetails.driverlocation.lattitude = 9;
        // driverdetails.driverlocation.lattitude = 15;
        // driverdetails.hospital_name = "Rainbow Hospital";
        // driverdetails.name = "n@gmail.com";
        // driverdetails.passkey = "7019";
        // driverdetails.phone_no = "9019462109";
        // driverstorage.add(driverdetails);

        // driverdetails = new DriverDetails();
        // driverstorage = new ArrayList<>();
        // driverdetails.name = "yes";
        // driverdetails.age = 24;
        // driverdetails.ambulance_number ="KD01EQ1866";
        // driverdetails.driverlocation.lattitude = 9;
        // driverdetails.driverlocation.longitude = 10;
        // driverdetails.hospital_name = "KGB Hospital";
        // driverdetails.name = "n@gmail.com";
        // driverdetails.passkey = "7019";
        // driverdetails.phone_no = "9019462109";
        // driverstorage.add(driverdetails);
    }


    public void Driver_signup() {
        driverdetails = new DriverDetails();

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

    public boolean Driver_login() {
        String mail = sc.next();
        String passkey = sc.next();
        for (int i = 0; i < driverstorage.size(); i++) {
            if (mail.equals(driverstorage.get(i).mail) && passkey.equals(driverstorage.get(i).passkey)) {
            return true;
            }
        } 
            return false;
    }



    public List<DriverDetails> shortest_distance() {
        List<DriverDetails> output = new ArrayList<>();
        for (int i = 0; i < driverstorage.size(); i++) {
            System.out.println("enter your location with a referance of  lattitude");
            float lattitude = sc.nextFloat();
            System.out.println("enter your location with a referance of  longitude");
            float longitude = sc.nextFloat();
            System.out.println("enter your maximum range to book a ambulance ");
            float maximum_distance = sc.nextFloat();
            float latt = lattitude - driverstorage.get(i).driverlocation.lattitude;
            float longi = longitude - driverstorage.get(i).driverlocation.longitude;
            double place = (latt * latt) + (longi * longi);
            double root = Math.sqrt(place);
            if (root <= maximum_distance) {
                output.add(driverstorage.get(i));
            }

        }
        return output;

    }

}
