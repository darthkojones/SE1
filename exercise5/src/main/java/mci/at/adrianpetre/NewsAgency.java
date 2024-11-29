package mci.at.adrianpetre;

/**
 * implements the subject interface
 * holds the list of clients * obesrvers 
 * and the implementation for the adding removing and notifying the news items
 */


import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    // list to hold all observers
    private List<Observer> observers = new ArrayList<>();
    // current news item
    private String news;

    // method to add an observer to the list
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // method to remove an observer from the list
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // method to set the news and notify all observers
    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    // method to notify all observers of the updated news
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}
