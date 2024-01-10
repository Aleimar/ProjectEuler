In hopes of improving my mathematical algorithms, I reviewed some concepts and
recalled this specific property of prime numbers.

# The square root of any prime number is irrational.


Before we discuss the proof, let's revisit:

## The Fundamental Theorem of Arithmetic

For every integer *n*, such that *n>1*, is either a prime or product of primes.
The theorem further asserts that each integer has a unique prime factorization thus it has a distinct combination or mix of prime factors. 

In simple terms, when we break down a number into its prime factors, each prime factor occurs a specific number of times, and the order in which they appear doesn't affect this uniqueness.

EXAMPLE:

Observe *a*:

a = 20 = 2 * 2 * 5 = $2^2 * 5$ 
$a^2 = (20)^2 = (2^2)^2 * (5)^2 = 2^4 * 5^2$

After squaring the integer *a*, **the exponents of the unique prime factors of *a* are now ALL even numbers.**

Generally, this would be:

For every integer *b*, here is the factorization of integer *b* into its prime constituents:

$b = p_1^{n_2}$

## Proof by contradiction

Let's assume *p* is any prime number and that $\sqrt{p}$ is rational.

Then, there are natural numbers *m* and *n* where n $\neq$ 0 such that:

$\sqrt{p}$ = $\frac{m}{n}$

p = $\frac{m^2}{n^2}$

$n^2 * p= m^2$