package mci.at.adrianpetre;

import java.time.LocalDateTime;

/*
 * encapsulation for news articles
 * holds properties like 
 * title, topic, content, author, time 
 */

public class NewsItem {
    private LocalDateTime dateInfo;
    private  topic;
    private String newsText;

    public NewsItem(LocalDateTime dateInfo, InfoTopic topic, String newsText) {
        this.dateInfo = dateInfo;
        this.newsText = newsText;
        this.topic = topic;
    }
    
    @Override
    public String toString() {
        return String.format("Date: %s, Topic: %s\n\"%s\"",
                        dateInfo, topic, newsText);
    }
    
    public InfoTopic getTopic() {
        return topic;
    }

    public void setTopic(InfoTopic topic) {
        this.topic = topic;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public LocalDateTime getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(LocalDateTime dateInfo) {
        this.dateInfo = dateInfo;
    }
    
}
}
