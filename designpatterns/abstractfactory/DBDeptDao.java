package designpatterns.abstractfactory;

public class DBDeptDao implements DAO{
    @Override
    public void save() {
        System.out.println("saving department to DB");
    }
}
