
public class Eyes extends CharacterDecorator {

    public Eyes(Character character) {
        super(character);
        customize();
    }

    @Override
    public void customize() {
        sections.set(3, " |  o  o  | ");
    }
    
}