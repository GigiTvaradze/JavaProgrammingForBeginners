package section9IntroductionToOOP.motorBike;

public class MotorBike {
    private int speed; //member variable
    public void start(){
        System.out.println("Start Motor Bike");
    };
    public void stop(){
        System.out.println("Stop Motor Bike");
    };

    /**
     * @param speed
     */
    public void setSpeed(int speed){ //local variable
        //whatever value comes into method, we would want to set into member variable

        if (speed > 0) //Advantage of encapsulation is that we can prevent bad code from other classes, from putting bad data into your objects
            this.speed = speed;

        //System.out.println(speed); //local variable
        //System.out.println(this.speed); //member variable
    };

    /**
     * @return member variable speed
     */
    public int getSpeed(){
        return this.speed;
    }

    /*
    In Java, the keyword this is a reference variable that points to the current object — the object whose method or constructor is being called.

    Purpose of this Keyword:
    1.Differentiate Between Member Variables and Local Variables:
    When a method parameter (local variable) has the same name as a class member variable, this helps to differentiate them.

    public void setSpeed(int speed) {
     this.speed = speed;
    }

    this.speed refers to the member variable speed.
    The unqualified speed refers to the method parameter.

    2.Refers to the Current Object:
    this allows methods to refer to the object that invoked them.

    MotorBike bike = new MotorBike();
    bike.setSpeed(50);  // this refers to 'bike' object inside setSpeed()

    3.Pass the Current Object as a Parameter:You can use this to pass the current object to another method or constructor.
    4.Invoke Current Class Constructor (Constructor Chaining):this() can call another constructor in the same class.

    Key Takeaway from Your Example:
    In the setSpeed method, this.speed = speed; ensures that the member variable speed gets assigned the value passed through the method parameter, avoiding naming conflicts.
    Without this, Java would assign the local parameter to itself, leading to no change in the member variable.
     */

    /**
     * @param howMuch
     */
    public void increaseSpeed(int howMuch){
        setSpeed(this.speed + howMuch);
        //this.speed= speed + howMuch;
    }

    /**
     * @param howMuch
     */
    public void decreaseSpeed(int howMuch){
        setSpeed(this.speed - howMuch);
        //this.speed= speed - howMuch
    }
}