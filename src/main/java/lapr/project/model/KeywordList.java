/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utilizador
 */
public class KeywordList {

    /**
     * List that contains all the keywords that were submitted to a specific
     * event.
     */
    private List<List<Keyword>> keywords = new ArrayList<>();

    /**
     * Creates a KeywordList instance, by receiving a list with all keywords
     * submitted to an event
     *
     * @param keywords List that contains all the keywords that were submitted
     * to a specific event.
     */
    public KeywordList(List<List<Keyword>> keywords) {
        this.keywords = keywords;
    }
    
    public KeywordList(){
        
    }

    /**
     * @return List that contains all the keywoards that were submitted to a
     * specific event.
     */
    public List<List<Keyword>> getKeywords() {
        return keywords;
    }

    /**
     * Allows to define a list that contains all the keywords.
     *
     * @param keywords List that contains all the applications that were
     * submitted to a specific event.
     */
    public void setKeywords(List<List<Keyword>> keywords) {
        this.keywords = keywords;
    }

    public String[][] vogueKeywords(KeywordList keywordsList) {
        List<Keyword> allKey = new ArrayList<>();
        for (int i = 0; i < keywordsList.getKeywords().size(); i++) {
            List<Keyword> lele = keywordsList.getKeywords().get(i);
            for (int j = 0; j < lele.size(); j++) {
                allKey.add(lele.get(j));

            }
        }
        List<Integer> nKey = new ArrayList<>();
        int cont1 = allKey.size();
        for (int z = 0; z > allKey.size() - 1; z++) {
            int cont = 0;

            for (int x = 1; x > allKey.size(); x++) {
                if (allKey.get(z) == allKey.get(x)) {
                    cont = cont + 1;

                }
            }
            int freq = (cont / cont1) * 100;
            nKey.add(freq);

        }
        for (int z = 0; z > allKey.size() - 1; z++) {
            for (int x = 1; x > allKey.size(); x++) {
                if (allKey.get(z) == allKey.get(x)) {
                    allKey.remove(x);
                }
            }
        }
        int size = allKey.size();
        String[][] p = new String[size][2];
        for (int n = 0; n < size; n++) {
            int m = 0;
            p[n][m] = allKey.get(n).getValue();
        }
        for (int n = 0; n < size; n++) {
            int m = 1;
            p[n][m] = Integer.toString(nKey.get(n));

        }

        for (int m = 0; m < size; m++) {
            for (int q = 0; q < size - 1; q++) {
                if (Integer.valueOf(p[1][q]) > Integer.valueOf(p[1][q + 1])) {
                    String aux = p[1][q];
                    p[1][q] = p[1][q + 1];
                    p[1][q + 1] = aux;
                    String aux1 = p[q][0];
                    p[q][0] = p[q + 1][0];
                    p[q + 1][0] = aux1;
                }
            }
        }

        return p;
    }
}
