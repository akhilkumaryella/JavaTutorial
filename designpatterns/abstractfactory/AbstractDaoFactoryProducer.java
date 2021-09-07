package designpatterns.abstractfactory;

public class AbstractDaoFactoryProducer {

    public static DaoAbstractFatory produce(String factoryType) {

        if(factoryType.equalsIgnoreCase("xml")) {
            return new XMLDaoFactory();
        } else if (factoryType.equalsIgnoreCase("db")) {
            return new DBDaoFactory();
        }
        return null;
    }
}
