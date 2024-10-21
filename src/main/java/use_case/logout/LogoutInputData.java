package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {
    private final String username;

    /**
     * Constructor to initialize LogoutInputData with a username.
     *
     * @param username the username of the user who is logging out.
     */
    public LogoutInputData(String username) {
        this.username = username;
    }

    /**
     * Getter method to retrieve the username.
     *
     * @return the username.
     */
    public String getUsername() {
        return username;
    }
}
