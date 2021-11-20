public class ripoux extends member implements mobile{
    public ripoux (String name)
    {
        this.name = name;
        this.age = 46;
        this.grade = "informateur";
        this.evil = 16;
    }

    public void deplace();


    public String parler()    {
        return "Policier: Tant que c'est pour de l'argent de suis partant";
    }

    public String to_fight()
    {
        return "Policier: Vous le tuez et je gères la paperasse ";
    }
    
    public String frauder() 
    {
        return "Policier: j'en veux toujours plus, cette fois c'est deux fois le montant habituel";
    }
}
