package game.millionaire;

public class millionaireTesting
{
    public static void main(String[] args) {
        QuestionRepository qs= new QuestionRepository();
        for(Question ignored : qs.getQuestions())
        {
            System.out.println(qs.getRandomQuestion().toString());
        }
        System.out.println(qs.getQuestions().size());
        System.out.println(qs.getQuestionIndex("Who made an Ideal Run of the 2nd Run of Treasure World: Dream Edition?"));

        for(int i = 0; i < 100; i++)
        {
            System.out.println(qs.getQuestionIndex(qs.getQuestions().get(qs.getRandom().nextInt(qs.getQuestions().size())).getQuestion()));
        }
    }
}
