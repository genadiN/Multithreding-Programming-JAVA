package problem2;

import java.util.Random;

public class Sequence { // outer class
    // Holds a sequence of Objects.
    private Object[] obs;
    private int next = 0; //current element number

    public Sequence(int size) {
        obs = new Object[size];
    }
    public void add(Object x) {
        if(next < obs.length) {
            obs[next] = x;
            next++;
        }
    }
    private class SSelectorForward implements SelectorForward {
        // inner class манипулира преместване от първия към последния
        private int i = 0;
        public boolean end() {
            return i == next;
        }
        public Object current() {
            return obs[i];
        }
        public void next() {
            if(i < next) i++;
        }
    } // end of inner class
    public SelectorForward getSelectorForward() {
        return new SSelectorForward();
    }

    private class SSelectorBackward implements SelectorBackward {
        // inner class манипулира преместване от последния към първия
        private int i = next - 1; //последния инициализиран елемент
        public boolean begin() {
            return i == -1;
        }
        public Object current() {
            return obs[i];
        }
        public void previous() {
            if(i >= 0) i--;
        }
    } // end of inner class
    public SelectorBackward getSelectorBackward() {
        return new SSelectorBackward();
    }
    public static void main(String[] args) {
// (1)създайте Sequence последователност от 8 елемента
        Sequence sequence = new Sequence(8);
// (2)инициализирайте Sequence елементите
// със случайни цели числа от интервала [10, 100]
        Random rand = new Random();
        for (int i = 0; i < 6; i++) { //less than 8 to check next
            sequence.add(rand.nextInt(91) + 10); //[0; 90] + 10
        }
// (3)използвайте метода getSelector(),за да разпечатате
// тези числа на конзолата
// от първия до последния елемент на последователността
        SelectorForward selectorForward = sequence.getSelectorForward();
        System.out.println("Forward: ");
        while (!selectorForward.end()){
            System.out.println(selectorForward.current());
            selectorForward.next();
        }
// (4)използвайте метода getRSelector(),за да разпечатате
// на конзолата тези числа
// от последния елемент до първия на последователността
        SelectorBackward selectorBackward = sequence.getSelectorBackward();
        System.out.println("Backward: ");
        while (!selectorBackward.begin()){
            System.out.println(selectorBackward.current());
            selectorBackward.previous();
        }
    }
} // end of Sequence.java