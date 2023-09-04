package dev.matheusvictor.vetores.labs;

import dev.matheusvictor.vetores.Lista;
import dev.matheusvictor.vetores.tests.Contact;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise07 extends Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Contact> contactLista = new ArrayList<>(20);
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

    private static void printVector(ArrayList<Contact> contactLista) {
        System.out.println("Contact list here: " + contactLista);
    }

    private static void clearVector(ArrayList<Contact> contactLista) {
        contactLista.clear();

        System.out.println("Vector cleaned up: " + contactLista.size());
    }

    private static void getVectorSize(ArrayList<Contact> contactLista) {
        System.out.println("The vector size is: " + contactLista.size());
    }

    private static void delete(Scanner scanner, ArrayList<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna remove a contact?", scanner);

        try {
            Contact contact = contactLista.remove(position);

            contactLista.remove(contact);
            System.out.println("Contact removed");
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void deleteByIndex(Scanner scanner, ArrayList<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna remove a contact?", scanner);

        try {
            contactLista.remove(position);
            System.out.println("Contact removed");
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void contactExists(Scanner scanner, ArrayList<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna get a contact?", scanner);

        try {
            Contact contact = contactLista.get(position);
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

    private static void getLastIndex(Scanner scanner, ArrayList<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna get a contact?", scanner);

        try {
            Contact contact = contactLista.get(position);
            System.out.println("Contact: " + contact);

            System.out.println("searching");
            position = contactLista.lastIndexOf(contact);

            System.out.println("Contact found on last index " + position);
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void getContact(Scanner scanner, ArrayList<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna get a contact?", scanner);

        try {
            Contact contact = contactLista.get(position);
            System.out.println("Contact: " + contact);

            System.out.println("searching");
            position = contactLista.lastIndexOf(contact);

            System.out.println("Contact found on " + position);
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void getContactByPosition(Scanner scanner, ArrayList<Contact> contactLista) {
        int position = getInformationInt("Which position do you wanna get a contact?", scanner);

        try {
            Contact contact = contactLista.get(position);
            System.out.println("Contact: " + contact);
        } catch (Exception e) {
            System.out.println("invalid position");
        }
    }

    private static void addAtEndIndex(Scanner scanner, ArrayList<Contact> contacts) {
        System.out.println("Adding a new contact...");
        String name = getInformation("write a name", scanner);
        String phone = getInformation("Write a tell", scanner);
        String email = getInformation("Write an email", scanner);

        Contact contact = new Contact(name, phone, email);

        contacts.add(contact);

        System.out.println("Contact add");
    }

    private static void addAtPosition(Scanner scanner, ArrayList<Contact> contacts) {
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

    protected static void createManyContacts(int quantity, ArrayList<Contact> contactLista) {
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
