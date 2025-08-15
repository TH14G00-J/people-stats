# People Project

This is a simple Java project to manage information about people.

## Description

The program reads data for N people, including their name, age, and height. It calculates the average height and the percentage of people under 16 years old. It also prints the names of those under 16.

## Project Structure

* `entities/People.java`: Class representing a person with fields `name`, `age`, and `height`.
* `Main.java`: Main class that contains the program logic for reading data, calculating statistics, and printing results.

## How to Run

1. Compile the project:

```
javac -d bin src/entities/People.java src/Main.java
```

2. Run the program:

```
java -cp bin Main
```

## Example

```
How many people will be entered? 5
Data of person 1:
Name: Joao
Age: 15
Height: 1.82
Data of person 2:
Name: Maria
Age: 16
Height: 1.60
Data of person 3:
Name: Teresa
Age: 14
Height: 1.58
Data of person 4:
Name: Carlos
Age: 21
Height: 1.65
Data of person 5:
Name: Paulo
Age: 17
Height: 1.78

Average height: 1.69
People under 16: 40.0%
Joao
Teresa
```

## Notes

* The program assumes valid input is provided.
* The `People` class uses immutable fields for safety.
