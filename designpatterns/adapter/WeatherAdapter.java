package designpatterns.adapter;

public class WeatherAdapter {

    public int findTemaparature(int zipcode){

        String city = null;
        if(zipcode == 1991) {
            city = "akhil";
        }

        WeatherFinder weatherFinder = new WeatherFinderImpl();
        return weatherFinder.find(city);
    }
}
