# Jasper Reports Compiler

A simple utility for compiling JRXML templates into Jasper report files.

## Project Structure

```
├── input/    # Place your .jrxml files here
├── lib/      # JasperReports dependencies
├── output/   # Compiled .jasper files output
└── src/      # Source code (JasperCompiler.java)
```

## How to Use

1. **Place** your `.jrxml` files in the `input/` folder
2. **Compile** the Java program:
   ```
   javac -cp "lib/*" src/JasperCompiler.java -d output/
   ```
3. **Run** the compiler:
   ```
   java -cp "output;lib/*" JasperCompiler
   ```
4. **Find** your compiled `.jasper` files in the `output/` folder

## Customizing

### Change Input/Output Folders
Edit `src/JasperCompiler.java` to modify the input and output directory paths.

### Change JasperReports Version
Replace the JasperReports JAR files in the `lib/` directory with your preferred version.

## Example

The project includes an example JRXML file (`LocVsEntryVsYearXls.jrxml`). After running the compiler, the generated Jasper file (`LocVsEntryVsYearXls.jasper`) will be in the output directory.