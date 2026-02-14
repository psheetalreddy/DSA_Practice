import java.util.*;

class Basics {
    class Stack {
        LinkedList<Integer> st = new LinkedList<>();

        void push(int num) {
            st.add(num);
        }

        void pop() {
            st.remove(st.peek());
        }

        


    }


    public static void main(String args[]) {
        
    }
}