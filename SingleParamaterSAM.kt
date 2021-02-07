// Tek parametre için normal lambda kullanımı
val isEven = IntPredicate { i -> i % 2 == 0 }

// 'it' değişkeni kullanarak lambda kullanımı
val isEven = IntPredicate { it % 2 == 0 }