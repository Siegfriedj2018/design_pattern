package observer;

/**
 * The book class is what defines a book for this program
 * @author Justin Siegfried
 */
public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * Creates a book instantance that is assigned a title and author
     * @param title The name of the book
     * @param authorFirstName the author's first name
     * @param authorLastName the author's last name
     */
    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    /**
     * Gets the title given at instantiation and returns it
     * @return The tile of book instance
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author's first name and returns it
     * @return The author's first name of book
     */
    public String getAuthorFirstName() {
        return authorFirstName;
    }

    /**
     * Gets the author's last name and returns it
     * @return The author's last name of book
     */
    public String getAuthorLastName() {
        return authorLastName;
    }

    /**
     * Returns the format for how the book is to be printed
     * and displayed to the user
     * @return The title and author in the following format:
     * "title by: firstname lastname"
     */
    public String toString() {
        return title + " by: " + authorFirstName + " " + authorLastName;
    }
}