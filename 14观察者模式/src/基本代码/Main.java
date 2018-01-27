package 基本代码;
class Main {

    public static void main(String[] args) {
        Secretary tongzizhe = new Secretary();

        StockObserve tongshi1 = new StockObserve("weiguancah", tongzizhe);
        StockObserve tongshi2 = new StockObserve("yiguancha", tongzizhe);

        tongzizhe.attach(tongshi1);
        tongzizhe.attach(tongshi2);

        tongzizhe.setSecretaryAction("老板回来了");
        tongzizhe.Notify();
    }

}
