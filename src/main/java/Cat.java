public class Cat extends Animal {




@Override
    public void makeSound(){
        System.out.println("Miaw");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void mood(Boolean mood) {
        if (mood == true){
            System.out.println("spinder");
        }
        else System.out.println("hvæser");
    }
}
