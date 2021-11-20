public class etudiant extends member {
    public etudiant (String name)
    {
        this.name = name;
        this.age = 17;
        this.grade = "voyou";
        this.evil = 5;
    }




    public String parler()    {
        return "Etudiant: l'ami de mon Ennemi c'est mon Grand PAPA ";
    }

    public String to_fight()
    {
        return "Etudiant: Ramène j'ai un penchant pour la bagarre";
    }
    
}
