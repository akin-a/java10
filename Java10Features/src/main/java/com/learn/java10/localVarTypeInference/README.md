- https://www.baeldung.com/java-10-local-variable-type-inference

-- Until Java 9, we had to mention the type of the local variable explicitly and ensure it was compatible with the initializer used to initialize it
-- In java 10, We don’t provide the data type of variable. Instead, we mark the variable as a var, and the compiler infers the type of variable from the type of the initializer present on the right-hand side.
-- his feature is available only for local variables with the initializer. It cannot be used for member variables, method parameters, return types, etc – the initializer is required as without which compiler won’t be able to infer the type.
-- there is no runtime overhead in using var nor does it make Java a dynamically typed language. The type of the variable is still inferred at compile time and cannot be changed later.


https://www.tutorialspoint.com/java10/java10_local_variable_type_inference.htm

No type inference in case of member variable, method parameters, return values.

Local variable should be initialized at time of declaration otherwise compiler will not be infer and will throw error.

Local variable inference is available inside initialization block of loop statements.

No runtime overhead. As compiler infers the type based on value provided, there is no performance loss.

No dynamic type change. Once type of local variable is inferred it cannot be changed.

Complex boilerplate code can be reduced using local variable type inference.


https://pradeesh-kumar.medium.com/limitations-of-local-variable-type-inference-in-java-81d2c0e6b6bb

Array initialization is not allowed without specifying its type during the initialization.

In Java 10,var was limited only to local variables. Java 11 expanded the scope of the var to Lambda arguments.