public class Task6 {

    public static int[] vectorAdd(int x,int y,int dx, int dy) {
        x=x+dx;
        y=y+dy;
        int[] ret = new int[]{x,y};
        return ret;
    }
    public static void main(String[] args) {
        int a=0;
        int b=2;
        int[] ret = vectorAdd(a,b,1,1);
        a = ret[0];
        b = ret[1];
        System.out.println(a+","+b);
        // (a,b) is still (0,2)
    }

}
