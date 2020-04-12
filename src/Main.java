

public class Main {
    public static void main(String[] args) {
        Electricity comp = new Computer();
        Lamp lamp = new Lamp();
        Electricity PC = new Computer();
        Switcher switcher = new Switcher(comp, lamp, PC);
        switcher.switchOn();

        System.out.println("\n---");
        TV tv = new TV();
        switcher.addDevice(tv);
        switcher.switchOn();
        System.out.println("---\n");

        switcher.deleteAllComputers();
        switcher.switchOn();

        System.out.println("\n---");
        switcher.addDevice(new Electricity() {
            @Override
            public void isElectricGoing() {
                System.out.println("Выигран пакет магии!");
            }
        });
        switcher.addDevice(() -> System.out.println("Tra-lala"));
        switcher.switchOn();
    }
}
