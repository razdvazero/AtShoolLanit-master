package AtSchool;

import org.junit.Test;


public class Kotik {
    @Test
    public void example() {
        Kotik kotik1; // Объявление переменной
        kotik1 = new Kotik(); // инициализация переменной
        kotik1.prettiness = 9999;
        kotik1.name = "Рыжый";
        kotik1.weight = 6327;//в граммах
        kotik1.meow = "Кря кря";

        for (int i = 0; i < 5; i++) //Номер для каждого действия
            action[i] = i;

        kotik1.liveAnotherDay();
    }

    int prettiness;
    int weight;
    int[] action = new int[5];
    int food = 6; // начальный запас топлива кота
    boolean check=true; // проверка голода
    String name;
    String meow;
    String foodname;
    int foodvalue;


    void sayMeow() {
        System.out.println(name + " говорит " + meow);
        if (food!=0 && food>0)
            food-=1;
        else {
            check = false;
            System.out.println("Мохнатый требует еды и не мявкает");
        }
    }

    void play() {
        System.out.println(name + " играет");
        if (food!=0 && food>0)
            food-=2;
        else {
            check = false;
            System.out.println("Мохнатый требует еды и не будет играть");
        }
    }

    void chaseMouse() {
        System.out.println(name + " бегает за мышью");
        if (food!=0 && food>0)
            food-=2;
        else {
            check = false;
            System.out.println("Мохнатый требует еды и не будет охотиться");
        }
    }

    void sleep() {
        System.out.println(name + " спит");
        if (food!=0 && food>0)
            food-=2;
        else {
            check = false;
            System.out.println("Мохнатый требует еды и не будет спать");
        }
    }

    void eat(int foodvalue) {
        System.out.println(name + " поел");
        food+=foodvalue;
        check=true;
    }
    void eat(String eda, int f) { //можно узнать что кот ел в последний раз и количество топлива за этот вид еды
        foodname=eda;
        foodvalue=f;
    }
    void eat() {
        eat(foodname,foodvalue);
    }

    void rest() {
        System.out.println(name + " отдыхает");
        if (food!=0 && food>0)
            food-=1;
        else {
            check = false;
            System.out.println("Мохнатый требует еды и не будет отдыхать");
        }
    }

    void watching() {
        System.out.println(name + " смотрит на тебя");
        if (food!=0 && food>0)
            food-=1;
        else {
            check = false;
            System.out.println("Мохнатый требует еды но смотреть будет");
        }
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 23; i++) {
            double a;
            a = Math.random() * 6;
            int b = (int) a;

            if (check==false){
                if (b == 0) {
                    eat("kasha", 5);
                    eat(foodvalue);
                    System.out.println("Мохнатый поел каши и успокоился");
                }
                if (b == 1) {
                    eat("whiskas", 4);
                    eat(foodvalue);
                    System.out.println("Мохнатый поел вискас и успокоился");
                }
                if (b == 2) {
                    eat("bread", 3);
                    eat(foodvalue);
                    System.out.println("Мохнатый поел хлеба и успокоился");
                }
                if (b == 3) {
                    eat("cookies", 2);
                    eat(foodvalue);
                    System.out.println("Мохнатый поел печенья и успокоился");
                }
                if (b == 4) {
                    eat("salo", 6);
                    eat(foodvalue);
                    System.out.println("Мохнатый поел сало и успокоился");
                }
                if (b == 5) {
                    eat("sausage", 4);
                    eat(foodvalue);
                    System.out.println("Мохнатый поел колбасы и успокоился");
                }
            }

            if (b == 0)
                sayMeow();
            else if (b == 1)
                play();
            else if (b == 2)
                chaseMouse();
            else if (b == 3)
                sleep();
            else if (b == 4)
                rest();
            else if (b == 5)
                watching();
        }
    }
}