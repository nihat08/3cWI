package at.nihat.projects.OO;

public class Car {
        //Instanz/Gedächnis
        //dont do that later
        public int fuelMaxAmount;
        public int fuelAmount;
        public int fuelConsumption;
        public String brand;
        public String serialNumber;
        public int speed;
        public int BreakSpeed;
        private String color;

        //Methode
        public void drive(){
            this.fuelAmount = this.fuelAmount - this.fuelConsumption;
            System.out.println("I am driving");
            }
        public void breakk(){
          this.speed = this.speed - this.BreakSpeed;
           System.out.println("Ich bremse");
        }
        public void turboBoost(){
            if (fuelAmount > fuelMaxAmount * 0.10){
                System.out.println("SuperBoostMode");
            } else {
                System.out.println("Not enough fuel to go to Superboost");
            }}
        public void honk(int amountOfRepetitions){
            System.out.println("Tuuut");
        }
        public void getRemainingRange(){
            int getRemainingRange = fuelAmount / fuelConsumption * 100;
            System.out.println("remaining range = " + getRemainingRange);
        }
    }
