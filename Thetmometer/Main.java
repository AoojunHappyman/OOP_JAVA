public class Main {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        double[] temperatures = {-5, 25, 55};

        for(double temp : temperatures){
            try{
                thermometer.checkTemperature(temp);
            }catch(IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
