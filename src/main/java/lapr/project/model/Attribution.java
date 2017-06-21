package lapr.project.model;

import java.io.Serializable;

public class Attribution implements Serializable{

    static final long serialVersionUID = 2;
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
    
    public void setEvaluation(Evaluation eva){
        this.e=eva;
    }
    
    public void setApplication(Application app){
        this.a=app;
    }
}
