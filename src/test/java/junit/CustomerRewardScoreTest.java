package junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerRewardScoreTest {

    @Test
    void customerRewardScoreOfZeroReturnsF(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('F', rewardScore.determineRewardScore(0));
    }

    @Test
    void customerRewardScoreBelowFiftyReturnsF(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('F', rewardScore.determineRewardScore(37));
    }

    @Test
    void customerRewardScoreOfFiftyReturnsF(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('F', rewardScore.determineRewardScore(50));
    }

    @Test
    void customerRewardScoreBelowSeventyFiveReturnsE(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('E', rewardScore.determineRewardScore(74));
    }

    @Test
    void customerRewardScoreOfSeventyFiveReturnsE(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('E', rewardScore.determineRewardScore(75));
    }

    @Test
    void customerRewardScoreBelowOneHundredReturnsD(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('D', rewardScore.determineRewardScore(92));
    }

    @Test
    void customerRewardScoreOfOneHundredReturnsD(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('D', rewardScore.determineRewardScore(100));
    }

    @Test
    void customerRewardScoreBelowOneHundredFortyReturnsC(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('C', rewardScore.determineRewardScore(133));
    }

    @Test
    void customerRewardScoreOfOneHundredFortyReturnsC(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('C', rewardScore.determineRewardScore(140));
    }

    @Test
    void customerRewardScoreBelowOneHundredEightyReturnsB(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('B', rewardScore.determineRewardScore(177));
    }

    @Test
    void customerRewardScoreOfOneHundredEightyReturnsB(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('B', rewardScore.determineRewardScore(180));
    }

    @Test
    void customerRewardScoreAboveOneHundredEightyReturnsA(){
        var rewardScore = new CustomerRewardScore();
        assertEquals('A', rewardScore.determineRewardScore(181));
    }

    @Test
    void customerRewardScoreCannotBeBelowZeroAndReturnsException(){
        var rewardScore = new CustomerRewardScore();
        assertThrows(IllegalArgumentException.class, () ->{
            rewardScore.determineRewardScore(-2);
        });
    }


}