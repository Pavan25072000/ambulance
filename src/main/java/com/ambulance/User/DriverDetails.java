package com.ambulance.User;


public class DriverDetails {
    String name ;
    String mail;
    String passkey;
    String phone_no;
    int age;
    String hospital_name;
    String ambulance_number;
     public Location driverlocation = new Location();
    public String toString(){
        return name+" "+mail+" "+passkey+" "+phone_no+" "+String.valueOf(age)+" "+hospital_name+" "+ambulance_number;
    }
    
}
