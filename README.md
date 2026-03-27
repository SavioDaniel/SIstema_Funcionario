# 💼 Sistema de Funcionários em Java

Este projeto é uma implementação simples de um sistema de funcionários utilizando **Programação Orientada a Objetos (POO)** em Java.

O objetivo é praticar conceitos fundamentais como herança, encapsulamento, sobrescrita de métodos e uso do modificador `final`.

---

## 🚀 Funcionalidades

- Cadastro de funcionários
- Cálculo de bônus
- Herança entre classes
- Sobrescrita de métodos (`@Override`)
- Uso do modificador `final` para imutabilidade de ID

---

## 🧠 Conceitos de POO aplicados

- ✔ Encapsulamento  
- ✔ Herança  
- ✔ Polimorfismo  
- ✔ Sobrescrita de métodos  
- ✔ Uso de `super`  
- ✔ Modificador `final`

---

## 📂 Estrutura do Projeto
dominio/
├── Funcionario.java
├── Gerente.java
Main.java

---

## 🧩 Classes

### 🔹 Funcionario
- Atributos:
  - `nome`
  - `salario`
  - `ID (final)`
- Métodos:
  - `calcularBonus()` → 10% do salário
  - `imprime()`

---

### 🔹 Gerente (herda de Funcionario)
- Sobrescreve:
  - `calcularBonus()` → 20% do salário
  - `imprime()` (adiciona o bônus na saída)

---
## Exemplo

=== FUNCIONARIO ===
Savio
2000.0
1
Bonus: 200.0
----------------------
=== GERENTE ===
Carlos
5000.0
2
Bonus: 1000.0
