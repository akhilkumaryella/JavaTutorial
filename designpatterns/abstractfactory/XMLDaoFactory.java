package designpatterns.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFatory{
    @Override
    DAO createDao(String type) {
        if(type.equalsIgnoreCase("emp")) {
            return new XMLEmpDao();
        } else if(type.equalsIgnoreCase("dept")) {
            return new XMLDeptDao();
        }
        return null;
    }
}
