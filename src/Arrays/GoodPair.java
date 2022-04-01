package Arrays;

import java.util.ArrayList;

/*
* Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
* Check if any good pair exist or not.
*
* Problem Constraints

1 <= A.size() <= 104

1 <= A[i] <= 109

1 <= B <= 109

* * Input Format

First argument is an integer array A.

Second argument is an integer B.

* Output Format

Return 1 if good pair exist otherwise return 0.
*
* Example Input

Input 1:

A = [1,2,3,4]
B = 7
Input 2:

A = [1,2,4]
B = 4
Input 3:

A = [1,2,2]
B = 4


Example Output

Output 1:
1
*
Output 2:
0
*
Output 3:
1

Example Explanation

Explanation 1:

 (i,j) = (3,4)
Explanation 2:

No pair has sum equal to 4.
Explanation 3:

 (i,j) = (2,3)
* */
public class GoodPair {
    public static void main(String[] args) {

        ArrayList<Integer> list_1 = new ArrayList<>(10);
        list_1.add(1);
        list_1.add(2);
        list_1.add(3);
        list_1.add(4);

        System.out.println(solve(list_1,7));
    }

    static int solve(ArrayList<Integer> A, int B) {

        int isGoodPair = 0;

        for (int i = 0;i < A.size();i++){

            int element = A.get(i);

            for (int j = i+1; j <= A.size()-1; j++){

//                System.out.println(i + " " + j);
                if (A.get(i)+A.get(j) == B){
                    isGoodPair = 1;
                    break;
                }
            }
            if (isGoodPair == 1){
                break;
            }
        }

        return isGoodPair;
    }
}
