package chap9.f6SortingData.page509;

//        The generic T lets you implement this method and specify the type of your object.
//        This lets you avoid a cast when implementing compareTo(). Any object can be Comparable.
//        For example, we have a bunch of ducks and want to sort them by name.
//        First, we create a record that inherits Comparable<Duck>, and then we implement the compareTo() method.
record Duck(String name) implements Comparable<Duck> {
    public int compareTo(Duck d) {
        return name.compareTo(d.name);  // Sorts ascendingly by name
    }
}
