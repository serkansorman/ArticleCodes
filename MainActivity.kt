val numberFilter  = NumberFilter()
numberFilter.setIntPredicate({ it % 2 == 0 })

//Parantezsiz
numberFilter.setIntPredicate { it % 2 == 0 }