package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

public class Attribution {

    private Application a;
    private List<FAE> l_FAE;

    public Attribution() {
        this.l_FAE = new ArrayList<>();
    }

    public Attribution(Application a) {
        this.l_FAE = new ArrayList<>();
    }

    public Attribution(Application a, List<FAE> fae) {
        this.a = a;
        this.l_FAE = fae;
    }

    public void addFAEToList(FAE fae) {
        l_FAE.add(fae);

    }

    /**
     * Returns the list of FAE's that will evaluate the application
     *
     * @return FAE list
     */
    public List<FAE> getFAEs() {
        return l_FAE;
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
     * Checks if the FAE was attributed
     *
     * @param fae FAE to check
     * @return true attributed, false if not
     */
    public boolean attributedToFAE(FAE fae) {
        return l_FAE.contains(fae);
    }

    @Override
    public String toString() {
        String s = "";
        s = a.getCompanyName() + " attributed to ";
        for (FAE fae : l_FAE) {
            s += fae.getName() + " | ";
        }

        return s;
    }

}
