fun myCustomAccept(i:Int):Boolean =
    if (i % 2 == 0)
        true
    else if (i % 5 = 0)
        true
    else
        false

val numberFilter = NumberFilter()
numberFilter.setIntPredicate(this::myCustomAccept)