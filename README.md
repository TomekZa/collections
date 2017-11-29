
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
* implementacjami Queue są
* implementacjami Deque są


## W których kolekcjach elementy są sortowane i w jaki sposób?


## Implementacje interfejsu List – złożoność operacji

* ArrayList wykorzystuje wewnętrznie implementację tablicową
* LinkedList wykorzystuje wewnętrznie implementację wskaźnikową
* różnice pojawiają się podczas operacji takich jak: dodawanie elementu na początek listy, pobieranie i-tego elementu listy, usuwanie pierwszego elementu listy

## Do których kolekcji można wstawiać wartości null?

## Napisać aplikację wykorzystującą różne kolekcje i obrazującą różnice