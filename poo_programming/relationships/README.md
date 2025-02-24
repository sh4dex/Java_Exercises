# Object Oriented Programming

## vaccination_software

Enter vaccination_software to understand Relationships with primitive/classic programming.

## Structure

![Class Diagram] (../../img/poo_programming/relationships/class_diagram.png)

Understanding the diagram:

## UML Relationships Explanation

This section describes the relationships between the entities in the system using UML (Unified Modeling Language) notation.

### Entities and Their Relationships

#### 1. **Disease**
- **Association**:
  - **0..n**: A disease can be associated with zero or more entities (e.g., people, vaccines, etc.).
  - **1**: A disease is associated with exactly one entity (e.g., a specific vaccine or person).
- **Dependency**:
  - **1..n**: A disease depends on one or more entities (e.g., a vaccine or dose).

#### 2. **Vaccine**
- **Aggregation**:
  - **0..n**: A vaccine can be part of zero or more aggregations (e.g., a vaccination program).
  - **1**: A vaccine is part of exactly one aggregation.
- **VaccinationHistory**:
  - **0..***: A vaccine can have zero or more vaccination histories (e.g., records of people who received the vaccine).

#### 3. **Dose**
- **Dependency**:
  - **1**: A dose depends on exactly one entity (e.g., a specific vaccine or person).

#### 4. **Aggregation**
- **Aggregation**:
  - **1**: An aggregation involves exactly one entity (e.g., a vaccine or disease).

#### 5. **Person**
- The relationships for **Person** are not explicitly defined in the diagram, but it is likely associated with:
  - **Diseases**: A person can have zero or more diseases.
  - **Vaccines**: A person can receive zero or more vaccines.
  - **Doses**: A person can receive one or more doses of a vaccine.

---

### Key UML Relationship Types
- **Association**: A general relationship between two classes.
- **Aggregation**: A "has-a" relationship where one class is part of another (but can exist independently).
- **Dependency**: A relationship where one class depends on another (e.g., changes in one class affect the other).
