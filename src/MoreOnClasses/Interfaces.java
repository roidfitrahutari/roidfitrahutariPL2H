package MoreOnClasses;
public class Interfaces {
    public static void main(String[] args) {

    }
    interface Animal{
        public void eat();
    }
    class Cat implements Animal{
        public void eat(){
            System.out.println(("Cat eats"));
        }
    }
}
