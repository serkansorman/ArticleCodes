// 'object' keyword u kullanarak anonim sınıf örneği oluşturma
val isEven = object : IntPredicate {
   override fun accept(i: Int): Boolean {
       return i % 2 == 0
   }
}