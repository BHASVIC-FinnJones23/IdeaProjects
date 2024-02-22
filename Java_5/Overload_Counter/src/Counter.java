public class Counter {
    private int value;
    public Counter(int startValue){
        this.value = startValue;
    }
    public Counter(){
        this.value = 0;
    }
    public int value(){
        return this.value;
    }
    public void increase(){
        this.value++;
    }
    public void decrease(){
        this.value--;
    }
    public void increase(int valueToIncreaseBy){
        this.value+=valueToIncreaseBy;
    }
    public void decrease(int valueToDecreaseBY){
        this.value-=valueToDecreaseBY;
    }

}
