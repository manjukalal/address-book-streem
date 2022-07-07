package com.bridegelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.choose();
    }

    public void choose() {
        MultipleAddressBook multipleaddressbook = new MultipleAddressBook();
        while (true) {
            System.out.println("Enter \n 1. To add The new AddressBook\n 2. To add contact in AddressBook\n " + "3. To edit the contact in AddressBook\n 4. To delete the contact in AddressBook\n 5. To delete the AddressBook\n " + "6. To Print the AddressBook\n 7. To Print the contacts in AddressBook\n 0. to exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    multipleaddressbook.addAddressBook();
                    break;
                case 2:
                    multipleaddressbook.addContact();
                    break;
                case 3:
                    multipleaddressbook.editContactInBook();
                    break;
                case 4:
                    multipleaddressbook.deleteContactInBook();
                    break;
                case 5:
                    multipleaddressbook.deleteAddressBook();
                    break;
                case 6:
                    multipleaddressbook.printBook();
                    break;
                case 7:
                    multipleaddressbook.printContactsInBook();
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

