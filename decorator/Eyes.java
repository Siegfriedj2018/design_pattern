/**
 * This class adds eyes to the character.
 * Extends the abstract class CharacterDecorator
 * that overrides the customize method
 * @author Justin Siegfried
 */
public class Eyes extends CharacterDecorator {
    /**
     * The constructor retrieves the supplied character
     * from super and adds eyes
     * @param character The character to add a eyes to.
     */
    public Eyes(Character character) {
        super(character);
    }

    /**
     * This method replaces index 3 to add
     * eyes.
     */
    @Override
    public void customize() {
        sections.set(3, " |  o  o  | ");
    }
    
}