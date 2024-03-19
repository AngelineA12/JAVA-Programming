public class mainwthread{
public static void main(String args[]){
SampleThread threadObject = new SampleThread();
Thread thread = new Thread(threadObject);
System.out.println("Thread about to start");
long startTime = System.nanoTime();
long stopTime = System.nanoTime();
long elapsedTime = stopTime - startTime;
System.out.println("Elapsed time for the task: "+elapsedTime+" nanoseconds");
}
}
class SampleThread implements Runnable{
public void run(){
System.out.println("Thread is under running...");
for(int i = 1; i <= 10000000; i++){
System.out.println("i = " + i);
}
}
}