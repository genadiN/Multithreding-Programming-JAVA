package Sequence;

interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] obs;
    private int next = 0;
    public Sequence(int size){
        obs = new Object[size];
    }
    public void add(Object x){
        if(next < obs.length){
            obs[next] = x;
            next++;
        }
    }

    //the inner class definition follows next
    //example shows how you can inner class links to the outer class = continued
    private class SSelector implements Selector{ // the
        // inner class definition
        int i = 0;
        public boolean end(){
            return i == obs.length; // access outer class data
        }
        public Object current(){
            return obs[i];
        }
        public void next(){
            if(i < obs.length){
                i++;
            }
        }
    }
    public Selector getSelector(){
        //return inner class reference
        return new SSelector();
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(10);
        for(int i = 0 ; i < 10 ; i++){
            s.add(Integer.toString(i));
        }
        Selector s1 = s.getSelector();
        //inner class Object manages outer class members
        while(!s1.end()){
            System.out.println(s1.current());
            s1.next();
        }
    }
}
