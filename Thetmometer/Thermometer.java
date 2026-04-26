public class Thermometer {
    public void checkTemperature(double celsius){
        if(celsius >50 || celsius < 0){
            throw new IllegalArgumentException("Temperature out of safe range: " + celsius);
        }
        else{
            System.out.println("Temperature is OK: " + celsius);
        }
    }
}
