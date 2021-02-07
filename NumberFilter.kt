class NumberFilter {
  
    var intPredicate:(i:Int)->Boolean = {it >= 0} // Default implementation
                                   
    fun accept(i:Int) {
        if(intPredicate(i))
            Log.d("NUMBERFILTER", "Number accepted");
        else
            Log.d("NUMBERFILTER", "Number not accepted");
    }
}