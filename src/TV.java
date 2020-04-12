public class TV implements Electricity {
    private void turnedOn() {
        System.out.println("Заливка мусора в уши началась (включили телек)");
    }

    @Override
    public void isElectricGoing() {
        turnedOn();
    }
}
