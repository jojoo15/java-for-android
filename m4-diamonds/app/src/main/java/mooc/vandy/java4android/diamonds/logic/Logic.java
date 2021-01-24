package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        //  TODO -- add your code here
        int count = size;
        frame(size);
        count--;
        int pluscount = Math.abs(count);
        while (pluscount < size) {
            if (count == 0) {
                zero(size);
            }
            else {
                mOut.print("|");
                for (int j = 0; j < pluscount; j++) {
                    mOut.print(" ");
                }
                if (count > 0) {
                    mOut.print("/");
                } else {
                    mOut.print("\\");
                }
                for (int k = 0; k < 2 * (size-pluscount)-2; k++) {
                    if ((size-pluscount) % 2 == 1) {
                        mOut.print("=");
                    }
                    else {
                        mOut.print("-");
                    }
                }
                if (count > 0) {
                    mOut.print("\\");
                } else {
                    mOut.print("/");
                }
                for (int i = 0; i < pluscount; i++) {
                    mOut.print(" ");
                }
                mOut.print("|");
                mOut.println();
            }
            count--;
            pluscount=Math.abs(count);
        }
        frame(size);
    }
    // TODO -- add any helper methods here
     public void frame(int size){
        mOut.print("+");
        for(int i=0;i<2*size;i++){
            mOut.print("-");
        }
        mOut.print("+");
        mOut.println();
     }
     public void zero(int size){
        mOut.print("|<");
        for(int i=0;i<2*size-2;i++){
            if(size%2==1){
                mOut.print("=");
            }
            else{
                mOut.print("-");
            }
        }
        mOut.print(">|");
        mOut.println();
     }

};
