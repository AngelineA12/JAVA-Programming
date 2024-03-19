public class mainwothread{
public static void main(String args[]){
long startTime = System.nanoTime();
int sum = 0;
for( int i = 0; i < 1000000; i++){
sum += i;
}
long stopTime = System.nanoTime();
long elapsedTime = stopTime - startTime;
System.out.println("Elapsed time for the task: "+ elapsedTime + " nanoseconds");
}
}