package lapr.project.model;

public class Attribution {

    private Application a;
    private FAE fae;
    private Evaluation e;

    public Attribution() {

    }

    public Attribution(Application a, FAE fae, Evaluation e) {
        this.a = a;
        this.fae = fae;
        this.e = e;
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
    
    public FAE getFAE(){
        return fae;
    }
    
    /**
     * @return the e
     */
    public Evaluation getEvaluation() {
        return e;
    }

}
