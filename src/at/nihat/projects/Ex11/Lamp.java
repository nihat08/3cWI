package at.nihat.projects.Ex11;
import java.util.ArrayList;
import java.util.List;

public class Lamp {

        private List<lightElement> lightElements;

        // Konstruktor
        public Lamp() {
            this.lightElements = new ArrayList<>();
        }

        // Methode, um ein Glühelement hinzuzufügen
        public void addLightElement(lightElement lightElement) {
            lightElements.add(lightElement);
        }

        // Methode zum Einschalten aller Glühelemente
        public void turnAllOn() {
            for (lightElement element : lightElements) {
                element.turnOn();
            }
        }

        // Methode, um den gesamten Stromverbrauch zurückzugeben
        public double getOverallPowerUsage() {
            double totalPower = 0;
            for (lightElement element : lightElements) {
                totalPower += element.getPowerConsumption();
            }
            return totalPower;
        }

        // Methode, um die Namen aller Glühelemente zu printen
        public void printNamesOfLightElements() {
            for (lightElement element : lightElements) {
                System.out.println(element.getName());
            }
        }
    }


