package LW_03.Q2;

public class Temperature {
    private double celsius;
    private double fahrenheit;

    public Temperature() {
        this.celsius = 0.0;
        this.fahrenheit = 32.0;
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = (celsius * 9/5) + 32;
    }

    public static Temperature fromFahrenheit(double fahrenheit) {
        Temperature t = new Temperature();
        t.fahrenheit = fahrenheit;
        t.celsius = (fahrenheit - 32) * 5/9;
        return t;
    }

    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public double toCelsius() {
        return (fahrenheit - 32) * 5/9;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
        this.fahrenheit = toFahrenheit();
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        this.celsius = toCelsius();
    }
}
