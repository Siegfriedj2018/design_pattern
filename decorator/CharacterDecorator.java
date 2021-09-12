/**
 * This abstract class allows the character
 * to be decorated. This class extends 
 * character.
 * @author Justin Siegfried
 */
public abstract class CharacterDecorator extends Character {
    protected Character character;

    /**
     * This constructor saves the supplied character as
     * character. Then it takes "this" character sections
     * which will be empty and it copys the arraylist from
     * "character" sections arraylist which should have a
     * character
     * @param character The character that is supplied to
     * be decorated
     */
    public CharacterDecorator(Character character) {
        this.character = character;
        this.sections.addAll(character.sections);
    }

    /**
     * This class is to be implemented by the subclass
     * that uses character decorator and it custommizes
     * the character by adding to the arraylist.
     */
    public abstract void customize();
}