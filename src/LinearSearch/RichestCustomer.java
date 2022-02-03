package LinearSearch;

public class RichestCustomer {
    public static void main(String[] args) {
        int [] [] array = {
                {23,4,5,6,345,23},
                {342,347,32,23,12},
                {23,4,5,6}
        };
        System.out.println(findMaximumWealth(array));
    }

    static int findMaximumWealth(int[][] accounts){

        int answer = 0;

        for (int person = 0; person < accounts.length; person++){
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length; account ++){
                rowSum = rowSum + accounts[person][account];
            }
            if (rowSum > answer) {
                answer = rowSum;
            }
        }
        return answer;
    }
}
