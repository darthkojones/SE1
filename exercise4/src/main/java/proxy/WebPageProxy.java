package proxy;
import java.util.HashSet;
import java.util.Set;

public class WebPageProxy implements WebPage{
    private ConcreteWebPage realWebPage = new ConcreteWebPage();
    private Set<String> blacklist;

    public WebPageProxy(){
        this.blacklist = new HashSet<>();
        //blacklist some websites
        this.blacklist.add("www.definitelyNotaPornsite.com".toLowerCase());
        this.blacklist.add("www.gambleYourLifeSavingsWithCrypto.net".toLowerCase());
        this.blacklist.add("www.cheapViagra.shop".toLowerCase());

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


