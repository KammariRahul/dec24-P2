package com.rahul;

public class Sample {

		public static void main(String[] args) {
		int[][] data = new int[2][3];// 6
		
		data[0][0]=7;
		data[0][1]=8;
		data[0][2]=9;
		
		data[1][0]=10;
		data[1][1]=11;
		data[1][2]=12;
		
		for(int r=0;r<2;r++) {
			for(int c=0;c<3;c++) {
				System.out.print(data[r][c]+" "); 
			}
			System.out.println();
		}
		}

	}

