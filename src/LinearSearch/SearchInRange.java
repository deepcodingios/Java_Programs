package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {

    }

    static boolean searchInRange(int startIndex, int endIndex, String name, char target){

        if (name.length() == 0){
            return false;
        }
        for (int i = startIndex; i <= endIndex; i++){
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
