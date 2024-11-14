package proxy;

public class ConcreteWebPage implements WebPage {
    @Override
    public void render(String url){
        System.out.println("Rendering webpage found at " + url );
        }

}
