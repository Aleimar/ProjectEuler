# [INCOMPLETE] 
# Pythagorean Triplet

The pythagorean triplet consists of three positive integers *a*, *b*, *c* such that *$a^2 + b^2 = c^2$*  and *a < b < c.* 

Commonly written as (a,b,c) with well-known example (3,4,5).


# Euclid's Formula
Euclid's Formula for Pythagorean triplet states that:

*a, b, c* is a Pythagorean triplet **if and only if:**

$a = 2mn$;
$b = m^2 - n^2$;
$c = m^2 + n^2$

for some integers *m* and *n* where *m>n>0.*

## Proof of Euclid's Formula

Given
$a^2 + b^2 = c^2$ <br> then we can have
$c^2 -a^2 = b^2$. <br> Which is a difference of two squares thus 
$(c+a)(c-a) = b^2$. <br>

We would then express this to:<br>
$\frac{c+a}{b} = \frac{b}{c-a}$ <br><br>
We can set $\frac{c+a}{b}$ as $\frac{m}{n}$ as simplified values, <br>
now we can set: <br> $\frac{m}{n} = \frac{c+a}{b} = \frac{b}{c-a} $
<br> which means: <br>
$\frac{n}{m} = \frac{c-a}{b} $ <br>
 from the reciprocal of the above equation: <br> $\frac{n}{m} = \frac{b}{c+a} = \frac{c-a}{b} $

Then solving for $\frac{c}{b}$ and $\frac{a}{b}$: <br><br>
$\frac{c}{b} + \frac{a}{b} = \frac{m}{n}$ and $\frac{c}{b} - \frac{a}{b} = \frac{n}{m}$
