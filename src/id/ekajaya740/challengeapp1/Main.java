package id.ekajaya740.challengeapp1;

import java.util.Scanner;

/**
 * TODO: Simulate phone contact and message apps
 *
 * Greet the user
 * Show option: 1. Manage Contacts 2. Message 3. Quit
 *
 * ~Manage Contacts~
 *      1. Show all contacts
 *      2. Add a new contacts
 *      3. Search for a contact
 *      4. Delete contact
 *      5. Go back to the previous menu
 *
 * ~Message~
 *      1. See list of all messages
 *      2. Send a new message
 *      3. Go back to previous menu
 */

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        boolean isInContactOpt;
        boolean isInMsgOpt;
        Scanner s = new Scanner(System.in);
        String username;
        String name;
        String mesg;

        System.out.println("Tell your name: ");
        username = s.next();

        System.out.println("Hello, " + username);
        ManageContacts manageContacts = new ManageContacts();
        Message message = new Message();

        int option;
        System.out.println("What will you do today?");
        while(isRunning){
            System.out.println("1. Manage Contacts" + "\t2. Message" + "\t3. Quit");
            option = s.nextInt();

            switch (option){
                case 1:
                    isInContactOpt = true;
                    while (isInContactOpt){
                        System.out.println(
                                "1. Show all contacts" +
                                        "\n2. Add a new contacts" +
                                        "\n3. Search for a contact" +
                                        "\n4. Delete contact" +
                                        "\n5. Go back to the previous menu");
                        option = s.nextInt();

                        switch (option){
                            case 1:
                                manageContacts.show();
                                break;
                            case 2:
                                System.out.println("Name: ");
                                name = s.next();
                                System.out.println("Phone Number: ");
                                mesg = s.next();
                                manageContacts.create(name, mesg);
                                break;
                            case 3:
                                System.out.println("Name: ");
                                name = s.next();
                                manageContacts.search(name);
                                break;
                            case 4:
                                System.out.println("Name: ");
                                name = s.next();
                                manageContacts.delete(name);
                                break;
                            case 5:
                                isInContactOpt = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    isInMsgOpt = true;
                    while (isInMsgOpt){
                        System.out.println(
                                "1. See list of all messages" +
                                "\n2. Send a new message" +
                                "\n3. Go back to previous menu");
                        option = s.nextInt();
                        switch (option){
                            case 1:
                                message.show();
                                break;
                            case 2:
                                System.out.println("Contact Name: ");
                                name = s.next();
                                System.out.println("Your message");
                                mesg = s.nextLine();
                                mesg = s.nextLine();
                                message.create(name, mesg);
                                break;
                            case 3:
                                isInMsgOpt = false;
                                break;
                        }
                    }
                    break;
                case 3:
                    isRunning = false;
                    break;
            }
        }

    }
}
