# Group_3_Matrix_Multi
# Group 3 Members: Nathan Y., Phoebe Y., Aditya S., Ujjwal R. 

<!-- Matrix Class
Overview: The Matrix class contains a static method called multiply, which takes two Double[][] matrices as input and returns their product if they are compatible

Explination of how it works: 
Compatibility: 
- Check's whether the matrix columns matches the amount of rows through (a[0].length != b.length)
- Returns null otherwise 

Matrix Multiplication Logic: 
- Initializes a result matrix with specific dimensions based on reading from the previous matrices
- Triple nested loop is required: 
    - Outermost loop iterates over the rows 
    - Middle loop iterates over the columns 
    - Innermost loop performs the dot product calc
        - Produces products corresponding to the elements from a's row and b's column 
Return Value: 
- If multiplication successful returns matrix back 

-------------------------------------------------------------- 

Runner Class 
Overview: Entry point for testing and running the matrix multi 

Explination of how it works: 
Matrix Defining: 
- m1 is a 3 by 4
- m2 is a 4 by 5 
- Multiplying both together results in a 3 by 5 matrix 

- Values stored in m3 

- m3 is null, produces error message 
- Otherwise, prints the matrix using stringbuilder to properly format 

-->

# Why This Method? 

<!-- 
- Produces a check function that essentially esnures that the matrices can be multipled with values before proceding 
- Efficiency with a triple nested loop to create a robust algorithm that checks every row and column respectively 
- Usage of Double[] instead of double [] which allows null functions and errors to be processed 
- StringBuilder allows for a quality formatting option that produces a solid matrix -->
