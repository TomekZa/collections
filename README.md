
# Kolekcje

## W jaki sposób wygląda hierarchia interfejsów związana z kolekcjami?

* interfejs bazowy Collection
* interfejsy pochodne Collection: List, Set, Queue, Deque
* interfejsem pochodnym po Set jest SortedSet
* interfejs Map jest obok powyższej hierarchii
* interfejsem pochodnym po Map jest SortedMap

## Jakie są podstawowe implementacje poszczególnych interfejsów?

* implementacjami List są ArrayList, LinkedList
* implementacjami Set są HashSet, TreeSet, LinkedHashSet
* implementacjami Queue jest np. LinkedList i kilka innych ;-)
* implementacjami Deque jest np. LinkedList i kilka innych ;-)

## W których kolekcjach elementy są sortowane i w jaki sposób?

* interfejs SortedSet oraz jego implementacje TreeSet, ConcurrentSkipListSet
* interfejs SortedMap oraz jego implementacje TreeMap, ConcurrentSkipListMap
* wykorzystywana jest metoda compareTo interfejsu Comparable<T>

## Implementacje interfejsu List – złożoność operacji

* ArrayList wykorzystuje wewnętrznie implementację tablicową
* LinkedList wykorzystuje wewnętrznie implementację wskaźnikową
* różnice pojawiają się podczas operacji takich jak: dodawanie elementu na początek listy, pobieranie i-tego elementu listy, usuwanie pierwszego elementu listy

## Do których kolekcji można wstawiać wartości null?

* można wstawiać do: LinkedList, ArrayList, HashSet, LinkedHashSet, HashMap, LinkedHashMap, 
* nie można wstawiać do: TreeSet, ConcurrentSkipListSet, ConcurrentSkipListMap, TreeMap, Hashtable, ConcurrentHashMap

## Napisać aplikację wykorzystującą różne kolekcje i obrazującą różnice