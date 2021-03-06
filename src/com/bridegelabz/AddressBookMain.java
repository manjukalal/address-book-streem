package com.bridegelabz;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        Scanner Scan = new Scanner(System.in);

        try {
            InputStream inputStream = new FileInputStream("C:\\Users\\Rakesh k\\ideaProjects\\addressbook-system-streem\\src\\com\\bridgelabz\\addressbook");
            int byteData = inputStream.read();
            if (byteData != -1) {
                System.out.println(byteData);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }

        File file = new File("C:\\Users\\Rakesh k\\ideaProjects\\addressbook-system-streem\\src\\com\\bridgelabz\\addressbook");
        try {
            boolean isFileCreated = file.createNewFile();
            if (isFileCreated) {
                System.out.println("File Created successfully!!1");
            } else {
                System.out.println("Something went wrong or file already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        AddressBookMain addressBookMain = new AddressBookMain();

        addressBookMain.choose();
    }

    public void choose() {
        MultipleAddressBook multipleaddressbook = new MultipleAddressBook();
        AddressBook addressbook = new AddressBook();
        while (true) {
            System.out.println("Enter \n 1. To add The new AddressBook\n 2. To do AddressBook functions\n 3. To delete the AddressBook\n " + "4. To Print the AddressBook\n 5. To Print the contacts in AddressBook\n 6. To book options\n 0. to exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    multipleaddressbook.addAddressBook();
                    break;
                case 2:
                    multipleaddressbook.addressBookFunctions();
                    break;
                case 3:
                    multipleaddressbook.deleteBook();
                    break;
                case 4:
                    multipleaddressbook.printBook();
                    break;
                case 5:
                    multipleaddressbook.printContactsInBook();
                    break;
                case 6:
                    addressbook.viewByOptions();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the wrong input");
            }
        }
    }
}