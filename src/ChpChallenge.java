import java.util.*;

public class ChpChallenge {
    public static void main(String args[]) {

       // import of random class
        Random numGen = new Random();
      


        // declaring the arraylist
        ArrayList<String> guacList = new ArrayList<>();
        ArrayList<String> beansList = new ArrayList<>();
        ArrayList<String> salsaList = new ArrayList<>();
        ArrayList<String> sourcreamList = new ArrayList<>();
        ArrayList<String> veggiesList = new ArrayList<>();
        ArrayList<String> quesoList = new ArrayList<>();
        ArrayList<String> meatList = new ArrayList<>();
        ArrayList<String> riceList = new ArrayList<>();
        ArrayList<String> cheeseList = new ArrayList<>();

        // declaring the arraylist for all ingredients
        ArrayList<ArrayList<String>> allIngredients = new ArrayList<ArrayList<String>>();
        allIngredients.add(riceList);
        allIngredients.add(meatList);
        allIngredients.add(beansList);
        allIngredients.add(salsaList);
        allIngredients.add(veggiesList);
        allIngredients.add(cheeseList);
        allIngredients.add(guacList);
        allIngredients.add(quesoList);
        allIngredients.add(sourcreamList);

        // cheese list for the arraylist
        cheeseList.add("Yes Cheese");
        cheeseList.add("No Cheese");

        // queso list for the arraylist
        quesoList.add("No for Queso");
        quesoList.add("Yes for Queso");

        // sour cream arraylist
        sourcreamList.add("No Sour Cream");
        sourcreamList.add("Yes Sour Cream");

        // guac list for the arraylist
        guacList.add("No Quac");
        guacList.add("Yes Quac");

        // salsa list for the arraylist
        salsaList.add("Mild Spicy");
        salsaList.add("Medium spicy");
        salsaList.add("Hot spicy");
        salsaList.add("No spicy");
        salsaList.add("Every spice");

        // meat list for the arraylist
        meatList.add("Sofritas");
        meatList.add("Chorizo");
        meatList.add("Veggie meat");
        meatList.add("All");
        meatList.add("Chicken");
        meatList.add("Carnidas");
        meatList.add("None of Meat");
        meatList.add("Steak");

        // rice list for arraylist
        riceList.add("No Rice");
        riceList.add("All Rice");
        riceList.add("Brown Rice");
        riceList.add("White Rice");

        // beans list for the arraylist
        beansList.add("Pinto Beans");
        beansList.add("Black Beans");
        beansList.add("No Beans");
        beansList.add("All the Beans");

        // veggies list for the arraylist
        veggiesList.add("Fajita Veggies");
        veggiesList.add("All Veggies");
        veggiesList.add("Lettuce");
        veggiesList.add("No Veggies");



       for (int numberBurrito =0; numberBurrito < 25; numberBurrito++){
        int random_low;
        int random_high;
        int qtyRate = 0;
        int whichIndexingIngredients;
        double basePriceForBurritos;
        random_low = 5;
        random_high = 10;

           ArrayList<String> cashierBurrito = new ArrayList<>();
           ArrayList<Integer> burritoParts = new ArrayList<>();
           ArrayList<Integer> indexingListOfIngredients = new ArrayList<>();

           int numberOfListIngredients = random_low + numGen.nextInt(random_high - random_low);

           for (int i = 0; i < numberOfListIngredients; i++) {

               random_high = (8 + 1);
               random_low = 0;
               whichIndexingIngredients = random_low + numGen.nextInt(random_high - random_low);

               if (i > 0) {

                   if (indexingListOfIngredients.contains(whichIndexingIngredients)) {
                       i--;
                   } else {
                       indexingListOfIngredients.add(whichIndexingIngredients);
                   }
               } else {
                   indexingListOfIngredients.add(whichIndexingIngredients);
               }
           }
           for (int i = 0; i < numberOfListIngredients; i++) {

               random_high = allIngredients.get(indexingListOfIngredients.get(i)).size();

               if (random_high == 0) {
                   random_high++;
               }
               random_low = 0;
               int x = random_low + numGen.nextInt(random_high - random_low);
               burritoParts.add(x);
           }
           for (int i = 0; i < numberOfListIngredients; i++) {
               String x = allIngredients.get(indexingListOfIngredients.get(i)).get(burritoParts.get(i));
               cashierBurrito.add(x);
           }

           // For Math calc of the ingredients //

           for (int i = 0; i <cashierBurrito.size(); i++) {
               boolean no_rep = false;
               boolean none_rep = false;
               no_rep = cashierBurrito.get(i).equalsIgnoreCase("no");
               none_rep = cashierBurrito.get(i).equalsIgnoreCase("none");

               if (no_rep || none_rep) {

               } else
                   {
                   qtyRate++;
               }
           }
           basePriceForBurritos = 3 + (qtyRate * 0.5);
            System.out.printf("\nBurrito %d: ", (numberBurrito+1));
            for (int i = 0; i < cashierBurrito.size(); i++){

                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.printf("%s", cashierBurrito.get(i));
            }
            System.out.printf("\t\t$%.2f ", basePriceForBurritos);
       }
    }
}
