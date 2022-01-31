package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {

        String name = "Pradeep";
        char target = 'P';
        System.out.println(searchInString(name,target));
    }

    static boolean searchInString(String name, char target){

        if (name.length() == 0){
            return false;
        }
            for (int i = 0; i < name.length(); i++){
                if (target == name.charAt(i)){
                    return true;
                }
            }
        return false;
    }
}
