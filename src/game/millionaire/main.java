package game.millionaire;

public class main
{
    public static void main(String[] args) {
        QuestionRepository qs= new QuestionRepository();
        for(Question q: qs.getQuestions())
        {
            System.out.println(qs.getRandomQuestion().toString());
            //System.out.println(q.toString());
        }
        System.out.println(qs.getQuestions().size());
    }
}
