package com.ambulance;

import com.ambulance.User.UserInterface;
import com.ambulance.User.DriverInterface;
import java.util.Scanner;
import java.util.List;
import com.ambulance.User.DriverDetails;

/**
 * Hello world!
 */
public final class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInterface userService = new UserInterface();
        DriverInterface driverService = new DriverInterface();
        while (true) {
            System.out.println("enter you are a " + "driver" + " or " + "user" + " or " + "exit");
            String user = scan.nextLine();
            if (user.equals("exit")) {
                break;
            }

            else if (user.equals("user")) {
                System.out.println("enter you have to signup or signin or menu or exit");
                String sign_up = scan.nextLine();
                if (sign_up.equals("menu")) {
                    continue;
                } else if (sign_up.equals("signup")) {
                    userService.user_signup();
                    System.out.println(
                            "select or enter your option like a word called location (longitude,lttitude) or menu or exit");
                    String enter = scan.nextLine();
                    if (enter.equals("location")) {
                        List<DriverDetails> nearest_service;
                        nearest_service = driverService.shortest_distance();
                        for (DriverDetails i : nearest_service) {
                            System.out.print(i);
                        }
                    } else if (sign_up.equals("menu")) {
                        continue;
                    } else if (sign_up.equals("exit")) {
                        break;
                    } else {
                        System.out.println("Your option is invalid");
                    }

                }

                else if (sign_up.equals("signin")) {
                    userService.user_signin();
                    if (true) {
                        System.out.println(
                                "select or enter your option like a word called location (longitude,lttitude) or menu or exit");
                        String enter = scan.nextLine();
                        if (enter.equals("location")) {
                            List<DriverDetails> nearest_service;
                            nearest_service = driverService.shortest_distance();
                            for (DriverDetails i : nearest_service) {
                                System.out.print(i);
                            }

                        } else if (enter.equals("menu")) {
                            continue;
                        } else if (enter.equals("exit")) {
                            break;
                        } else {
                            System.out.println("Your option is invalid");
                        }

                    }
                } else if (sign_up.equals("menu")) {
                    continue;
                } else if (sign_up.equals("exit")) {
                    break;
                } else {
                    System.out.println("Your option is invalid");
                }

            } else if (user.equals("driver")) {
                System.out.println("enter you have to signup or signin or menu or exit");
                String sign_up = scan.next();
                if (sign_up.equals("menu")) {
                    continue;
                } else if (sign_up.equals("signup")) {
                    driverService.Driver_signup();

                } else if (sign_up.equals("signin")) {
                    driverService.Driver_login();
                    if (true) {
                        System.out.println("please enter  location or menu");
                        String location = scan.nextLine();
                        if (location.equals("location")) {
                            System.out.println("enter your location with a referance of  longitude");
                            driverService.driverdetails.driverlocation.longitude = scan.nextFloat();
                            System.out.println("enter your location with a referance of  lattitude");
                            driverService.driverdetails.driverlocation.lattitude = scan.nextFloat();
                        } else if (location.equals("menu")) {
                            continue;
                        } else {
                            System.out.println("invalid input");
                        }

                    }
                } else if (sign_up.equals("exit")) {
                    break;
                } else {
                    System.out.println("Your option is invalid");
                }

            } else if (user.equals("exit")) {
                break;
            } else {
                System.out.println("Your option is invalid");
            }

        }

    }
}
