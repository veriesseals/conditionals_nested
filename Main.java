public class Main {
    public static void main(String[] args) throws Exception {
        
        // Create a variable to store the amount of money you have
        int amountOfMoney = 300;
        
        // 1st level if-statement
        if (amountOfMoney < 300) {

            // 2nd level if-statement inside the 1st level if-statement
            if (amountOfMoney > 200) {

                // code executed when level if-statements are true
                // both conditions are true
                // Print "No Diversions"
                System.out.println("No Diversions");

            } else {
                // code executed when 2nd level if-statement is false
                System.out.println("Either hoover Dam or Area 51");
            }

        } else {
            //  1st level else-statement which which executes when 1st level if-statement is false
            System.out.println("Go to Vegas");
        }
    
    }
}
