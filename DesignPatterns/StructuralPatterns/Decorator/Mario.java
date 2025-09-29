package DesignPatterns.StructuralPatterns.Decorator;

public class Mario {
    public static void main(String[] args) {
        DecoratorMario mario = new HeightUpDecorator(
                new GumPowerDecorator(
                        new StarPowerDecorator(
                                new MarioCharacter()
                        )
                )
        );
        mario.getAbilities();
    }
}


//Core Component
interface Character{
    void getAbilities();
}

//Concrete Component
class MarioCharacter implements Character{
    public void getAbilities(){
        System.out.println("I am normal mario.");
    }
}

//Decorator Component
class DecoratorMario implements Character{
    private final Character character;

    DecoratorMario(Character character) {
        this.character = character;
    }

    @Override
    public void getAbilities() {
        character.getAbilities();
    }
}

//
class HeightUpDecorator extends DecoratorMario{

    HeightUpDecorator(Character character) {
        super(character);
    }
    @Override
    public void getAbilities() {
        super.getAbilities();
        System.out.println("My height is UP.");
    }
}
class GumPowerDecorator extends DecoratorMario{

    GumPowerDecorator(Character character) {
        super(character);
    }
    @Override
    public void getAbilities() {
        super.getAbilities();
        System.out.println("I have Gun power");
    }
}
class StarPowerDecorator extends DecoratorMario{

    StarPowerDecorator(Character character) {
        super(character);
    }

    @Override
    public void getAbilities(){
        super.getAbilities();
        System.out.println("I have super powers.");
    }
}