package assignment;

public class Assignment6_Operators {
   public static void main(String[] args) {
   String[] studentNames = {"ABC", "XYZ", "DEF"};
   int[] marks = {85, 90, 72};
   int[] updatedMarks = new int[3];
   updatedMarks[0] = marks[0] + 10;
   updatedMarks[1] = marks[1] + 10;
   updatedMarks[2] = marks[2] + 10;
   System.out.println(studentNames[0] + " : " + updatedMarks[0]);
   System.out.println(studentNames[1] + " : " + updatedMarks[1]);
   System.out.println(studentNames[2] + " : " + updatedMarks[2]);
   int averageMarks = (updatedMarks[0] + updatedMarks[1] + updatedMarks[2]) / updatedMarks.length;
   System.out.println("Average Marks: " + averageMarks);
	}

}
