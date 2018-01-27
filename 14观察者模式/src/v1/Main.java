package v1;

class Main {

    public static void main(String[] args) {
        Secretary tongzizhe = new Secretary();

        Observer tongshi1 = new StockObserver("weiguancah", tongzizhe);
        Observer tongshi2 = new NBAObserver("yiguancha", tongzizhe);

        tongzizhe.attach(tongshi1);
        tongzizhe.attach(tongshi2);

        tongzizhe.setSecretaryAction("老板回来了");
        tongzizhe.Notify();
    }

}
