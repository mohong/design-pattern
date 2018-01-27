package 基本代码;

import java.util.ArrayList;
import java.util.List;

class Secretary {

    private List<StockObserve> observes = new ArrayList<StockObserve>();
    private String action;

    public void attach(StockObserve observe) {
        observes.add(observe);
    }

    public void Notify() {
        for (StockObserve observe : observes) {
            observe.update();
        }
    }

    public String getSecretaryAction() {
        return action;
    }

    public void setSecretaryAction(String secretaryAction) {
        this.action = secretaryAction;
    }
}
