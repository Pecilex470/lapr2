package lapr.project.model;

import java.io.Serializable;

public class Attribution implements Serializable{

    static final long serialVersionUID = 2;
    private Application a;
    private String faeUsername;

 

    public Attribution(Application a, String faeUsername) {
        this.a = a;
        this.faeUsername=faeUsername;
    }

    public Attribution() {

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
    

    public void setUser(String username){
        this.faeUsername=username;
    }
    
    public void setApplication(Application app){
        this.a=app;
    }
}
