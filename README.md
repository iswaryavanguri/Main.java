# CP-Code-Template

A clean and reusable Java template for Competitive Programming featuring essential utilities for bit manipulation and modular arithmetic.

---

# Bit Utilities

A collection of commonly used bitwise operations.

Method | Description | Syntax |
|:-------|:------------|:-------|
| `getbit(a, b)` | Returns the **b-th** bit of `a`. | `(a >> b) & 1` |
| `setbit(a, b)` | Sets the **b-th** bit to `1`. | `a \| (1L << b)` |
| `clearbit(a, b)` | Clears the **b-th** bit (sets it to `0`). | `a & ~(1L << b)` |
| `togglebit(a, b)` | Toggles the **b-th** bit. | `a ^ (1L << b)` |

---

# Modular Arithmetic

Utility methods for performing arithmetic operations under a given modulo.

Method | Description | Formula |
|:-------|:------------|:--------|
| `add(a, b, mod)` | Modular addition | `(a % mod + b % mod) % mod` |
| `sub(a, b, mod)` | Modular subtraction | `(a % mod - b % mod + mod) % mod` |
| `mul(a, b, mod)` | Modular multiplication | `((a % mod) * (b % mod)) % mod` |


---

 # Purpose

This template can be used as a starting point for:

- Competitive programming contests
- Data Structures and Algorithms practice
- Online coding platforms
- Reusable Java problem-solving templates

---
# Language
- Java
---
# Repository Contents
| File | Description |
|:-----|:------------|
| `Main.java` | Java Competitive Programming template |
| `README.md` | Documentation for the template |
