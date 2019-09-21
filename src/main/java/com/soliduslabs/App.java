package com.soliduslabs;

import com.soliduslabs.model.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

import static com.soliduslabs.Utils.*;

@SpringBootApplication
public class App implements CommandLineRunner {

    private Scanner scanner;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] split = input.split(" ");
        String command = split[0];
        String fileName = split[1];
        int balance = 0;
        try {
            balance = Integer.parseInt(split[2]);
        } catch (Exception e) {
            if (!command.equals("cat")) {
                System.out.println("Missing balance!");
                return;
            }
        }

        List<Item> itemList = getItemsFromFile(fileName);

        if (command.equals("cat")) {
           printItems(itemList);
        }
        if (command.equals("find-pair")) {
            List<Item> pairOfGifts = getPairOfGifts(itemList, balance);
            printGiftsResult(pairOfGifts);
        }
    }
}
