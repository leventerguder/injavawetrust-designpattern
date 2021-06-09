package ch02.examples.v1;

public class WeatherData {

    public double getTemperature() {
        return 0;
    }

    public double getHumidity() {
        return 0;
    }

    public double getPressure() {
        return 0;
    }


    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    public void measurementsChanged() {

        double temp = getTemperature();
        double humidity = getHumidity();
        double pressure = getPressure();


        // Area of change , we need to encapsulate this.
        // By coding to concrete implementations we have no way to add or remove other display
        // elements without making changes to the program.

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }


}
