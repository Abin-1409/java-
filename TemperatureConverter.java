class TemperatureConverter {
    double celsius;

    void setTemperature(double c) {
        celsius = c;
    }

    double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter t = new TemperatureConverter();
        t.setTemperature(25); // setting Celsius
        double f = t.toFahrenheit(); // getting return value
        System.out.println("Temperature in Fahrenheit: " + f);
    }
}
