public class Gauge {
    private int value = 0;
    public void increase(){
        this.value +=1;
    }
    public void decrease(){
        this.value -=1;
    }
    public int value(){
        return this.value;
    }
    public boolean full(){
        return this.value==5;
    }
}
