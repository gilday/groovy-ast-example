# Groovy AST Test

An example project to get Groovy local AST Transformations working in Maven

*Lessons Learned*

1. AST Transformation annotations + classes must be compiled before compiling classes which use the annotations
2. Able to unit test + debug AST transformations using helpers provided by Groovy
3. Groovy Console + debugger is useful for figuring out how to generate AST code

