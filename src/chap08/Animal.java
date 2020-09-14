package chap08;

import java.util.ArrayList;

public class Animal {

  public void move() {
    System.out.println("동물이 움직입니다.");
  }
}

class Human extends Animal {
  @Override
  public void move() {
    System.out.println("사람이 두발로 걷습니다.");
  }
  public void readBook() {
    System.out.println("사람이 책을 읽습니다.");
  }
}

class Tiger extends Animal {
  @Override
  public void move() {
    System.out.println("호랑이가 네 발로 뜁니다.");
  }
  public void hunting() {
    System.out.println("호랑이가 사냥을 합니다.");
  }
}

class Eagle extends Animal {
  @Override
  public void move() {
    System.out.println("독수리가 하늘을 납니다.");
  }
  public void flying() {
    System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
  }
}

class AnimalTest {
  ArrayList<Animal> aniList = new ArrayList<>();

  public static void main(String[] args) {
    AnimalTest animalTest = new AnimalTest();
    animalTest.addAnimal();
    System.out.println("==== 원래 형으로 다운 캐스팅 ====");
    animalTest.testCasting();
  }

  public void addAnimal() {
    aniList.add(new Human());
    aniList.add(new Tiger());
    aniList.add(new Eagle());

    for (Animal animal : aniList) {
      animal.move();
    }
  }

  public void testCasting() {

    for (int dIndex = 0; dIndex < aniList.size(); dIndex++) {
      if (aniList.get(dIndex) instanceof Human) {
        Human human = (Human) aniList.get(dIndex);
        human.readBook();
      } else if (aniList.get(dIndex) instanceof Tiger) {
        Tiger tiger = (Tiger) aniList.get(dIndex);
        tiger.hunting();
      } else if (aniList.get(dIndex) instanceof Eagle) {
        Eagle eagle = (Eagle) aniList.get(dIndex);
        eagle.flying();
      } else {
        System.out.println("지원되지 않는 형입니다.");
      }
    }
  }
}
