public class Strings {
    public static void main(String[] args) {

//Uncomment slashes from only one set of string to access.
//Set 1:
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";
//Set 2:
        //String studentData = "Aleeza:95, Farhat:80, Mohsin:60, Alee:50, Muskaan:30";
//Set 3:
        //String studentData = "Lizo:92, Alizeh:80, Farwa:73, Chasheen:65, Hanniya:55";

//Split the student data into records
        String[] studentRecords = studentData.split(", ");
        int numStudents = studentRecords.length;
        
        // Create arrays to store student names and scores
        String[] studentNames = new String[numStudents];
        int[] studentScores = new int[numStudents];

        // Populate the arrays with data from the split records
        for (int i = 0; i < numStudents; i++) {
            String[] parts = studentRecords[i].split(":");
            studentNames[i] = parts[0];
            studentScores[i] = Integer.parseInt(parts[1]);
        }

        // Initialize variables for calculations
        int totalScore = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        String topScorer = "";
        String lowestScorer = "";

        // Calculate total score, highest and lowest scores
        for (int i = 0; i < numStudents; i++) {
            int score = studentScores[i];
            totalScore += score;
            
            // Check for the highest score
            if (score > highestScore) {
                highestScore = score;
                topScorer = studentNames[i];
            }
            
            // Check for the lowest score
            if (score < lowestScore) {
                lowestScore = score;
                lowestScorer = studentNames[i];
            }
        }

        // Calculate the average score
        float averageScore = (float) totalScore / numStudents;

        // Display the results
        System.out.println("Student Data Processing Results:");
        System.out.println("Total number of students: " + numStudents);
        System.out.println("Average marks of all students: " + averageScore);
        System.out.println("Student with the highest score: " + topScorer + " : " + highestScore);
        System.out.println("Student with the lowest score: " + lowestScorer + " : " + lowestScore);
    }
}
