public class Proxy extends Subject{

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        System.out.println("before");
        realSubject.request();
        System.out.println("after");
    }
}
