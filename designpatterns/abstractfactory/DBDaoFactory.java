package designpatterns.abstractfactory;

public class DBDaoFactory extends DaoAbstractFatory{
    @Override
    DAO createDao(String type) {
        if(type.equalsIgnoreCase("emp")) {
            return new DBEmpDao();
        } else if(type.equalsIgnoreCase(    "dept")) {
            return new DBDeptDao();
        }
        return null;
    }
}
