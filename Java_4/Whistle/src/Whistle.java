public class Whistle {
    private String noise;

    public Whistle(String initialWhistle) {
        this.noise = initialWhistle;
    }

    public void sound() {
        System.out.println(this.noise);
    }
}
