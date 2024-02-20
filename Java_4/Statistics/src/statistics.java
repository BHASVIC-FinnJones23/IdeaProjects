import java.util.ArrayList;
 class Statistics {
    private int count;
     private int sum;
     private double average;
    private ArrayList<Integer> values = new ArrayList<>();


    public Statistics(){
        this.count = 0;
        this.average=0;
        this.sum = 0;
    }
    public void addNumber(int number){
        this.values.add(number);
        this.count +=1;
    }
     public int sum() {
         // write code here
         this.sum = 0;
         for(int i = 0;i<this.count;i++){
             this.sum += this.values.get(i);
         }
         return this.sum;
     }

     public double average() {
         // write code here
         this.sum = 0;
         for(int i = 0;i<this.count;i++){
             this.sum += this.values.get(i);
         }
         if(this.count != 0) {
             this.average = (double)this.sum/(double)this.count;
         }else{
             this.average=0;
         }
         return this.average;
     }
    public int getCount(){
        return this.count;
    }
}
