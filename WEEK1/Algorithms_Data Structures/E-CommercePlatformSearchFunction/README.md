# 🛒 E-commerce Product Search Optimization

This Exercise implements and analyzes search algorithms (Linear Search and Binary Search) to optimize search functionality in an e-commerce platform.

---

## 📘 1. Understanding Asymptotic Notation

### 📌 What is Big O Notation?

Big O notation expresses how the runtime of an algorithm scales with input size. It helps compare algorithms independent of hardware or programming language.

| Notation | Description               | Example Use Case               |
|----------|---------------------------|--------------------------------|
| O(1)     | Constant time             | Accessing array element        |
| O(log n) | Logarithmic time          | Binary search                  |
| O(n)     | Linear time               | Linear search                  |
| O(n log n) | Log-linear time         | Merge sort                     |
| O(n²)    | Quadratic time            | Nested loops on array          |

### 🔍 Best, Average, and Worst Cases in Search

Each search algorithm may behave differently depending on the scenario:

#### Linear Search
- **Best Case**: O(1) → Target is the first element.
- **Average Case**: O(n/2) → Simplified to O(n).
- **Worst Case**: O(n) → Target is the last or not present.

#### Binary Search (Requires sorted array)
- **Best Case**: O(1) → Target is the middle element.
- **Average/Worst Case**: O(log n)

---

## ⚙️ 2. Setup

A `Product` class models the searchable data:

```java
public class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}
```

## 3. Analysis
### 🧠 Time Complexity
 Algorithm     | Best Case | Average Case | worst Case |
|---------------|-----------|--------------|-----------|
| Linear Search | O(1)      | O(N)         | O(N)|
| Binary Search | O(1)      | O(logN)      | O(logN)|


--> Binary Search is highly suitable for large e-commerce datasets where search speed is critical.

--> Linear Search can be used in scenarios like:

    When data is unsorted

    For short-lived data (like carts or recently viewed)