
public class Nose extends CharacterDecorator {

    public Nose(Character character) {
        super(character);
        customize();
    }

    @Override
    public void customize() {
        sections.set(4, " |   >    | ");
    }
    
}