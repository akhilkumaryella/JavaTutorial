package designpatterns.adapter;

public class WeatherUI {

    public void showTemparature(int zipcode) {

        System.out.println(new WeatherAdapter().findTemaparature(zipcode));

    }
}
