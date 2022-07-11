//String Sujan is passed and this program reverse it "najuS"

public class reverseString {

    public static void printRev(String str , int idx ) {
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return ;
        }
        System.out.print(str.charAt(idx));  // charAt(idx)  print the letter of that index
        printRev(str, idx - 1);
    }
    public static void main(String args[]) {
        String str  = "Sujan" ;
        printRev(str, str.length() -1 );   //because SUJAN contains 5 letter but index is 0 to 4
    }
}
 //Time Complezity :  O(n)  where n is the length of the string