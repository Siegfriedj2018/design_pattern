/**
 * This class adds a mouth to the character.
 * Extends the abstract class CharacterDecorator
 * that overrides the customize method
 * @author Justin Siegfried
 */
public class Mouth extends CharacterDecorator {
    /**
     * The constructor retrieves the supplied character
     * from super and adds a mouth
     * @param character The character to add a mouth to.
     */
    public Mouth(Character character) {
        super(character);
    }

    /**
     * This method replaces index 5 to add
     * a mouth.
     */
    @Override
    public void customize() {
        sections.set(5, "  \\ ---- / ");
    }
}