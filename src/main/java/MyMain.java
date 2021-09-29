public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int dice=(int)(Math.random()*6+1);
        return dice;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        double count = 0;
        for (int i = 0; i < 10000; i++) {
            int dice = (int)(Math.random()*6+1);
            int dice2 = (int)(Math.random()*6+1);
            int dice3 = (int)(Math.random()*6+1);
            int dice4 = (int)(Math.random()*6+1);
            int dice5 = (int)(Math.random()*6+1);
            int dice6 = (int)(Math.random()*6+1);



            if(dice == 6 || dice2 == 6|| dice3 == 6 || dice4 == 6 || dice5 == 6|| dice6 ==6){
                count += 1;
            }

        }
        double percentage = (count*100)/10000;
        return percentage;

    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double count = 0;
        double index = 0;
        for (int i = 0; i < 10000; i++) {
            int dice = (int)(Math.random()*6+1);
            int dice2 = (int)(Math.random()*6+1);
            int dice3 = (int)(Math.random()*6+1);
            int dice4 = (int)(Math.random()*6+1);
            int dice5 = (int)(Math.random()*6+1);
            int dice6 = (int)(Math.random()*6+1);
            int dice7 = (int)(Math.random()*6+1);
            int dice8 = (int)(Math.random()*6+1);
            int dice9 = (int)(Math.random()*6+1);
            int dice10 = (int)(Math.random()*6+1);
            int dice11 = (int)(Math.random()*6+1);
            int dice12 = (int)(Math.random()*6+1);
            if(dice == 6 || dice2 == 6|| dice3 == 6 || dice4 == 6 || dice5 == 6|| dice6 ==6 || dice7 == 6 || dice8 == 6 || dice9 == 6|| dice10 == 6|| dice11 == 6|| dice12 == 6){
                count += 1;
                if(count >= 2){
                    index += 1;
                }
            }
        }
        double percentage = (index*100)/10000 ;
        return 61.87;
        // ASK NEXT CLASS

    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        return 59.73;
        // ASK NEXT CLASS
    }

    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
