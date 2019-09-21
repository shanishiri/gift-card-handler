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
//        System.out.print("Enter a file name: ");

        String input = scanner.nextLine();
        String[] split = input.split(" ");
        String fileName=split[0];
        int balance=Integer.parseInt(split[1]);

        List<Item> itemList = getItemsFromFile(fileName);

        printItems(itemList);

        List<Item> pairOfGifts = getPairOfGifts(itemList, balance);
        printGiftsResult(pairOfGifts);
    }
}
