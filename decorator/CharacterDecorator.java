
public abstract class CharacterDecorator extends Character {
    protected Character character;

    public CharacterDecorator(Character character) {
        this.character = character;
        sections.addAll(this.character.sections);
    }

    public abstract void customize();
}