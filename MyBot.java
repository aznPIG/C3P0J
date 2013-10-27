import org.pircbotx.PircBotX;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.MessageEvent;

public class MyBot
{
    public static void main(String[] args) throws Exception
	{
        PircBotX bot = new PircBotX();

        bot.getListenerManager().addListener(new BasicTextCommands());

        bot.setName("JBot");
        bot.connect("irc.esper.net");
        bot.joinChannel("#C3P0");
        bot.setVerbose(true);
	}

}