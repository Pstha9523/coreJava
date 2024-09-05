package conditionalPractice;

public class VoteCheck {
    private int age;
    public VoteCheck(int age){
        this.age = age;

    }

    public boolean canVote(){
        return age > 18;
    }

    public static void main(String[] args) {
        VoteCheck voteCheck = new VoteCheck(25);
        System.out.println(voteCheck.canVote());
    }
}
