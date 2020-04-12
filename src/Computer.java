public class Computer implements Electricity {
    private void turnedOn() {
        System.out.println("Комп включен, работаем");
    }

    @Override
    public void isElectricGoing() {
        turnedOn();
    }
}
