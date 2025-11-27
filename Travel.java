public class Travel {
    public static void travel(int x, int y) {
        // TODO: Your code here
        String path = "";
        travel(x, y, path);
    }

    public static void travel(int x, int y, String path) {
        // base case
        if (x == 0 && y == 0) {
            System.out.println(path);
        } else {

            // put all the solutions make sense below
            if (x > 0) {
                if (path.isEmpty()) {
                    travel(x - 1, y, path + "E");
                } else {
                    travel(x - 1, y, path + " E");
                }
            }

            if (y > 0) {
                if (path.isEmpty()) {
                    travel(x, y - 1, path + "N");
                } else {
                    travel(x, y - 1, path + " N");
                }
            }

            if (x > 0 && y > 0) {
                if (path.isEmpty()) {
                    travel(x - 1, y - 1, path + "NE");
                } else {
                    travel(x - 1, y - 1, path + " NE");
                }
            }
        }
    }

    public static void main(String[] args) {
        travel(1, 2);
    }
}
