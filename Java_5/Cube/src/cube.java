
public class cube{
    private int edgeLength;
    public cube(int edgeLength){
        this.edgeLength=edgeLength;
    }
    public int volume(){
        return (int)Math.pow(edgeLength,3);
    }
    public String toString(){
        return String.format("Side length is: %s, volume is %s",this.edgeLength,this.volume());
    }
}
