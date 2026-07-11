# Set

1. **The Set interface in the Java Collection framework provides the features of the mathematical set in Java.**
2. **It extends the Collection interface.**

### NOTE ::-->
* Set `CANNOT contain DUPLICATE` items .
* ordering of elements is not fixed , it randomly preserved numbers in memory, `No specific sequence or order of an elements in set` .

### set contains -- 4 type 
1. `EnumSet`
2. `HashSet`
3. `LinkedHashSet`
4. `TreeSet`

## METHODS ->
> The set interface includes all the methods of the collection interface . it is because collection is a super interface of set.
---
> so some of the commonly used methods of the collection interface that's also available in set interace are :-

1. `add()` - adds the specified element to the set.
2. `addAll()` - (UNION) adds all the elements of the specified collection to the set.
3. `iterator()` - (ACCESS ) returns an iterator that can be used to access elements of the set sequentially.
4. `remove()` - removes the specified element from the set.
5. `removeAll()` - (DIFFERENCE) removes all the elements from the set that is present in another specified set.
6. `retainAll()` - (INTERSECTION) retains all the elements in the set that are  also present in another specified set.
7. `clear()` - removes all the elements from the set.
8. `size()` - returns the length (number of elements) of the set.
9. `toArray()` - returns an array containing all the elements of the set.
10. `contains()` - returns true if the set contains the specified element.
11. `containsAll()` - (SUBSET) returns true if the set contains all the elements of the specified collection.
12. `hashCode()` - returns a hash code value (address of the element in the set)

> `HashSet` -> O(1) , because store randomly 
---
> `LinkedHashSet` --> O(n), because it preserved order / conncecting element through nodes.
---
> `Tree Set` ---> O(log n) , becaue it based on - BST and in BST - insertion. accessing has tC has O(log n). ,,, and yaha hamre element sorted way me store hote hai.