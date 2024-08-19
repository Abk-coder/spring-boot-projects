package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; // Couplage faible
    @Override
    public double compute() {
        double temp = dao.getData();
        return temp*540/Math.cos(temp*Math.PI);
    }

    /*
    Injecter dans dao un objet d'une classe qui implemente IDao
     */
    public void setDao (IDao dao){
        this.dao = dao;
    }
}
