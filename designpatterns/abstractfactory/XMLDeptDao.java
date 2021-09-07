package designpatterns.abstractfactory;

public class XMLDeptDao implements DAO{
    @Override
    public void save() {
        System.out.println("saving department to xml");
    }
}
