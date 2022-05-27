## Obsługa wyjątków
1. Wszystkie wyjątki dziedziczą po `Throwable`
2. Rzucamy wyjątek poprzez `throw` (np. `throw RuntimeException()`)
3. Złapanie wyjątku wymaga użycia znanego z javy bloku try catch + ewentualnie finally
4. Podobnie jak if, `try` jest wyrażeniem zwracającym wartość -> brak mutacji zmiennej
5. W Kotlinie nie ma `checked exceptions` - jeśli używamy kod napisany w Kotlinie w innym języku, możemy użyć deklaracji `@Throws`
6. Throw jest wyrażaniem typu Nothing (znacznik dla kompilatora kierujący na nieosiągalny kod)

### ***
ZADANIE:
1. W klasie `Exceptions.kt` napisać metodę, która wypisze wszystkie numery pesel z pliku `resources/pesel.txt` (hint można skorzystać z prywatnej metody `getResourcePath(fileName: String)`)
2. Stworzyć nowy plik `ExceptionsJava` i w nim zaimplementować to samo.
3. Jakie mamy różnice?
### ***
