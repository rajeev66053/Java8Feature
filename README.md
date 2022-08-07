# Java 8 Features

### New Features
* Lamda Expression
* Stream Api
* Default methods in interface
* Static methods
* Functional Interface
* Optional
* Method References
* Date Api
* Nashorn, Java Engine

### Advantages of using Java 8
* Compact code(Less boilerplate code ).
* More readable and reusable code.
* More testable code.
* Parallel operations.

### Lamda Expresssion
* Lamda Expression is an annonymous function ( without name, return type and access modifier and having one lamda (->) symbol )
	> (a,b) -> System.out.println(a+b);
	
### Functional Interface
* Must have exactly one abstract method in interface.
* Can contain any number of default methods.
* Annotate with @FunctionalInterface to prevent the error in the interface for security that no more than two abstract method exist. It will give compile time error.

### Method References
* Method reference is replacement for lamda expression.


### Default Methods in Interface
* Default method is a way for adding new methods to the interface without affecting the implementating classes.
* The use of these default method is "Backward Compatibility" which means if JDK modifies any interface (without default method ) then the classes which implement this interface will break.
* Is default keyword one of the access modifier? Default is not the access modifier like public or protected or private.
* While overrideing default method we cannot reduce the visibility of method so we must use public access modifier in child implementing class to override default method.
* We cannot give hashcode method or equal method as default method in interface because a default method cannot override a method from java.lang.Object.
* We can solve diamond problem in interface by using :
	> InterfaceName.super.methodName();
	
### Static methods in Interface
* Static method in interface is introduced so the we can call the method by just interface name. No need to create class and then its object.
* Static method are not available to implementing class by default. Hence we can call these methods using interface name explicitly from implementing classes as implementing class wont have access to these method directly.

### Predicate

* Predicates is a predefined funtional interface ( Having only 1 abstract method).
* The only abstract method of predicate is test(T t):
	> public boolean test(T t);

* Advantages of Predicates:
1. Code Reusability.
2. Conditional checks are holded by funtional interfaces.

### Predicate joining
* There are three way of joining. If we want to test 2 condition then predicate joining is use.
	1. and
	2. or
	3. negate

### Function

* Function is also a predefined functional interface ( Having only 1 abstract method).
* The only abstract method of Function is apply(T t):
	> R apply(T t);
* Given some input perform some operation on input and then produce/ return result ( not necessary a boolean value ).
* In function return type is not fixed hence we decalare both input type and return type.


### Functional chaining
* We can combine / chain multiple functions together with andThen.
* There are two ways to combine functions:
	1. f1.andThen(f2).apply(Input); :- first f1 then f2
	2. f1.compose(f2).apply(Input); :- first f2 then f1
	
* Multiple function can be chained together like:
	> f1.andThen(f2).andThen(f3).andThen(f4).apply(Input);
	

### Consumer Functional Interface
* Consumer<T> : It will consume Item. Consumers never return anything ( never supply), thety  just consume.
	> public void accept(T t);
	
### Consumer chaining
* We can combine / chain multiple consumers together with andThen.
* There is only one way to combine consumers:
	1. c1.andThen(c2).accept(Input)
	
* No compose method in cosumer.
* Multiple consumer can be chained together like:
	> c1.andThen(c2).andThen(c3).andThen(c4).accept(Input);
	
	
### Supplier Functional Interface
* Supplier<R> : It will just supply required objects and will not take any input.
	> public R get();

* No chaining as no input is given to supplier.


### Use of BiConsumer, BiFunction,BiPredicate and why no BiSupplier?
* If we need two arguments for operation.
* There is no input in supplier so no 1 or 2  input arguments needed. Hence no BiSupplier.

* If we want to operate on 3 arguments the we have to use tripredicate? There is no Tripredicate or TriFunction etc.

### Streams
* If we want to process bulk objects of collection then go for streams concept.
* Its a special iterator class that allows proecessing collections of objects in a functional manner.


### Difference between streams( java 8 ) and java.io.Stream?
* Java io streams is a sequence of characters or binary data which is used to be written to a file or to read a data from a file.
* While Stream in java 8 is no where related to file, it is related to collection object.

* Stream has 3 steps
	1. Creation of Stream
	2. Configuration of Stream
		1. Filter
		2. Map
	3. Procesing of Stream
		1. Collect
		2. Count
		3. Sorted
		4. Min Max
		5. ForEach
		6. toArray
		7. ef()

* Intermediate Operations: Intermediate operation are operation which returns another stream as a result.

	1. filter()
	2. peek()
	3. map()
	4. distinct()
	5. sorted()
	6. limit()
	7. skip()
* Terminal Operations
	1. forEach()
	2. toArray()
	3. reduce()
	4. collect()
	5. min(),max(),count()
	6. anyMatch(),allMatch(),nonMatch()\
	7. findFirst(), findAny()


* Peek: Peek is used to support debugging where we want to see the elements as they flow pas a certain point in a pipeline.
* Reduce: Reduce combine elements of stream and produce single value.

