package proxy;
import java.util.HashSet;
import java.util.Set;

public class WebPageProxy implements WebPage{
    private ConcreteWebPage realWebPage = new ConcreteWebPage();
    private Set<String> blacklist;

    public WebPageProxy(){
        //blacklist some websites
        blacklist.add("www.definetlyNotaPornsite.com");
        blacklist.add("www.gambleYourLifeSavingsWithCrypto.net");
        blacklist.add("www.cheapViagra.shop");

        ///override the render if site is blocked
        /// 
        @Override
        public void render(String url){
            if(isBlocked(url)) {
                System.out.println("Uh-uh-uh naughty naughty!");
            } else {
                realWebPage.render(url);
            }
        }
    }

}
