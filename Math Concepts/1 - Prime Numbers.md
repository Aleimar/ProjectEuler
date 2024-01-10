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

For every integer *a*, here is the factorization of integer *a* into its prime constituents:

$a = p_1^{n_1} * p_2^{n_2} * p_3^{n_3} ... p_n^{n_j}$

Then when we square the prime factorization of integer *a*, we would get:

$a^2 = (p_1^{n_1} * p_2^{n_2} * p_3^{n_3} ... p_n^{n_j})^2$
$a^2 = p_1^{2n_1} * p_2^{2n_2} * p_3^{2n_3} ... p_n^{2n_j}$

<ins>**Always remember:**</ins> Squaring the prime factors of an integer *a* makes **all the exponents even** because multiplying any number by 2 results in an even number.

<br>
<br>

Now, let's get back to proving that <ins>**the square root of any prime number is irrational.**</ins>

## Proof by contradiction

Let's assume that for any prime number *p*, <ins>the $\sqrt{p}$  is rational.</ins> 

Then, there are natural numbers *m* and *n* where n $\neq$ 0 such that:

$\sqrt{p}$ = $\frac{m}{n}$

p = $\frac{m^2}{n^2}$

$n^2 * p= m^2$   or  $m^2 = p * n^2$

Now let's investigate the following cases:

1. <ins>If prime **p** is a unique prime factorization of $n^2$ then:</ins>

$n^2 = p * p^{2k} * ...$
$n^2 = p^{2k+1} * ...$

The 2k+1 power always yield an odd number power which contradicts our initial assumption.

<br>
<br>

2. <ins>If prime **p** is not included in the unique prime factors of $n^2$ then:</ins>

$n^2 = p * q^{2k} ...$

The prime *p* will always have a power by 1 which is an odd number, thus contradicting our initial assumption.

<br>
<br>
In both cases, we have contradictions because  $m^2$ will always have prime factors with even exponents.

<br>
In conclusion, we reject our initial assumption that, for  any prime number *p*, <ins>the $\sqrt{p}$  is rational</ins> and proved by contradiction that <ins>$\sqrt{p}$ is irrational.</ins>
