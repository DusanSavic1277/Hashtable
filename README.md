# Java Hashtable Example

## Description
This project demonstrates the basic usage of the `Hashtable` class in Java.  
It stores student ID numbers as keys and student names as values, then prints
out the hash index, key, and corresponding value.
The example shows how hashing works internally by calculating the index using
the hash code modulo the table size.

## Technologies Used
- Java SE
- java.util.Hashtable

## How It Works
1. A `Hashtable<Integer, String>` is created with an initial capacity of 10.
2. Student IDs are used as keys, and student names as values.
3. The program iterates through the keys and prints:
   - The calculated hash index (`key.hashCode() % 10`)
   - The key (student ID)
   - The value (student name)
