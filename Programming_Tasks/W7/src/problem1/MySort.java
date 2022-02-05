package problem1;

public class MySort {
    private Sortable callback;

    public MySort(Sortable callback) {
        this.callback = callback;
    }

    public MySort() {
        callback = new Sortable() {
            @Override
            public boolean greater(int a, int b) {
                return a > b; //ascending
            }
        };
    }

    public Sortable getCallback() {
        return callback;
    }

    public void setCallback(Sortable callback) {
        this.callback = callback;
        //can add validation
    }

    public void sort(int[] numbers){
        if(callback == null || numbers == null) return;

        int swap;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (callback.greater(numbers[j], numbers[j + 1])) {
                    swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;
                }
            }

        }
    }
}
