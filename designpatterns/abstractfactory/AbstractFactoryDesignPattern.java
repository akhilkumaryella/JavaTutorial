package designpatterns.abstractfactory;

/**
 * this is also creation design pattern
 * its is Factory of factories
 * Factory pattern -- hides the creation of objects
 * Abstract Factory pattern - hides the creation of factory
 * eg: JAXP - its an API for XML creation/modification etc.
 * in this API we have DocumentBuilder - this is responsible creating Documents
 * and DocumentBuilderFactory - this is responsible for creating DocumentBuilder
 */
public class AbstractFactoryDesignPattern {

    public static void main(String[] args) {

        DaoAbstractFatory daf = AbstractDaoFactoryProducer.produce("xml");
        DAO dao = daf.createDao("emp");
        dao.save();
        DAO dao1 = daf.createDao("dept");
        dao1.save();

        DaoAbstractFatory daf1 = AbstractDaoFactoryProducer.produce("db");
        DAO dao2 = daf1.createDao("emp");
        dao2.save();
        DAO dao3 = daf1.createDao("dept");
        dao3.save();
    }
}
