package Latihan1_Library;

public class latihan1Nolibrary {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next :" + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}

class Stack {
    private String[] stack;
    private int top;

    public Stack() {
        stack = new String[10];
        top = -1;
    }

    public void push(String value) {
        if (top == stack.length - 1) {
            String[] newStack = new String[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                newStack[i] = stack[i];
            }
            stack = newStack;
        }
        top++;
        stack[top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String value = stack[top];
        top--;
        return value;
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int search(String value) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].equals(value)) {
                return top - i + 1;
            }
        }
        return -1;
    }
}