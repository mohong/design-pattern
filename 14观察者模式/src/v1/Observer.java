package v1;

abstract class Observer {

    protected String name;
    protected Secretary sub;

    public Observer(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
