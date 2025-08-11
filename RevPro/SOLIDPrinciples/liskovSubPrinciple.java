class Bird{
    public void eat(){};
}

class FlyingBird{
    public void fly(){};
}


class Sparrow extends FlyingBird{
    public void eat(){
        System.out.println("I can eat");
    }

    public void fly(){
        System.out.println("I can fly");
    }
}

class Penguin extends Bird{
    public void eat(){
        System.out.println("I can eat");
    }
}