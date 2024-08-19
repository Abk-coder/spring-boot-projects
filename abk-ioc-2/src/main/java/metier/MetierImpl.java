package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
//    @Autowired
//    @Qualifier("dao")
//    @Qualifier("dao2")
//    @Qualifier("dao3")
    private IDao dao; // Couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

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
