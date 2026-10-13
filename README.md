# OOPS Lab Sheet 02 - Java Solutions

This folder contains 29 separate, runnable Java programs. Each program uses its own class, creates an object in `main`, and calls an instance method to perform the solution. Programs needing input read it from the terminal with `Scanner`.

## Solutions

1. `Question01HeronTriangleArea.java` - Validates three side lengths, then calculates area using Heron's formula and the semi-perimeter.
2. `Question02CompoundInterest.java` - Calculates compound interest and final balance with annual compounding: amount = principal x (1 + rate/100)^time.
3. `Question03DistanceBetweenPoints.java` - Uses the 2D distance formula between two coordinate points.
4. `Question04VisitorCounter.java` - Simulates visitor entries with alternating postfix `count++` and prefix `++count`, then decrements the count as visitors leave.
5. `Question05UnaryNegation.java` - Applies unary minus to an integer.
6. `Question06HalvingSteps.java` - Repeatedly applies `/= 2` to a non-negative decimal value while it is at least 1 and counts the steps.
7. `Question07WeeklyRainfall.java` - Reads seven daily values and accumulates them with `+=`.
8. `Question08ValidTriangleAngles.java` - Checks that every angle is positive and their sum is 180 degrees.
9. `Question09StringLexicographicOrder.java` - Compares characters using `<` and `>` and uses string lengths if one input is a prefix; no built-in string comparison method is used. Comparison is case-sensitive by Java character values.
10. `Question10LeapYearInRange.java` - Combines the leap-year test and inclusive range test with logical operators.
11. `Question11CoursePass.java` - Applies `(theory >= 40 AND practical >= 50) OR overall >= 50`, following the prompt's operator precedence.
12. `Question12SmallestOfFour.java` - Finds the smallest value with nested ternary expressions.
13. `Question13TernaryCharacterType.java` - Uses nested ternary expressions to classify a character as digit, vowel, consonant, or special symbol.
14. `Question14XorSwap.java` - Swaps local integer values using XOR without a temporary variable.
15. `Question15CountSetBits.java` - Counts set bits with `n &= n - 1`; negative `int` values are counted across all 32 two's-complement bits.
16. `Question16PowerOfTwoShifts.java` - Demonstrates left shift for multiplication and signed right shift for division by a power of two. Java `int` overflow and rounding for negative values follow normal shift semantics.
17. `Question17RotateBitsLeftByTwo.java` - Rotates all 32 bits of an integer left by two positions using left shift, unsigned right shift, and OR.
18. `Question18FibonacciFirstTwenty.java` - Prints 20 Fibonacci terms using a `for` loop.
19. `Question19ArmstrongNumbersTo1000.java` - Tests each number from 1 through 1000 and prints Armstrong numbers using a `for` loop.
20. `Question20PasswordPrompt.java` - Uses a `do-while` loop to repeat the prompt until the sample password `java123` is entered. Change the constant in the class to choose a different password.
21. `Question21FactorsDoWhile.java` - Displays every positive factor of a positive integer using `do-while`.
22. `Question22ReverseInteger.java` - Reverses decimal digits with a `while` loop and preserves a negative sign.
23. `Question23PalindromeWhile.java` - Reverses a non-negative integer with a `while` loop and checks whether it matches the original.
24. `Question24ArrayMaximumMinimum.java` - Finds array minimum and maximum with a for-each loop.
25. `Question25AverageMarks2D.java` - Uses for-each loops to calculate each student's average and the overall average from a 2D marks array.
26. `Question26WeekdayWeekend.java` - Uses `switch-case`, with 1=Monday through 7=Sunday.
27. `Question27GradeMeaning.java` - Uses `switch-case` to describe grades A through F; input is case-insensitive.
28. `Question28SkipPerfectSquares.java` - Prints numbers from 1 to 50 except perfect squares, using `continue`.
29. `Question29RandomUntilDivisible.java` - Generates values from 1 to 100 until it finds one divisible by both 7 and 13, then exits the loop with `break`.

## Compile and Run

Open PowerShell in this folder and compile the programs into `out`:

```powershell
javac -d out *.java
```

Run a program by using its class name. For example:

```powershell
java -cp out labsheet02.Question01HeronTriangleArea
java -cp out labsheet02.Question29RandomUntilDivisible
```

For any other question, use the `labsheet02.` prefix followed by the class name from the corresponding filename without `.java`. Interactive examples prompt for input in the terminal.