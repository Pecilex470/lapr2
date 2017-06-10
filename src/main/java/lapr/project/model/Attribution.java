package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

public class Attribution {

    private Application app;
    private List<FAE> l_FAE;
    

    public Attribution() {
        this.l_FAE = new ArrayList<>();
    }

    public Attribution(Application c) {
        this.l_FAE = new ArrayList<>();
    }

    public Attribution(Application c, List<FAE> fae) {
        this.app = c;
        this.l_FAE = fae;
    }

    public void addFAEToList(FAE fae) {
        l_FAE.add(fae);

    }

    /**
     * Devolve a lista de FAE definida para a avaliação
     *
     * @return lista de FAE
     */
    public List<FAE> getFAEs() {
        return l_FAE;
    }

    /**
     * Devolve a candidatura à qual corresponde a atribuição
     *
     * @return candidatura
     */
    public Application getCandidatura() {
        return app;
    }

    /**
     * Verifica se a atribuição é respectiva à candidatura
     *
     * @param c candidatura a verificar
     * @return true se corresponder, senão false
     */
    public boolean eDaCandidatura(Application c) {
        return app.equals(c);
    }

    /**
     * Verifica se o FAE foi atribuido
     *
     * @param fae FAE a verificar
     * @return true em caso afirmativo, senão false
     */
    public boolean atribuidoAoFAE(FAE fae) {
        return l_FAE.contains(fae);
    }

    @Override
    public String toString() {
        String s = "";
        s = app.getCompanyName() + " atribuida a ";
        for (FAE fae : l_FAE) {
            s += fae.getName() + " | ";
        }

        return s;
    }

  

}
