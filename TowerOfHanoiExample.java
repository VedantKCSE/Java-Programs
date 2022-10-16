public class TowerOfHanoiExample
 {
 // A recursive method to find the solution of the puzzle, called Tower of Hanoi
 static void twrOfHanoi(int disk, char fromPole, char toPole, char auxPole)
 {
     // handling the base case
     if (disk == 1)
     {
           System.out.println("Moving disk 1 from pole " + fromPole + " to pole " + toPole);
            return;
      }
      // The first recursive call             
      // recursively moving the n - 1 disk from the source pole to the auxiliary pole
      twrOfHanoi(disk - 1, fromPole, auxPole, toPole);
       // move the nth pole from the source pole to the destination pole
       System.out.println("Moving disk " + disk + " from pole " + fromPole + " to pole " + toPole);
       // The second recursive call
       // recursively moving the n - 1 disk from the auxiliary pole to the destination pole
       twrOfHanoi(disk - 1, auxPole, toPole, fromPole);
 }
        // The driver method
        public static void main(String argvs[])
        {
                int disks = 3; // total number of disks
                char firstPole = 'A'; // first pole
                char secondPole = 'B'; // second pole
                char thirdPole = 'C'; // third pole
                // invoking the method twrOfHanoi
                twrOfHanoi( disks, firstPole, thirdPole, secondPole );
       }
 }
