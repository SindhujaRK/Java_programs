public class Car{
      private int speed;
      public double regularprice;
      private String color;
      public Car(int speed,double regularprice,String color){
           this.speed=speed;
           this.regularprice=regularprice;
           this.color=color;}
      public double getsalesprice(){
             return regularprice;}}
class Truck extends Car{
      int weight;
      Truck(int speed,double regularprice,String color,double salesprice,int weight){
          super(speed, regularprice, color); 
          this.weight=weight;}
      public double getsalesprice(){
        if(weight>20000){
          return super.getsalesprice()*0.90;}
        else{
          return super.getsalesprice()*0.80;}}}
class Ford extends Car{
        int year;
        int manufacturerDiscount;
        Ford(int speed,double regularprice,String color,int year,int manufacturerDiscount){
             super(speed, regularprice, color); 
             this.year=year;
             this.manufacturerDiscount=manufacturerDiscount;}
        public double getsalesprice(){
             return super.getsalesprice()-manufacturerDiscount;}}
class Sedan extends Car{
        int length;
        Sedan(int speed,double regularprice,String color,int length){
              super(speed, regularprice, color); 
              this.length=length;}
         public double getsalesprice(){
         if(length>20){
            return super.getsalesprice()*0.95;}
          else{
            return super.getsalesprice()*0.90;}}}
class MyOwnAutoShop {
public static void main(String[] args){
            Sedan sedan1 = new Sedan(150,700000,"White",15);
            Ford ford1 = new Ford(160,900000,"Black",2023,3000);
            Ford ford2 = new Ford(180,600000,"Blue",2022,1000);
            Car car = new Car(170,500000,"Red");
            System.out.println("Sales price of Sedan is " +sedan1.getsalesprice());
            System.out.println("Sales price of Ford1 is " +ford1.getsalesprice());
            System.out.println("Sales price of Ford2 is " +ford2.getsalesprice());
            System.out.println("Sales price of Car is " +car.getsalesprice());
}}    