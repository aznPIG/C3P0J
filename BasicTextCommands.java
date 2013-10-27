import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

public class BasicTextCommands extends ListenerAdapter {

    public void onMessage(MessageEvent event) throws Exception
    {
    	String fullMessage = event.getMessage();
    	if (fullMessage.startsWith(".say "))
    		event.respond(fullMessage.substring(5));
        
        String fullMessage = event.getMessage();
        if (fullMessage.startsWith(".help"))
            event.respond("Available Commands: .say  .help");

    }
}
