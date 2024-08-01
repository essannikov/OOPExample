package observers.javasupport;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class CatholicChurch2 {
    private String newsChurch;
    private PropertyChangeSupport support;

    public CatholicChurch2() {
        this.newsChurch = "";
        support = new PropertyChangeSupport(this);
    }

    public String getNews() {
        return this.newsChurch;
    }

    public void setNews(String news) {
        support.firePropertyChange("news", this.newsChurch, news);
        this.newsChurch = news;
    }

    public void addPropertyChangeListner(PropertyChangeListener pcl){
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListner(PropertyChangeListener pcl){
        support.removePropertyChangeListener(pcl);
    }
}
