package dao;

import org.springframework.stereotype.Component;

//@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        connect to  BD to read temp data
         */
        System.out.println("Verion DB");
        return Math.random()*40;
    }
}
