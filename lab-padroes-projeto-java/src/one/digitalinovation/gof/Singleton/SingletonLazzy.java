package one.digitalinovation.gof.Singleton;

public class SingletonLazzy {
    private static SingletonLazzy instancia;

    private SingletonLazzy() {
        super();
    }
    public static SingletonLazzy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazzy();
        }
        return instancia;
    }
}
