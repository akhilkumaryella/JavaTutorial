package designpatterns.template;

/**
 * its an behavioural design pattern
 * parent class provides the template for behaviour
 * child classes must implement the behavior present in parent
 */
public class TemplateDesignPattern {

    public static void main(String[] args) {

        DataRenderer dataRenderer = new XMLDataRenderer();
        dataRenderer.renderer();

        DataRenderer dataRenderer1 = new CSVDataRenderer();
        dataRenderer1.renderer();
    }
}
