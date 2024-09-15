package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        // Dependency Injection by static instantiation; couplage fort
        // Il y'a changement. Il faut utiliser DaoImpl2
        DaoImpl2 dao = new DaoImpl2();
//        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
//        metier.setDao(dao);

        System.out.println(metier.compute());
    }
}
