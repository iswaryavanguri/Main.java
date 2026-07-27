 ##**CP-Code-Template**

A clean and reusable Java template for Competitive Programming featuring essential utilities for bit manipulation and modular arithmetic.

---

##**Bit Utilities**

A collection of commonly used bitwise operations.

Method| Description| Operation
"getbit(a, b)"| Retrieves the b-th bit| "(a >> b) & 1"
"setbit(a, b)"| Sets the b-th bit to "1"| "a | (1L << b)"
"clearbit(a, b)"| Sets the b-th bit to "0"| "a & ~(1L << b)"
"togglebit(a, b)"| Flips the b-th bit| "a ^ (1L << b)"

---

##**Modular Arithmetic**

Utility methods for performing arithmetic operations under a given modulo.

Method| Operation
"add(a, b, mod)"| "(a + b) % mod"
"sub(a, b, mod)"| "(a - b + mod) % mod"
"mul(a, b, mod)"| "(a × b) % mod"

---

 ##**Purpose**

This template can be used as a starting point for:

- Competitive programming contests
- Data Structures and Algorithms practice
- Online coding platforms
- Reusable Java problem-solving templates

---
##**Language**
Java
---
##**Repository Contents**
File Description
Main.java:
Java competitive programming template
README.md:
Documentation for the utility functions
