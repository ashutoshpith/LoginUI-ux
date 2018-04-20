package DBase;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class showUserInfo {
    private final StringProperty info;


    public showUserInfo(String info){
        this.info=new SimpleStringProperty(info);
    }

    public String getInfo() {
        return info.get();
    }

    public StringProperty infoProperty() {
        return info;
    }

    public void setInfo(String info) {
        this.info.set(info);
    }
}
