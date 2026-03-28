package chap9.f6SortingData.page512;

// Keeping compareTo() and equals() Consistent
// If you write a class that implements Comparable, you introduce new business logic for determining equality.
// The compareTo() method returns 0 if two objects are equal, while your equals() method returns true
// if two objects are equal. A natural ordering that uses compareTo() is said to
// be consistent with equals if, and only if, x.equals(y) is true whenever x.compareTo(y) equals 0.
//Similarly, x.equals(y) must be false whenever x.compareTo(y) is not 0.
// You are strongly encouraged to make your Comparable classes consistent with equals
// because not all collection classes behave predictably if the compareTo() and equals() methods
// are not consistent.
// For example, the following Product class defines a compareTo() method that is not consistent with equals:

class Product implements Comparable<Product> {
    private int id;
    private String name;

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Product other)
            return this.id == other.id;
        return false;
    }

    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }
}

//This class checks equality with id, but orders by name. Assuming names are not unique, this means we could have many pairs of elements in which compareTo() returns 0, but equals() returns false.
//One way to fix this is to update the methods to rely on the same attributes. If you still need to sort things by name, you can use a Comparator defined outside the class, as shown in the next section.



