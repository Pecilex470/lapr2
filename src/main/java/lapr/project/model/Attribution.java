package lapr.project.model;

public class Attribution {

    private Application a;
    private Evaluation e;
    private String faeUsername;

    public Attribution() {

    }

    public Attribution(Application a, Evaluation e, String faeUsername) {
        this.a = a;
        this.e = e;
        this.faeUsername=faeUsername;
    }

    /**
     * Return the application that corresponds to the attribution
     *
     * @return application
     */
    public Application getApplication() {
        return a;
    }

    /**
     * Verifies is the attribution is relative to the application
     *
     * @param a application to check
     * @return true if relative, false if not
     */
    public boolean isFromAttribution(Application a) {
        return a.equals(a);
    }
    
    /**
     * @return the e
     */
    public Evaluation getEvaluation() {
        return e;
    }

    public void setUser(String username){
        this.faeUsername=username;
    }
}
