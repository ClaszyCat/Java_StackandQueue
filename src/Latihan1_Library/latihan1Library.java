package Latihan1_Library;
import java.util.Stack;

public class latihan1Library {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next: " +st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
