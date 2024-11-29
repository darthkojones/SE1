package mci.at.adrianpetre;
/**
 * we define the observer interface here
 * method used will be update(String news)
 * this will be implemented by each client
 */


public interface Observer {
    void update(String news);
}
