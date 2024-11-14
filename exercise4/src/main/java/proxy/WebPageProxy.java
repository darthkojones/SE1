package proxy;
import java.util.HashSet;
import java.util.Set;

public class WebPageProxy implements WebPage{
    private ConcreteWebPage realWebPage = new ConcreteWebPage();
    private Set<String> blacklist;

    public WebPageProxy(){
        this.blacklist = new HashSet<>();
        //blacklist some websites
        this.blacklist.add("www.definitelyNotaPornsite.com".toLowerCase()); // the only hub site i use is github
        this.blacklist.add("www.gambleYourLifeSavingsWithCrypto.net".toLowerCase()); //"can you afford to blow this shit? are you that rich?" - Eminem 1999
        this.blacklist.add("www.cheapViagra.shop".toLowerCase()); //i dont know why i keep getting popups for this
        this.blacklist.add("www.freedrugs.com".toLowerCase()); //don't be silly drugs arent free, also drugs are bad m'kay

        }
    
        ///override the render if site is blocked
        @Override
        public void render(String url){
            if(isBlocked(url)) {
                System.out.println("Uh-uh-uh naughty naughty!");
            } else {
                realWebPage.render(url);
            }
        }

        private boolean isBlocked(String url){
            return blacklist.contains(url);
        }
}


