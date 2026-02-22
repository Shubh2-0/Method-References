<div align="center">

# 📎 Method References

[![GitHub stars](https://img.shields.io/github/stars/Shubh2-0/Method-References?style=for-the-badge&logo=github&color=yellow)](https://github.com/Shubh2-0/Method-References/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Shubh2-0/Method-References?style=for-the-badge&logo=github&color=blue)](https://github.com/Shubh2-0/Method-References/network/members)

### Simplified Lambda Expressions

*Cleaner syntax for functional programming*

</div>

---

## 🎯 About

**Method References** are shorthand for lambda expressions that call a single method. They make code more readable and concise.

## 📚 Types of Method References

| Type | Syntax | Example |
|------|--------|---------|
| Static Method | Class::staticMethod | Math::max |
| Instance Method | object::method | str::length |
| Arbitrary Object | Class::instanceMethod | String::toUpperCase |
| Constructor | Class::new | ArrayList::new |

## 💻 Examples

```java
// Lambda vs Method Reference
list.forEach(s -> System.out.println(s));  // Lambda
list.forEach(System.out::println);         // Method Reference

// More examples
list.stream().map(String::toUpperCase);    // Instance method
list.stream().sorted(Integer::compare);    // Static method
list.stream().collect(ArrayList::new);     // Constructor
```

## 🛠️ Technologies

Java 8+ | Lambda | Stream API

## 📬 Contact

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shubham-bhati-787319213/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:shubhambhati226@gmail.com)

---

**Keywords:** Java Method-Reference Lambda Functional-Programming Stream-API Java8







