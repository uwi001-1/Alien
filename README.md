# Java Alien Profile Inheritance Project

An Object-Oriented Programming (OOP) project built in Java to explore abstract base classes, constructor chaining with `super()`, and method overriding.

## 🚀 Project Components

1. **`Alien.java`**: An abstract base class defining shared protected attributes (`numEyes`, `skinColor`, `nativeLanguage`), a parameterized constructor, and a custom `toString()` method for profile descriptions.
2. **`Martian.java`**: A concrete subclass extending `Alien` with hardcoded Martian traits (4 eyes, red skin, click language).
3. **`Jupiterian.java`**: A concrete subclass extending `Alien` with hardcoded Jupiterian traits (2 eyes, green skin, hum language).
4. **`CreateAliens.java`**: The driver application that instantiates the alien objects and displays their formatted profiles.

## OOP Concepts Demonstrated
* **Abstract Classes:** Enforcing a structural template (`Alien`) that cannot be instantiated directly.
* **Constructor Chaining:** Utilizing `super(...)` in subclasses to pass specific attribute values up to the parent constructor.
* **Polymorphism & Overriding:** Leveraging the root `Object` class's `toString()` method to output formatted instance states cleanly.