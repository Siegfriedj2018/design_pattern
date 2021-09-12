/**
 * This class adds a nose to the character.
 * Extends the abstract class CharacterDecorator
 * that overrides the customize method
 * @author Justin Siegfried
 */
public class Nose extends CharacterDecorator {
    /**
     * The constructor retrieves the supplied character
     * from super and adds a nose
     * @param character The character to add a nose to.
     */
    public Nose(Character character) {
        super(character);
        customize();
    }

    /**
     * This method replaces index 4 to add
     * a nose.
     */
    @Override
    public void customize() {
        sections.set(4, " |   >    | ");
    }
    
}