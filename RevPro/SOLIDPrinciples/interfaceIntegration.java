// Small and focused interface instead of having large , general purpose Interface
class Vehicle{
    public void accelerate(){};
    public void brake(){};
}

interface Enterable{
    public void openDoors();
}


class Bike extends Vehicle{
    public void accelerate(){
        //  
    };
    public void brake(){
    //    
    };
}

class Truck extends Vehicle implements Enterable{
     public void accelerate(){
        //  
    };
    public void brake(){
    //    
    };
    public void openDoors(){
        // 
    }
}