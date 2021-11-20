public class tolard extends member {
    public tolard (String name)
    {
        this.name = name;
        this.age = 29;
        this.grade = "Homme de MAIN";
        this.evil = 26;
    }




    public String parler()    {
        return "Tolard: Baisse les yeux quand je te parles";
    }

    public String to_fight()
    {
        return "Tolard: Si tu te defends tu mouras attrocement ";
    }
    
    public String frauder() 
    {
        return "Tolard: Haut les mains CECI EST UN HOLD UP";
    }
}
