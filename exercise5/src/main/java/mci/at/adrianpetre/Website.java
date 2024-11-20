package mci.at.adrianpetre;

import java.util.ArrayList;
import java.util.List;

/*likewise concrete implementation of the observer interaface */
public abstract class Website implements Observer {
    private List<Observer> observers;
    private List<NewsItem> newsItems;
    
    public NewsAgency() {
        this.observers = new ArrayList<>();
        this.infos = new ArrayList<>();
    }
    
    @Override
    public void register(Observer obj) {
        if (obj == null) {
            throw new NullPointerException("Observer object is null!");
        }
        if (!observers.contains(obj)) {
            observers.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    public void addInfo(Information info) {
        if (info == null) {
            throw new NullPointerException("Invalid news!");
        }
        infos.add(info);
        notifyObservers(info);
    }
    
    @Override
    public void notifyObservers(Information info) {
        System.out.println("News broadcasted by the channel:" + info);
        for (Observer obj : observers) {
            obj.update(info);        
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<Information> getInfos() {
        return infos;
    }

}
