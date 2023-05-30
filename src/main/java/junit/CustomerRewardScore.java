package junit;

public class CustomerRewardScore {

    public char determineRewardScore (int numberScore) {
        if (numberScore < 0) {
            throw new IllegalArgumentException("Reward score cannot be less than 0");
        }  if (numberScore <= 50) {
            return 'F';
        }  if (numberScore <= 75) {
            return 'E';
        }  if (numberScore <= 100) {
            return 'D';
        }  if (numberScore <= 140) {
            return 'C';
        }  if (numberScore <= 180) {
            return 'B';
        } else {
            return 'A';
        }
    }
}