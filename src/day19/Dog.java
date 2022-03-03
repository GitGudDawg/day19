package day19;

public class Dog extends Animal {
    @Override
    protected void voice(){
        System.out.println("Dog sounds");
    }
    @Override
    protected void eat(){
        System.out.println("Dog food");
    }
}
