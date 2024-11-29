package mci.at.adrianpetre;
/*
 * concrete implementation of the observer interface
 */


public class Newspaper implements Observer {
    // name of the newspaper
    private String name;

    // constructor to set the name
    public Newspaper(String name) {
        this.name = name;
    }

    // update method that prints out the received news
    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}
