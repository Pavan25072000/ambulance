package com.ambulance;

import com.ambulance.User.UserInterface;
import com.ambulance.User.DriverInterface;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        UserInterface userService = new UserInterface();
        DriverInterface driverService = new DriverInterface();
        float longitude;
        float lattitude;
        while (true) {
            System.out.println("enter you are a " + "driver" + " or " + "user" + " or " + "exit");
            String user = scan.nextLine();
            if (user.equals("exit")) {
                break;
            }

            if (user.equals("user")) {
                System.out.println("enter you have to signup or signin or menu or exit");
                String sign_up = scan.nextLine();
                if (sign_up.equals("menu")) {
                    continue;
                }
                if (sign_up.equals("signup")) {
                    userService.user_signup();
                    System.out.println("select or enter your location (longitude,lttitude) or menu or exit");
                    String enter = scan.nextLine();
                    if (enter.equals("location")) {
                        System.out.println("enter your longitude");
                        lattitude = scan.nextFloat();
                        System.out.println("enter your longitude");
                        longitude = scan.nextFloat();
                        while(true){
                            
                        }

                    }
                    if (sign_up.equals("menu")) {
                        continue;
                    }
                    if (sign_up.equals("exit")) {
                        break;
                    } else {
                        System.out.println("Your option is invalid");
                    }

                } else {
                    System.out.println("Your option is invalid");
                }
                if (sign_up.equals("signin")) {
                    userService.user_signin();
                    System.out.println(
                            "select or enter your option like a word called location (longitude,lttitude) or menu or exit");
                    String enter = scan.nextLine();
                    if (enter.equals("location")) {
                        System.out.println("enter your longitude");
                        lattitude = scan.nextFloat();
                        System.out.println("enter your longitude");
                        longitude = scan.nextFloat();
                    }
                    if (sign_up.equals("menu")) {
                        continue;
                    }
                    if (sign_up.equals("exit")) {
                        break;
                    } else {
                        System.out.println("Your option is invalid");
                    }

                }
                if (user.equals("exit")) {
                    break;
                }

            }

            if (user.equals("driver")) {
                System.out.println("enter you have to signup or signin or menu or exit");
                String sign_up = scan.next();
                if (sign_up.equals("menu")) {
                    continue;
                }
                if (sign_up.equals("signup")) {
                    driverService.Driver_signup();
                    System.out.println("select or enter your location (longitude,lttitude) or menu or exit");
                    String enter = scan.nextLine();
                    if (enter.equals("location")) {
                        System.out.println("enter your longitude");
                        lattitude = scan.nextFloat();
                        System.out.println("enter your longitude");
                        longitude = scan.nextFloat();
                    }
                    if (sign_up.equals("menu")) {
                        continue;
                    }
                    if (sign_up.equals("exit")) {
                        break;
                    } else {
                        System.out.println("Your option is invalid");
                    }

                }
                if (sign_up.equals("signin")) {
                    driverService.Driver_login();
                    System.out.println("select or enter your location (longitude,lttitude) or menu or exit");
                    String enter = scan.nextLine();
                    if (enter.equals("location")) {
                        System.out.println("enter your longitude");
                        lattitude = scan.nextFloat();
                        System.out.println("enter your longitude");
                        longitude = scan.nextFloat();
                    }
                    if (sign_up.equals("menu")) {
                        continue;
                    }
                    if (sign_up.equals("exit")) {
                        break;
                    } else {
                        System.out.println("Your option is invalid");
                    }

                }
                if (user.equals("exit")) {
                    break;
                } else {
                    System.out.println("Your option is invalid");
                }

            } else {
                System.out.println("Your option is invalid");
            }
        }
    }
}
