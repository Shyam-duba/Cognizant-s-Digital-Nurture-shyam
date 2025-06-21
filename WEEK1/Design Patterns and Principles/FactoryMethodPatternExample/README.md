# FactoryMethodPatternExample

## Overview
This Java project demonstrates the **Factory Method Design Pattern** by creating different types of documents (Word, PDF, Excel) in a document management system. The Factory Method pattern allows for the creation of objects without specifying their exact class, promoting flexibility and scalability.

---

## Project Structure


FactoryMethodPatternExample/
├── Document.java
├── WordDocument.java
├── PdfDocument.java
├── ExcelDocument.java
├── DocumentFactory.java
├── WordDocumentFactory.java
├── PdfDocumentFactory.java
├── ExcelDocumentFactory.java
├── FactoryTest.java
└── README.md

yaml
Copy
Edit

---

## Design Pattern Used

### Factory Method Pattern
- Defines an interface for creating an object, but lets subclasses decide which class to instantiate.
- Helps in creating objects without exposing the instantiation logic to the client.
## Implementation Details

### 1. Document Interface

```java
public interface Document {
    void open();
}
2. Concrete Document Classes

public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening a Word document.");
    }
}

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}
3. Abstract Factory Class

public abstract class DocumentFactory {
    public abstract Document createDocument();
}
4. Concrete Factory Classes

public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
Test Class

public class Test {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
Expected Output:

Opening a Word document.
Opening a PDF document.
Opening an Excel document.
---


## similarly i also added the close document feature for the project as well
