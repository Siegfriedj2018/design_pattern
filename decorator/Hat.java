
public class Hat extends CharacterDecorator {

    public Hat(Character character) {
        super(character);
        customize();
    }

    @Override
    public void customize() {
        sections.set(0, "    ____");
        sections.set(1, " __|____|____");
    }
}