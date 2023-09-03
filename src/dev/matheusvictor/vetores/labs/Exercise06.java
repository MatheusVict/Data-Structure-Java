package dev.matheusvictor.vetores.labs;

import dev.matheusvictor.vetores.Lista;
import dev.matheusvictor.vetores.tests.Contact;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lista<Contact> contactLista = new Lista<Contact>(20);
        System.out.println("Get how many contacts I should add");

        createManyContacts(5, contactLista);

        int option = 1;

        while (option != 0) {
            option = getOptionMenu(scanner);

            switch (option) {
                case 1:
                    addAtEndIndex(scanner, contactLista);
                    break;
                case 2:
                    addAtPosition(scanner, contactLista);
                    break;
                case 3:
                    getContactByPosition(scanner, contactLista);
                    break;
                case 4:
                    getContact(scanner, contactLista);
                    break;
                case 5:
                    getLastIndex(scanner, contactLista);
                    break;
                case 6:
                    contactExists(scanner, contactLista);
                    break;
                case 7:
                    deleteByIndex(scanner, contactLista);
                    break;
                case 8:
                    delete(scanner, contactLista);
                    break;
                case 9:
                    getVectorSize(contactLista);
                    break;
                case 10:
                    clearVector(contactLista);
                    break;
                case 11:
                    printVector(contactLista);
                    break;
                default:
                    break;
            }
        }

        System.out.println("You wrote 0");

    }

    private static void printVector(Lista<Contact> contactLista) {
        System.out.println("Contact list here: " + contactLista);
    }

    private static void clearVector(Lista<Contact> contactLista) {
        contactLista.clear();

        System.out.println("Vector cleaned up: " + contactLista.getSize());
    }

    private static void getVectorSize(Lista<Contact> contactLista) {
        System.out.println("The vector size is: " + contactLista.getSize());
    }

    private static void delete(Scanner scanner, Lista<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna remove a contact?", scanner);

        try {
            Contact contact = contactLista.search(position);

            contactLista.remove(contact);
            System.out.println("Contact removed");
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void deleteByIndex(Scanner scanner, Lista<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna remove a contact?", scanner);

        try {
            contactLista.remove(position);
            System.out.println("Contact removed");
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void contactExists(Scanner scanner, Lista<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna get a contact?", scanner);

        try {
            Contact contact = contactLista.search(position);
            System.out.println("Contact: " + contact);

            System.out.println("searching");
            boolean exists = contactLista.contains(contact);

            if (exists) {
                System.out.println("Contact exists");
            }
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void getLastIndex(Scanner scanner, Lista<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna get a contact?", scanner);

        try {
            Contact contact = contactLista.search(position);
            System.out.println("Contact: " + contact);

            System.out.println("searching");
            position = contactLista.search(contact);

            System.out.println("Contact found on last index " + position);
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void getContact(Scanner scanner, Lista<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna get a contact?", scanner);

        try {
            Contact contact = contactLista.search(position);
            System.out.println("Contact: " + contact);

            System.out.println("searching");
            position = contactLista.search(contact);

            System.out.println("Contact found on " + position);
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void getContactByPosition(Scanner scanner, Lista<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna get a contact?", scanner);

        try {
            Contact contact = contactLista.search(position);
            System.out.println("Contact: " + contact);
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void addAtEndIndex(Scanner scanner, Lista<Contact> contacts) {
        System.out.println("Adding a new contact...");
        String name = getInformation("write a name", scanner);
        String phone = getInformation("Write a tell", scanner);
        String email = getInformation("Write an email", scanner);

        Contact contact = new Contact(name, phone, email);

        contacts.add(contact);

        System.out.println("Contact add");
    }

    private static void addAtPosition(Scanner scanner, Lista<Contact> contacts) {
        System.out.println("Adding a new contact...");
        String name = getInformation("write a name", scanner);
        String phone = getInformation("Write a tell", scanner);
        String email = getInformation("Write an email", scanner);

        Contact contact = new Contact(name, phone, email);

        int position = getInformationInt("Type the index of the contact", scanner);

        try {

            contacts.add(position, contact);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Contact add");
        System.out.println(contact);
    }

    private static String getInformation(String message, Scanner scanner) {
        System.out.println(message);
        return scanner.nextLine();
    }

    private static int getInformationInt(String message, Scanner scanner) {
        boolean isvalidEntry = false;
        int number = -1;
        while (!isvalidEntry) {
            try {
                System.out.println(message);
                number = scanner.nextInt();
                isvalidEntry = true;
            } catch (Exception e) {
                System.out.println("type it again");
            }
        }
        return number;
    }

    private static int getOptionMenu(Scanner scanner) {
        int option = 0;
        boolean isValidOption = false;
        while (!isValidOption) {
            System.out.println("Write the option");
            System.out.println("1: Add at the last index");
            System.out.println("2: Add at the specific index");
            System.out.println("3: get contact by index");
            System.out.println("4: get contact by contact");
            System.out.println("5: get contact");
            System.out.println("6: get contact of the last index");
            System.out.println("7: remove by index");
            System.out.println("8: remove contact");
            System.out.println("9: get vector size");
            System.out.println("10: clear vector");
            System.out.println("11: print vector");
            System.out.println("0: exit");

            try {
                option = scanner.nextInt();
                isValidOption = option >= 0 && option <= 11;

            } catch (Exception e) {
                System.out.println("Select a right option");
                scanner.nextLine();
                isValidOption = false;
            }

        }
        return option;
    }

    private static void createManyContacts(int quantity, Lista<Contact> contactLista) {
        Contact contact;

        for (int i = 1; i <= quantity; i++) {
            contact = new Contact();
            contact.setName("Contact " + i);
            contact.setTel("+55 " + i * 20 + 100 / 2);
            contact.setEmail("contatc" + i + "@email.com");

            contactLista.add(contact);
        }
    }
}
