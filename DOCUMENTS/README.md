
# Basic Syntax:

---


# Case Sensitivity - 
```
  Scala is case-sensitive, which means identifier Hello and hello would have different meaning in Scala.
```

---

# Class Names - 
```
For all class names, the first letter should be in Upper Case.
If several words are used to form a name of the class, each inner word's first letter should be in Upper Case.
Example class MyFirstScalaClass
```

---

# Method Names - 
```
All method names should start with a Lower Case letter.
If several words are used to form the name of the method, then each inner word's first letter should be in Upper Case.
Example def myMethodName()
```

---

# Program File Name -
```
Name of the program file should exactly match the object name.
When saving the file you should save it using the object name (Remember scala is case-sensitive) and append '.scala' to the end of the name. 
(if the file name and the object name do not match your program will not compile).
Example: Assume 'HelloWorld' is the object name. Then the file should be saved as 'HelloWorld.scala'
```

--

# def main(args: Array[String]) - 
```
Scala program processing starts from the main() method which is a mandatory part of every Scala Program.
```

---

# Scala Identifiers:
```
All Scala components require names. Names used for objects, classes, variables and methods are called identifiers. 
A keyword cannot be used as an identifier and identifiers are case-sensitive. 
There are following four types of identifiers supported by Scala:
```

---

### Alphanumeric identifiers
```
An alphanumeric identifier starts with a letter or underscore, which can be followed by further letters, digits, or underscores. 
The '$' character is a reserved keyword in Scala and should not be used in identifiers. Following are legal alphanumeric identifiers:
```

---

### Operator identifiers
```

An operator identifier consists of one or more operator characters. Operator characters are printable ASCII characters such as +, :, ?, ~ or #. 
Following are legal operator identifiers:
+ ++ ::: <?> :>
The Scala compiler will internally "mangle" operator identifiers to turn them into legal Java identifiers with embedded $ characters. For instance, 
the identifier :-> would be represented internally as $colon$minus$greater.
```

---

### Mixed identifiers
```
A mixed identifier consists of an alphanumeric identifier, which is followed by an underscore and an operator identifier.
 Following are legal mixed identifiers:
unary_+,  myvar_=
Here, unary_+ used as a method name defines a unary + operator and myvar_= used as method name defines an assignment operator.

```

### Literal identifiers
```
A literal identifier is an arbitrary string enclosed in back ticks (` . . . `). Following are legal literal identifiers:
`x` `<clinit>` `yield`
```

---

# Scala Keywords:
```
These reserved words may not be used as constant or variable or any other identifier names.
abstract	
case	
catch	
class
def	
do	
else	
extends
false	
final	
finally	
for
forSome	
if	
implicit	
import
lazy	
match	
new	
null
object	
override	
package	
private
protected	
return	
sealed	
super
this	
throw	
trait	
try
true	
type	
val	
var
while	
with	
yield	 
-	
:	
=	
=>
<-	
<:	
<%	
>:
#	
@
```

---

# Comments in Scala
```

Single Line Comments
 //  ----- text-----
 
Multilines Comments 
/* 
   ----- text-----
*/ 

```

---

# Newline Characters:
```
semicolumn is new line character (;)
```

---

# Scala Packages:

### To import the complete package
```
import scala.xml._
```
### To import only single class
```
import scala.collection.mutable.HashMap
```

### To import more than one class or object from a single package
```
import scala.collection.immutable.{TreeMap, TreeSet}
```

---

# Scala Data Types
```
Byte	8 bit signed value. Range from -128 to 127
Short	16 bit signed value. Range -32768 to 32767
Int	32 bit signed value. Range -2147483648 to 2147483647
Long	64 bit signed value. -9223372036854775808 to 9223372036854775807
Float	32 bit IEEE 754 single-precision float
Double	64 bit IEEE 754 double-precision float
Char	16 bit unsigned Unicode character. Range from U+0000 to U+FFFF
String	A sequence of Chars
Boolean	Either the literal true or the literal false
Unit	Corresponds to no value
Null	null or empty reference
Nothing	The subtype of every other type; includes no values
Any	The supertype of any type; any object is of type Any
AnyRef	The supertype of any reference type
```


# Scala Basic Literals:
---

### Integer Literals
```
Integer literals are usually of type Int, or of type Long when followed by a L or l suffix.
```

### Floating Point Literals
```
Floating point literals are of type Float when followed by a floating point type suffix F or f, and are of type Double otherwise. 
```

### Boolean Literals
```
The boolean literals true and false are members of type Boolean.
```
### Symbol Literals
```
A symbol literal 'x is a shorthand for the expression scala.Symbol("x"). Symbol is a case class, 

package scala
final case class Symbol private (name: String) {
   override def toString: String = "'" + name
}
```

### Character Literals
```
A character literal is a single character enclosed in quotes. 
The character is either a printable unicode character or is described by an escape sequence.
```

### String Literals
```
A string literal is a sequence of characters in double quotes.
The characters are either printable unicode character or are described by escape sequences. 
```

### Multi-Line Strings
```
A multi-line string literal is a sequence of characters enclosed in triple quotes """ ... """. 
The sequence of characters is arbitrary, except that it may contain three or more consuctive quote characters only at the very end.
Characters must not necessarily be printable; newlines or other control characters are also permitted. Here is a multi-line string literal:
Ex:
"""------x--------
------y--------
------z--------"""
```

### The Null Value
```
The null value is of type scala.Null and is thus compatible with every reference type.
 It denotes a reference value which refers to a special "null" object
 ```

---

# Scala Variables
---
## Single Var Diclaration
```
var keyword is used for dilcaring variable 
var <varName> : <dataType> = <literal>
or
val or val VariableName : DataType [=  Initial Value]
Ex:
var myVar = 10;
val myVal = "Hello, Scala!";
```

## Multiple assignments:
```
val (<varName1>: <DataType>, <varName2>: <DataType>) = Pair(<Literal for varName1>, <Literal for varName2>)
Ex: 
val (myVar1, myVar2) = Pair(100, "Adarsh")
```

## Variable Types:
````
Variables in Scala can have three different scopes depending on the place where they are being used. 
They can exist as fields, as method parameters and as local variables.
```

* Fields:
```
Fields are variables that belong to an object. The fields are accessible from inside every method in the object. 
Fields can also be accessible outside the object depending on what access modifiers the field is declared with. 
Object fields can be both mutable or immutable types and can be defined using either var or val.
```

* Method Parameters:
```
Method parameters are variables, which are used to pass the value inside a method when the method is called. 
Method parameters are only accessible from inside the method but the objects passed in may be accessible from the outside, 
if you have a reference to the object from outside the method. Method parameters are always mutable and defined by var keyword.
```
* Local Variables:
```
Local variables are variables declared inside a method. Local variables are only accessible from inside the method, 
but the objects you create may escape the method if you return them from the method. Local variables can be both mutable or 
immutable types and can be defined using either var or val.
```

---

# Scala Access Modifiers

* Private members:
```
private member is visible only inside the class or object that contains the member definition
```

* Protected members:
```
protected member is only accessible from subclasses of the class in which the member is defined.
```
* Public members:
```
Every member not labeled private or protected is public. 
There is no explicit modifier for public members. Such members can be accessed from anywhere. 
```

