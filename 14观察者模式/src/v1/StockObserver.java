package v1;

class StockObserver extends Observer {


    public StockObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(this.sub.getSecretaryAction() + "," + this.name + ", 关闭股票行情，继续工作");
    }
}
