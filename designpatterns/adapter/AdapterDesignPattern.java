package designpatterns.adapter;

/**
 * its an structural design pattern
 * if one class wants some information from other class
 * but class A asking results by paramA, but class B provides results by paramB
 * So, in between one class is required which acts as bridge between two classes
 * i.e Adaptor pattern
 * eg: American laptop chargers not compatible with indian plugs,
 * So we need Adaptor for chargers to work
 */
public class AdapterDesignPattern {

    public static void main(String[] args) {

        WeatherUI weatherUI = new WeatherUI();
        weatherUI.showTemparature(1991);
    }
}
