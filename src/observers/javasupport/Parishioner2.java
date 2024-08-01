package observers.javasupport;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Parishioner2 implements PropertyChangeListener {
    private String name;

    public Parishioner2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        switch (evt.getPropertyName()){
            case "news":
                this.setNews((String) evt.getNewValue());
                break;
        }
    }

    public void setNews(String news){
        System.out.println(name + " gets a news: " + news);
    }
}
