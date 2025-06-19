# 📈 Exercise 7: Financial Forecasting

This project demonstrates how recursion can be used to build a simple financial forecasting tool that predicts future values based on historical growth rates. The implementation includes a basic recursive algorithm and discusses ways to optimize it.

---

## 🧠 1. Understanding Recursive Algorithms

### 🔁 What is Recursion?

**Recursion** is a problem-solving technique where a function calls itself to break a problem into smaller sub-problems until it reaches a base case. It's especially useful when a problem can be defined in terms of similar sub-problems.

### 📌 Example:
Calculating compound interest or predicting financial values that follow a repetitive growth pattern is a natural fit for recursion.

---

## ⚙️ 2. Setup

We define a recursive function to calculate the projected value of an investment or revenue over `n` years, given:
- `initialValue` (base value)
- `growthRate` (percentage growth per year)
- `years` (time horizon)

---

## 💻 3. Implementation

### 🔢 Recursive Forecast Formula:

The future value can be recursively defined as:

```public static double predictValue(double initialValue, double growthRate, int years) {
if (years == 0) return initialValue;
return predictValue(initialValue, growthRate, years - 1) * (1 + growthRate);
}
```
## 📊 4. Analysis
⏱️ Time Complexity
- Recursive Time Complexity: O(n), where n is the number of years.

The function performs one recursive call per year until it hits the base case.

## ⚠️ Limitations
- For large values of years, deep recursion can lead to stack overflow.

- Each call is dependent on the previous one and adds overhead.

