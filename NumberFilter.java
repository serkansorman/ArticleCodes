public class NumberFilter {
    private IntPredicate intPredicate;
 
    public void setIntPredicate(IntPredicate intPredicate) {
        this.intPredicate = intPredicate;
    }
 
    public void accept(int i) {
        if(intPredicate.accept(i))
          Log.d("NUMBERFILTER", "Number accepted");
        else
           Log.d("NUMBERFILTER", "Number not accepted");
    }
}