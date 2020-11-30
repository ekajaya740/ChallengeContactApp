package id.ekajaya740.challengeapp1;

import java.util.HashMap;
import java.util.Map;

public class Message extends Option {
    Map<String, String> message = new HashMap<>();

    ManageContacts manageContacts = new ManageContacts();

    @Override
    public void show() {
        if(message.isEmpty()){
            System.out.println("You don't have any message");
        }else{
            message.entrySet().forEach(entry ->{
                System.out.println("~~> From: " + entry.getKey() + "\n\tMessage: " + entry.getValue() + "\n");
            });
        }
    }

    @Override
    public void create(String name, String mesg) {
        if(manageContacts.getContactMap().get(name) == name){
            message.put(name, mesg);
            System.out.println("Message sent to: " + name + "\nMessage:\n" + mesg);
        }else{
            System.out.println("Message failed to sent, add this contact to your contact");
        }
    }
}
