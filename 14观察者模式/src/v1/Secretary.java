package v1;

import java.util.ArrayList;
import java.util.List;

class Secretary {

    private List<Observer> observes = new ArrayList<Observer>();
    private String action;

    // 增加
    public void attach(Observer observer) {
        observes.add(observer);
    }

    // 减少
    public void detach(Observer observer) {
        observes.remove(observer);
    }

    // 通知
    public void Notify() {
        for (Observer o : observes) {
            o.update();
        }
    }

    public String getSecretaryAction() {
        return action;
    }

    public void setSecretaryAction(String secretaryAction) {
        this.action = secretaryAction;
    }
}
