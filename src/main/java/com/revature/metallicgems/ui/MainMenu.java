package com.revature.metallicgems.ui;

import com.revature.metallicgems.models.Earring;
import com.revature.metallicgems.models.User;
import com.revature.metallicgems.services.UserService;

import java.util.List;
import java.util.Scanner;

public class MainMenu implements IMenu {
    private final User user;
    private final UserService userService;


    public MainMenu(User user, UserService userService) {
        this.user = user;
        this.userService = userService;
    }

    @Override
    public void start() {
        Scanner scan = new Scanner(System.in);

        exit: {
            while (true) {
                System.out.println("\nWelcome to the main menu " + user.getUsername() + "!");
                System.out.println("[1] View all products");
                System.out.println("[x] Sign out!");
                System.out.print("\nEnter: ");

                switch (scan.nextLine()) {
                    case "1":
                        break;
                    case "x":
                        break exit;
                    default:
                        System.out.println("\nInvalid input!");
                        break;
                }
            }
        }
    }

    public void viewProducts(){
        exit: {
            while (true) {
                System.out.println("\n Viewing all products...");
                List<Earring> earrings = new earringService.gerAllEarrings();

                for (int i = 0; i < earrings.size(); i++){
                    System.out.println("[" + (i + 1) + "]" + earrings.get(i).getColor() + earrings.get(i).getStyle());
                }
            }
        }
    }
}
