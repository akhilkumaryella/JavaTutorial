package designpatterns.abstractfactory;

public class DBEmpDao implements DAO{
    @Override
    public void save() {
        System.out.println("saving employee to DB");
    }
}
