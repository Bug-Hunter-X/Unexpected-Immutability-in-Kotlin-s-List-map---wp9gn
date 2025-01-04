# Kotlin Immutability Gotcha

This repository demonstrates a common pitfall for developers new to Kotlin: the immutability of collections.  Kotlin's collections are immutable by default; methods like `map`, `filter`, and `reduce` return *new* collections instead of modifying the original.

This can lead to unexpected behavior if you're accustomed to languages where these operations modify the list in place.

The `bug.kt` file showcases the unexpected behavior.  `bugSolution.kt` provides a solution by using `toMutableList()` to create a mutable copy before performing transformations.