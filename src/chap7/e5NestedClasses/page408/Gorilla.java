package chap7.e5NestedClasses.page408;

//You can even define anonymous classes outside a method body.
// The following may look like we are instantiating an interface as an instance variable,
// but the {} after the interface name indicates that this is an anonymous class
// implementing the interface:
public class Gorilla {
    interface Climb {}
    Climb climbing = new Climb() {};
}
//JAVAFX : CANNOT RUN HERE, THIS IS JUST AN EXAMPLE
//Anonymous Classes and Lambda Expressions
//
//Prior to Java 8, anonymous classes were frequently used for asynchronous tasks and event handlers. For example, the following shows an anonymous class used as an event handler in a JavaFX application:
//
//
//var redButton = new Button();
//    redButton.setOnAction(new EventHandler<ActionEvent>() {
//    public void handle(ActionEvent e) {
//        System.out.println("Red button pressed!");
//    }
//});
//Since the introduction of lambda expressions, anonymous classes are now often replaced with much shorter implementations:
//Button redButton = new Button();
//    redButton.setOnAction(e -> System.out.println("Red button pressed!"));
//
//We cover lambda expressions in detail in the next chapter.