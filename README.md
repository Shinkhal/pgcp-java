# PGCPAI — Java Programming Practice

A collection of small Java programs written while learning the language, organised day by day
(`DAY1` → `DAY5`). Each file is standalone and contains its own `main` method.

## Requirements

- **JDK 25** (the project is configured for `jbr-25`, the JDK bundled with IntelliJ IDEA)
- **IntelliJ IDEA** (recommended) — or any editor + a JDK on your `PATH`

Check your install:

```bash
javac -version
java -version
```

## Project structure

```
PGCPAI/
├── PGCPAI.iml          # IntelliJ module (source root = src/)
├── .idea/              # IDE config (Project SDK, modules, VCS)
├── out/                # compiled classes (git-ignored)
└── src/
    ├── DAY1/           # 10 files — operators, conditionals, formulas
    ├── DAY2/           #  6 files — static helper methods (functions)
    ├── DAY3/           #  6 files — arrays
    ├── DAY4/           #  5 files — classes and objects
    └── DAY5/           #  1 file  — inheritance
```

28 programs in total. Every file declares a `package` matching its folder and defines
`public static void main(String[] args)`.

## What's covered

| Day | Topic | Files |
|-----|-------|-------|
| **DAY1** | Arithmetic operators, `if/else`, `Scanner` input, basic formulas | `Arithmetic`, `SimpleInterest`, `TempConversion`, `AreaCircle`, `EvenOdd`, `Largest`, `PositiveNegative`, `MarksTotal`, `StudentResult`, `VoteEligibility` |
| **DAY2** | `static` helper methods — logic split out of `main` and reused | `Largest`, `StudentGrade`, `EmployeeSalary`, `ProductDiscount`, `Electricity`, `BusTicket` |
| **DAY3** | Arrays — traversing, searching, sorting, reversing | `SumAndAverage`, `LargestSmallest`, `EvenOdd`, `SearchElement`, `ReverseArray`, `FindDuplicate` |
| **DAY4** | OOP — classes, objects, instance fields/methods, constructors, `this` | `EmployeeSalary`, `ProductBilling`, `ElectricityBill`, `MovieTicket`, `BankAccountManagement` |
| **DAY5** | Inheritance — `extends`, `super(...)`, method extension | `EmployeeManager` (`Employee` → `Manager`) |

## Running the code

### In IntelliJ IDEA

1. Open the project folder (`File → Open`).
2. Confirm the SDK: `File → Project Structure → Project` → SDK should be **`jbr-25`**.
3. Open any file and click the green arrow next to `main` to run it.

### From the command line

```bash
# compile everything
javac -encoding UTF-8 -d out $(find src -name '*.java')

# run a program (note the package prefix)
java -cp out DAY1.SimpleInterest
java -cp out DAY3.ReverseArray
java -cp out DAY5.EmployeeManager
```

### Sample input

Most programs read from `stdin` via `Scanner`, so they wait for typed input. For example:

```bash
$ java -cp out DAY1.SimpleInterest
10000      # principal
5          # rate
3          # time
```

Three programs use hardcoded values and need no input:
`DAY1/Arithmetic.java`, `DAY1/TempConversion.java`, `DAY5/EmployeeManager.java`.

## Troubleshooting

**"Cannot run program / No SDK configured" or Build fails immediately**

`.idea/misc.xml` holds the Project SDK setting (`project-jdk-name="jbr-25"`). If it is missing,
IntelliJ loses the SDK and nothing will compile. Restore it from git and reload:

```bash
git restore --staged --worktree .idea/
```

Then `File → Reload All from Disk` (or restart IDEA).

**`java: command not found` in the terminal**

IntelliJ's bundled JDK is not automatically added to your shell `PATH`. Either add it:

```bash
export JAVA_HOME=/app/jbr
export PATH="$JAVA_HOME/bin:$PATH"
```

…or use the full path (`/app/jbr/bin/javac`) as shown above.

## Known issue

Five files in `src/DAY2/` declare the wrong package:

```
src/DAY2/Electricity.java      → package com.java;   (should be: package DAY2;)
src/DAY2/EmployeeSalary.java   → package com.java;
src/DAY2/Largest.java          → package com.java;
src/DAY2/ProductDiscount.java  → package com.java;
src/DAY2/StudentGrade.java     → package com.java;
```

`src/DAY2/BusTicket.java` correctly uses `package DAY2;`. Because of the mismatch, the five
affected files compile into `out/com/java/` instead of `out/DAY2/`, so they must be run as:

```bash
java -cp out com.java.Electricity
```

To fix it permanently, change the five declarations to `package DAY2;` and run them as
`java -cp out DAY2.Electricity`.
