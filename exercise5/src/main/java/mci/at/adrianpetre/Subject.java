package mci.at.adrianpetre;



/**
 * will define the subject interface
 * where we declare some methods
 * registerObserver
 * removeObserver
 * notifyObserve
 */
public interface Subject {
    public void registerObserver(Observer obj); 
    public void removeObserver(Observer obj);  
    public void notifyObservers(NewsItem Info); 
}


