
import java.util.*;

public class Switcher {
    private List<Electricity> devices = new ArrayList<>();

    public Switcher () {

    }
    public Switcher(Electricity...devices) {
        this.devices.addAll(Arrays.asList(devices));
    }

    public List<Electricity> getDevices() {
        return devices;
    }
    public void addDevices(Electricity...devices) {
        this.devices.addAll(Arrays.asList(devices));
    }
    public void addDevice(Electricity device) {
        this.devices.add(device);
    }
    public void deleteDevices(Electricity...devices) {
        for (Electricity device : devices) {
            this.devices.remove(device);
        }
    }
    public void deleteAllComputers() {
        for (int i = 0; i < devices.size(); i++) {
            if (devices.get(i) instanceof Computer) {
                devices.remove(i);
                i--;
            }
        }
    }
    public void switchOn() {
        devices.forEach(Electricity::isElectricGoing);
    }
}
