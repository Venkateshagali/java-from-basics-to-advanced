# Complete Java Learning Package (Beginner to Advanced)

This repository is organized topic-wise as a full Java learning path suitable for students, interview prep, and revision.

## Folder Structure
- `01_basics`
- `02_control_flow`
- `03_arrays_strings`
- `04_methods_recursion`
- `05_oop`
- `06_inheritance_polymorphism`
- `07_abstraction_interfaces`
- `08_exceptions`
- `09_collections_generics`
- `10_file_io_serialization`
- `11_multithreading`
- `12_java8_streams_lambda`
- `13_jdbc`
- `14_patterns_numbers`
- `15_dsa_algorithms`
- `16_data_structures`
- `17_advanced_java`
- `18_design_patterns`
- `19_problem_solving`

## Important Docs
- `SYLLABUS_MAPPING.md` : maps your syllabus topics to exact files
- `LEARNING_PATH.md` : step-by-step study path

## Compile and Run
From root folder:

```powershell
javac ._basics\HelloWorld.java
java -cp ._basics HelloWorld
```

Compile all files:

```powershell
Get-ChildItem -Recurse -Filter *.java | ForEach-Object { javac $_.FullName }
```

## Notes
- Code is written to run with older Java compiler compatibility (`javac 1.6` in your current setup).
- Each file has a `main` method and can run independently.
