package observers;

import java.util.ArrayList;
import java.util.List;

public class CatholicChurch implements Observable, Church{
    private List<Observer> parishioners;
    private String newsChurch;

    public CatholicChurch() {
        this.parishioners = new ArrayList<>();
        this.newsChurch = "";
    }

    @Override
    public void registerObserver(Observer observer) {
        parishioners.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        parishioners.remove(observer);
    }

    @Override
    public void notifyObservers() {
        parishioners.forEach(observer -> observer.update(this));
    }

    @Override
    public String getNews() {
        return this.newsChurch;
    }

    @Override
    public void setNews(String news) {
        this.newsChurch = news;
    }
}
