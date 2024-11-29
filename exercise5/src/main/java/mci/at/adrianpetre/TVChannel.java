package mci.at.adrianpetre;

public class TVChannel implements Observer {
    // name of the tv channel
    private String name;

    // constructor to set the name
    public TVChannel(String name) {
        this.name = name;
    }

    // update method that broadcasts the news
    @Override
    public void update(String news) {
        System.out.println(name + " broadcasting news: " + news);
    }
}