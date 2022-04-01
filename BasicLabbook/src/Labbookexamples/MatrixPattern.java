package Labbookexamples;
import java.io.*;
import java.util.*;

public class MatrixPattern  {
public static void main(String[] args)  {
	int mat[][]={ { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            {13,14,15,16}};
	
	print2D(mat);
}

public static void print2D(int[][] mat) {
	for(int[] row:mat) {
		System.out.println(Arrays.toString(row));
	}
}


}
