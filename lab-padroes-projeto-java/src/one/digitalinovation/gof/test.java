package one.digitalinovation.gof;


import one.digitalinovation.gof.Singleton.SingletonEager;
import one.digitalinovation.gof.Singleton.SingletonLazzy;
import one.digitalinovation.gof.Singleton.SingletonLazzyHolder;
import one.digitalinovation.gof.Strategy.*;
import one.digitalinovation.gof.facade.Facade;

public class test {
    public static void main(String[] args) {

        SingletonLazzy lazy = SingletonLazzy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazzy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazzyHolder holder = SingletonLazzyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazzyHolder.getInstancia();
        System.out.println(holder);

//         Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // FaCade

        Facade facade = new Facade();
        facade.migrarCliente("Anderson","012301");









    }
}
