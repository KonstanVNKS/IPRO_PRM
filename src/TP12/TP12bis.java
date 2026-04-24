package TP12;
import eu.epfc.prm.Array;

public class TP12bis {

    /* Here under are the basic code for the principal types of sort*/
    public static void triSelection(Array<Integer> tab){
        for (int i = 0; i < tab.size()-1; i++) {
            int indMin = i;
            for (int j = 0; j < tab.size(); j++) {
                if(tab.get(j)<tab.get(indMin))
                    indMin = j;
            }
            int tmp = tab.get(i);
            tab.set(i, tab.get(indMin));
            tab.set(indMin, tmp);
        }
    }

    public static void triInsertion(Array<Integer> tab){
        for (int i = 0; i < tab.size(); i++) {
            var val = tab.get(i);
            int j = i;
            while (j>0 && val<tab.get(j-1)){
                tab.set(j,tab.get(j-1));
                --j;
            }
            tab.set(j,val);
        }
    }
}
