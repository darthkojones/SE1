package mci.at.adrianpetre;

public class Main {
    public static void main(String[] args) {
        // creating the news agency
        NewsAgency apa = new NewsAgency();

        // creating observers - a newspaper and a tv channel
        Newspaper localNewspaper = new Newspaper("The Daily Squeeze");
        TVChannel nationalTV = new TVChannel("Who even watches TV anymore");

        // adding observers to the news agency
        apa.addObserver(localNewspaper);
        apa.addObserver(nationalTV);

        // setting the news, which will notify all observers
        apa.setNews("Breaking News: Andrea to give Adrian a 100% on the exam!");

        // removing the newspaper from the list of observers
        apa.removeObserver(localNewspaper);

        // setting new news, which will notify the remaining observers
        apa.setNews("Update: Adrian says Andrea is the best prof ever!!!");
    }
}
