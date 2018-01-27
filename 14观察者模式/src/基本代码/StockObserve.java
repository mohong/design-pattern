package 基本代码;

class StockObserve {
    private String name;
    private Secretary sub;

    public StockObserve(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void update() {
        System.out.println(sub.getSecretaryAction() + "," + this.name + ", 关闭股票行情，继续工作");
    }
}
