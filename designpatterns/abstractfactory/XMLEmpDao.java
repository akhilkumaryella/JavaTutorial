package designpatterns.abstractfactory;

public class XMLEmpDao implements DAO{
    @Override
    public void save() {
        System.out.println("saving employee to xml");
    }
}
