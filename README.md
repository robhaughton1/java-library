# Java Library Manager

A small Java console project built as programming practice to reinforce object-oriented design, `ArrayList` usage, indexing, input validation, and menu-driven program flow.

## Features

- Add books with a title, author, publication date, and price
- Store books as `Books` objects with private fields and getters
- Keep the book list sorted from lowest to highest price when new books are added
- Display books with user-friendly numbered selections
- Delete a selected book while translating the user's 1-based choice to Java's 0-based index
- Validate integer and decimal input so invalid values do not immediately terminate the program
- Handle invalid menu choices, invalid delete selections, and attempts to delete from an empty library

## Concepts Practiced

- Java classes and objects
- Constructors
- Encapsulation with private fields
- Getters
- `ArrayList`
- Indexed `for` loops
- Sorted insertion
- `switch` statements
- `try` / `catch`
- Input validation
- Zero-based indexing

## Files

- `Library.java` — main menu, input handling, sorting, listing, and deletion logic
- `Books.java` — book object definition and getters

## Running

Compile both files and run `Library`:

```bash
javac Books.java Library.java
java Library
```

This project documents my progress learning Java and building larger programs from multiple concepts rather than isolated exercises.
