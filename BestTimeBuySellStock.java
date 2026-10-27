import java.util.*;
public class BestTimeBuySellStock {
    public static void main(String args[])
    {
        int  price[] ={7,1,5,3,6,4};
        //best time to buy stock and sell stock..this array is days price's

        int min = Integer.MAX_VALUE;
        int max =0;

        for(int prices : price)
        {
            if(prices<min)
            {
                min =prices;
            }
            else {
                if(prices>max) {
                    max = prices;
                }
                //max =Math.max(max,prices);
            }
        }

        System.out.println(max-min);

    }
}
