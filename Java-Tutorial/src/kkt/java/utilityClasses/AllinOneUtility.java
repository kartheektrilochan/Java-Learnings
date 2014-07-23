package kkt.java.utilityClasses;

public class AllinOneUtility {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			AllinOneUtility util=new AllinOneUtility();
			
		}
		public long timeTakenforExecute(long stopTime,long startTime){
			System.out.println("StartTime:"+startTime+" and StopTime:"+stopTime);
			return stopTime-startTime;
	}

}
