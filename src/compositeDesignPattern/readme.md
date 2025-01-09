# Composite Design Pattern

The Composite Design Pattern is a structural pattern that allows you to compose objects into tree structures to represent part-whole hierarchies. It lets clients treat individual objects and compositions of objects uniformly.

## Table of Contents
- [Intent](#intent)
- [Applicability](#applicability)
- [Structure](#structure)
- [Participants](#participants)
- [Collaborations](#collaborations)
- [Consequences](#consequences)

## Intent
Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

## Applicability
Use the Composite pattern when:
- You want to represent part-whole hierarchies of objects.
- You want clients to be able to ignore the difference between compositions of objects and individual objects.

## Structure
![Composite Design Pattern Structure](https://refactoring.guru/images/patterns/diagrams/composite/structure.png)

## Participants
- **Component**: Declares the interface for objects in the composition.
- **Leaf**: Represents leaf objects in the composition. A leaf has no children.
- **Composite**: Defines behavior for components having children and stores child components.
- **Client**: Manipulates objects in the composition through the Component interface.

## Collaborations
- Clients use the Component class interface to interact with objects in the composite structure.
- If the recipient is a Leaf, the request is handled directly.
- If the recipient is a Composite, it forwards requests to its child components.

## Consequences
- Makes the client simple.
- Makes it easier to add new kinds of components.
- Can make the design overly general.

## Examples

### File System Example
The file system example demonstrates how the Composite Design Pattern can be used to represent a hierarchical structure of files and directories. In this example:
- **Leaf**: The `File` class represents individual files.
- **Composite**: The `Directory` class represents directories that can contain files and other directories.
- **Client**: The client code can treat both files and directories uniformly through the `FileSystem` interface.

This example is useful because it shows how the Composite Design Pattern can simplify the management of complex hierarchical structures, such as file systems, by allowing clients to treat individual objects and compositions of objects uniformly.

### Calculator Example
The calculator example demonstrates how the Composite Design Pattern can be used to represent mathematical expressions. In this example:
- **Leaf**: The `Number` class represents individual numbers.
- **Composite**: The `Addition` class represents an addition operation that can combine two expressions.
- **Client**: The client code can treat both numbers and addition operations uniformly through the `Expression` interface.

This example is useful because it shows how the Composite Design Pattern can simplify the evaluation of complex expressions by allowing clients to treat individual numbers and composite operations uniformly. It also demonstrates how new operations can be easily added without modifying existing code.