
public class Mouth extends CharacterDecorator {

    public Mouth(Character character) {
        super(character);
        customize();
    }

    @Override
    public void customize() {
        sections.set(5, "  \\ ---- / ");
    }
}