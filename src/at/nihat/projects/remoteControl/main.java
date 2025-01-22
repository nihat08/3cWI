package at.nihat.projects.remoteControl;

public class main {
    public static void main(String[] args) {
        battery battery1 = new battery("Duracell", 10);
        battery battery2 = new battery("Duracell", 10);
        Remote remote = new Remote("black", battery1, battery2);

        remote.turnOn();
        remote.turnOff();
        remote.turnOn();
        remote.turnOff();
        remote.turnOn();
        remote.turnOff();
        remote.turnOn();
        remote.turnOff();
    }
}
