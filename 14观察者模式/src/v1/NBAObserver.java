package v1;

class NBAObserver extends Observer{

    public NBAObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getSecretaryAction() + "," + this.name + ", 关闭NBA，继续工作");
    }
}
