import java.util.ArrayList;


public class MessagingService {
    private ArrayList<Message> messages;
    
    public MessagingService(){
        messages = new ArrayList<>();
    }
    
    public void add(Message msg){
        if(msg.getContent().length() <= 280){
            messages.add(msg);
        }
    }
    
    public ArrayList<Message> getMessages(){
        return messages;
    }
    
}
