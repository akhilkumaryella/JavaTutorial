package designpatterns.singleton;

public class CloneableIssue implements  Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
