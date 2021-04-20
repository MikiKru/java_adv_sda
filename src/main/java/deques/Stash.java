package deques;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stash {
    // Queue - kolejka jednokierunkowa FIFO
    // Deque - kolejka dwukierunkowa
    private Deque<String> messages = new ArrayDeque<>();

    public void sendMessage(String message){
        messages.addLast(message);
    }
    public String receiveMessage(){
        return messages.removeFirst();
    }
    public void getMessages(){
        for(String message : messages){
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        Stash stash = new Stash();
        stash.sendMessage("M1");
        stash.sendMessage("M2");
        stash.sendMessage("M3");
        stash.getMessages();
        System.out.println(stash.receiveMessage());
        System.out.println(stash.receiveMessage());
        System.out.println(stash.receiveMessage());
        stash.getMessages();
    }
}
