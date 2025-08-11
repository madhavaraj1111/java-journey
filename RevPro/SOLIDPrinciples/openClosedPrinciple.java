// Open for extension but closed for modification
// This means that the code can be extended with new functionality without changing existing code.
interface Vehicle{
    int accelerate();
}
class Car implements Vehicle{
      private int speed;

      @Override
      public int accelerate(){
        this.speed=this.speed+speed;
        return this.speed;
      }
} 
