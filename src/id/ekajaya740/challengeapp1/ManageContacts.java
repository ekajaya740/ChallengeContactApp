package id.ekajaya740.challengeapp1;

import java.util.HashMap;
import java.util.Map;

public class ManageContacts extends Option{
    private Map<String, String> contactMap = new HashMap<>();

    public Map<String, String> getContactMap() {
        return contactMap;
    }

    @Override
    public void show() {
        if(contactMap.isEmpty()){
            System.out.println("Your contact is empty");
        }else{
            contactMap.entrySet().forEach(entry->{
                System.out.println("~~> " + "Name: " + entry.getKey() + "\t|\tPhone Number: " + entry.getValue() + "\n");
            });
        }
    }

    @Override
    public void create(String name, String mesg) {
        contactMap.put(name, mesg);
        System.out.println("Contact created" +
                "\n\tName: " + name +
                "\n\tPhone Number: " + mesg
        );
    }

    public void search(String name){
        if(contactMap.get(name) == null){
            System.out.println("No contacts with that name");
        }else{
            System.out.println("Phone Number: " + contactMap.get(name));
        }
    }

    public void delete(String name){
        if(contactMap.isEmpty()){
            System.out.println("Your contact is empty");
        }else if(!contactMap.isEmpty() && contactMap.containsKey(name)){
            contactMap.remove(name);
            System.out.println(name + " is removed");
        }else{
            System.out.println("No contact with that name");
        }
    }
}
