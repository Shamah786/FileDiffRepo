public class GetTotalMemory {
 
        public static void main(String args[])
        {
                /*
                 * get current Java Runtime using getRuntime()
                 * method of Runtime class.
                 */
                Runtime runtime = Runtime.getRuntime();
               
                /*
                 * To determine amount of total memory available to current
                 * Java Virtual Machine(JVM), use
                 *
                 * long totalMemory()
                 * method of Runtime class.
                 */
                 
                 long totalMemory = runtime.totalMemory();
                 
                 System.out.println(totalMemory + " bytes total in JVM");
        }
       
       
}