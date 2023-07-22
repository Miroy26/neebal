package HomeworkDay6;
import java.util.Scanner;
class CompetitionLog{
	private int playernumber;
	private String completesets;
	private String incompletesets;
	private int piecesbuilt;
	static int totalpieces;
	static int days;
	CompetitionLog(){
		
	}
	CompetitionLog(int n, String s, String is, int pb){
		this.playernumber=n;
		this.completesets=s;
		this.incompletesets=is;
		this.piecesbuilt=pb;
	}
	public int getPlayerNumber(){
		return this.playernumber;
	}
	public String getCompleteSets(){
		return this.completesets;
	}
	public String getIncompleteSets(){
		return this.incompletesets;
	}
	public int getPiecesBuilt(){
		return this.piecesbuilt;
	}
	public void setCompleteSets(String completesets) {
	this.completesets=completesets;	
	}
    public void setInompleteSets(String incompletesets) {
    	this.incompletesets=incompletesets;
	}  
    public void setPiecesBuilt(int piecesbuilt) {
    	this.piecesbuilt=piecesbuilt;
    }
    public String toString() {
    	return "Player"+getPlayerNumber()+"completed the following sets:"+getCompleteSets();
    	return "Player"+getPlayerNumber()+"did not completed the following sets:"+getIncompleteSets();
    	return "Player"+getPlayerNumber()+"built total of"+getPiecesBuilt()+"pieces";
    }
	public String printResult(CompetitionLog t) {
		// TODO Auto-generated method stub
		String s = "Congratulations to player " + this.playernumber + "for winning the Competition!"+
			"Additional information about the competition results is below"+
			"Player " + this.playernumber + " completed the following sets:" + this.completesets+
			"Player " + this.playernumber + " completed the following sets:" + this.completesets+
			"Player " + this.playernumber+" built a total of " + this.piecesbuilt +"pieces."+
			"Additional information about the competition results is below"+
			"Player " + t.playernumber + " completed the following sets:" + t.completesets+
			"Player " + t.playernumber + " completed the following sets:" + t.completesets+
			"Player " + t.playernumber+" built a total of " + t.piecesbuilt +"pieces"+
			"The competiton lasted "+ days + "days.";
		return s;

}
}

public class LegoSetCompetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("Welcome to Lego Set Competition");
		System.out.println("Enter the number of sets");
		int sets=sc.nextInt();
		System.out.println("Enter the name of Lego Set 1");
		String n1=sc.nextLine();
		System.out.println("Enter the number of pieces in Lego Set 1");
		int num1=sc.nextInt();
		System.out.println("Enter the name of Lego Set 2");
		String n2=sc.nextLine();
		System.out.println("Enter the number of pieces in Lego Set 2");
		int num2=sc.nextInt();
		System.out.println("Enter the name of Lego Set 3");
		String n3=sc.nextLine();
		System.out.println("Enter the number of pieces in Lego Set 3");
		int num3=sc.nextInt();
		int totalpieces=num1+num2+num3;
		CompetitionLog x=new CompetitionLog(1,"",n1+n2+n3,0);
		CompetitionLog y=new CompetitionLog(2,"",n1+n2+n3,0);
		while(x.getPiecesBuilt()<CompetitionLog.totalpieces && y.getPiecesBuilt()<CompetitionLog.totalpieces) {
			System.out.println("Enter the number of pieces player 1 used on day 1"+CompetitionLog.days());
			int a=sc.nextInt();			
			System.out.println("Enter the number of pieces player 2 used on day 1"+CompetitionLog.days());
			int b=sc.nextInt();
			x.setPiecesBuilt(x.getPiecesBuilt()+a);
			y.setPiecesBuilt(y.getPiecesBuilt()+b);
			if(x.getPiecesBuilt()>CompetitionLog.totalpieces && y.getPiecesBuilt()>=CompetitionLog.totalpieces){
				
				x.setPiecesBuilt(0);
				y.setPiecesBuilt(0);
				System.out.println("There is a tie so there will be a tie breaker round");
			}
			if(x.getPiecesBuilt()>=CompetitionLog.totalpieces) {
				System.out.println(y.printResult(x));
			}
			CompetitionLog.days++;
		}
		

	}

}

