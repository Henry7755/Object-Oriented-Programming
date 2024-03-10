/* ADT-- means Abstract Data type
*A data type is a program entity holding information that
*can be manipulated in a disciplined manner through a set of
* predefined operations.
*
* */

public class Counter {
    // A counter ADT ... this program wishes to count the number
    // of events in various context

    /*
    *  Counter ADT
    *
    * fields:
    *    count
    *
    * methods:
    *   reset -- sets the internal count value to zero
    *   increment -- increases the internal count value by one
    *   countValue -- access the current count value
    * */

    protected  int count;
    public void reset(){
        count  = 0;
    }

    public void increment(){
        count++;
    }

    public int countValue(){
        return count;
    }

    public static void main(String[] args) {
        Counter aCount = new Counter();
        aCount.increment();
        aCount.increment();
        aCount.increment();
        aCount.increment();
        aCount.increment();
        aCount.increment();
        aCount.increment();
        aCount.increment();
        aCount.increment();
        aCount.increment();

        System.out.println("The value of our increment is " + aCount.countValue());
        System.out.println("Resetting the counter");
        aCount.reset();
        System.out.println("New value of the counter "+ aCount.countValue());



    }
}

