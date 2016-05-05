package JavaproTest.ReplaceMobileMethod;

/**
 * Created by Hyman on 2016/2/11.
 */
public class Test01Demo {
    public static void main(String[] args){

    }
}

class Animal{
    private String name;
    private int age;
    private String color;

    public Animal(){}
    public Animal(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return  name;
    }

    public void setNmae(String name){
        this.name = name;
    }

}

class Cat extends Animal{


}

class Dog extends Animal{

}