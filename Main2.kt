val numberFilter = NumberFilter()
numberFilter.intPredicate = this::myCustomAccept
// OR
numberFilter.intPredicate = { it % 7 == 0 }