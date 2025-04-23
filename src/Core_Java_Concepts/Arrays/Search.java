package Core_Java_Concepts.Arrays;

public class Search {
    public static void main(String[] args) {
        //For strings use equals method to search in array it is recommended
        String[] st={"Hello","Melo","Khelo","Patto"};
        String target="Melo";
        int cnt=0;
        for (int i=0;i<st.length;i++) {
            if (st[i].equals(target)) {
                System.out.println("True");
                cnt++;
            }
        }
        if(cnt==0) System.out.println("False");
    }
}
