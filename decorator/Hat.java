/**
 * This class adds a hat on character.
 * Extends the abstract class CharacterDecorator
 * that overrides the customize method
 * @author Justin Siegfried
 */
public class Hat extends CharacterDecorator {

    /**
     * The constructor retrieves the supplied character
     * from super and adds a hat
     * @param character The character to add a hat to
     */
    public Hat(Character character) {
        super(character);
        customize();
    }

    /**
     * This method replaces top two sections of the character
     * to add a hat
     */
    @Override
    public void customize() {
        sections.set(0, "    ____");
        sections.set(1, " __|____|____");
    }
}