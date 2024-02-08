- https://www.baeldung.com/java-10-local-variable-type-inference

-- Until Java 9, we had to mention the type of the local variable explicitly and ensure it was compatible with the initializer used to initialize it
-- In java 10, We don’t provide the data type of variable. Instead, we mark the variable as a var, and the compiler infers the type of variable from the type of the initializer present on the right-hand side.
-- his feature is available only for local variables with the initializer. It cannot be used for member variables, method parameters, return types, etc – the initializer is required as without which compiler won’t be able to infer the type.
-- there is no runtime overhead in using var nor does it make Java a dynamically typed language. The type of the variable is still inferred at compile time and cannot be changed later.