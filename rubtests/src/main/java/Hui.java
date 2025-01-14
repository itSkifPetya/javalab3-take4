public class Hui{
    public  Hui() {

    }
    public int exc(int x) {
        try {
            return 1/x;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}
