package Polymorphism.src;


//오버라이딩 실습 
//아래 클래스와 상속 관계에서 test code를 수정하지 않고, 아래와 같이 출력될 수 있도록 오버라이딩 
//빵빵!위이잉!빵빵!삐뽀삐뽀!

class Car {
  Car(){}
  public void horn(){
    System.out.println("빵빵!");
  }
}

class FireTruck extends Car {
  public void horn(){
    super.horn();
    System.out.println("위이잉!");
  }
}

class Ambulance extends Car {
  public void horn(){
    super.horn();
    System.out.println("삐뽀삐뽀!");

  }
}

//Car 부모 >> FireTruck, Ambulance 자식 
public class Practice {
  public static void main(String[] args) {
    Car car = new Car();
    car.horn();

    car = new FireTruck(); // 업캐스팅 
    car.horn();

    car = new Ambulance();
    car.horn();

    Car car2[] = {new Car(), new FireTruck(), new Ambulance()};
    // 객체 만드는 것 가능 Car에 자식 할당 가능 (업캐스팅)


    for(Car item: car2) {
      item.horn();
    }
  }
}
