package Collections;

import java.util.ArrayList;

public class Definitions {
    public String getIndex(ArrayList<String> seriesList,int index){
       return seriesList.get (index);
    }

    public ArrayList<String> addAfterSeries(ArrayList<String> seriesList,String p, String q){
        int i = seriesList.indexOf (p);
        seriesList.add (i+1,q);
        return seriesList;
    }

    public static void main(String[] args) {
        ArrayList<String> seriesList=new ArrayList<> ();
        seriesList.add("Breaking Bad");
        seriesList.add("Game of Thrones");
        seriesList.add("Friends");
        seriesList.add("Prison break");
       Definitions d=new Definitions ();
        System.out.println (d.getIndex (seriesList,3));
        System.out.println (d.addAfterSeries (seriesList,"Friends","SuperNaturals"));
    }
}
