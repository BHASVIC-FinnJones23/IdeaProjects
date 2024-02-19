import java.util.ArrayList;
 class Statistics {
    private int count;
    private ArrayList<Integer> values = new ArrayList<>();


    public Statistics(){
        this.count = 0;
    }
    public void addNumber(int number){
        values.add(number);
        this.count +=1;
    }
    public int getCount(){
        return this.count;
    }
}
