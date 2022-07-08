package game.millionaire;

public class Question
{
    String question;
    String[] answers;
    int indexCorrect;

    public Question(String question, String ans1, String ans2, String ans3, String ans4, int indexCorrect)
    {
        this.question = question;
        answers = new String[4];
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
        if(indexCorrect < 0 || indexCorrect > 3)
        {
            throw new RuntimeException("Index must be between 0 and 3");
        }
        this.indexCorrect = indexCorrect;
    }

    public String getQuestion()
    {
        return question;
    }

    public int getIndexCorrect()
    {
        return indexCorrect;
    }

    public String getAnswer(int i)
    {
        return answers[i];
    }

    public String toString()
    {
        StringBuilder s = new StringBuilder(getQuestion() + "\n");
        for(int i = 0; i < 4; i++)
        {
            s.append(getAnswer(i)).append("\n");
        }
        s.append("Correct Answer: ").append(getAnswer(getIndexCorrect())).append("\n");
        s.append("-------------------------------------------------------\n");
        return s.toString();
    }
}
