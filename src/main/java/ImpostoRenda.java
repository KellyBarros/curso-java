public class ImpostoRenda {

    public static void main(String[] args) {
        int n = 15;
        multiplo(n);

    }

    private static void multiplo(int n) {
        if (n> 0 ) {
            for (int i = 1; i <= n; i++) {
                boolean mTres = i%3 ==0;
                boolean mCinco = i%5==0;
                if (mTres && mCinco) {
                    System.out.println("a");
                } else if (mTres && !mCinco) {
                    System.out.println("b");
                } else if(!mTres && mCinco){
                    System.out.println("c");
                } else if(!mTres && !mCinco){
                    System.out.println(i);
                }
            }
        }
    }
}
