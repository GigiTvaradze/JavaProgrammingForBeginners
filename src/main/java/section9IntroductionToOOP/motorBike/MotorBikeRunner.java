package section9IntroductionToOOP.motorBike;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        System.out.println(ducati.getSpeed());

        honda.setSpeed(200);
        System.out.println(honda.getSpeed());

        ducati.increaseSpeed(200);
//      int ducatiSpeed = ducati.getSpeed(); //get speed
//      ducatiSpeed += 100; //increase it by 100   ducatiSpeed = ducatiSpeed + 100;
//      ducati.setSpeed(ducatiSpeed);   //set it to ducati
        System.out.println(ducati.getSpeed());

        honda.increaseSpeed(200);
//      int hondaSpeed = honda.getSpeed(); //get speed
//      hondaSpeed += 100; //increase it by 100   hondaSpeed = hondaSpeed + 100;
//      honda.setSpeed(hondaSpeed);   //set it to honda
        System.out.println(honda.getSpeed());

        ducati.setSpeed(-100); //will not execute, because of restriction in setSpeed method
        ducati.stop();
        honda.stop();
    }
}
