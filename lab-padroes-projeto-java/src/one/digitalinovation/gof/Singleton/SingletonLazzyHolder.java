package one.digitalinovation.gof.Singleton;

public class SingletonLazzyHolder {
    private static class InstanceHolder {
        public static SingletonLazzyHolder instancia = new SingletonLazzyHolder();
    }
    private SingletonLazzyHolder(){
        super();
    }
    public static SingletonLazzyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
