/**
 * This class creates a blank potato head that
 * Extends the Character class
 * @author Justin Siegfried
 */
public class PotatoeHead extends Character {
    /**
     * This constructor just creates a blank
     * potato head by modifying sections
     * arraylist.
     */
    public PotatoeHead() {
        this.sections.add("");
        this.sections.add("   ______");
        this.sections.add("  /      \\");
        this.sections.add(" |        |");
        this.sections.add(" |        |");
        this.sections.add("  \\      /");
        this.sections.add("   \\____/");
    }
}