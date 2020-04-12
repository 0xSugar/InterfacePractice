public class Lamp implements Electricity {
    private void turnedOn(){
        System.out.println("Лампа включена и работает");
    }

    @Override
    public void isElectricGoing() {
        turnedOn();
    }
}
