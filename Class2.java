abstract class Player{
    abstract void action();
    String name = "らぐにゃ";
    String skillA = "攻撃";
    String skillB = "魔法";
    String skillC = "道具";
}

class Attack extends Player{
    @Override
    void action(){
        System.out.println(skillA+'!'+name+"は普通に攻撃した！");
    }
}

class Magic extends Player{
    @Override
    void action(){
        System.out.println(skillB+'!'+name+"は魔法を発動した！");
    }
}

class Tool extends Player{
    @Override
    void action(){
        System.out.println(skillC+'!'+name+"は何か探し始めた！");
    }
}

class Class2 {
    static void act(Player player){
        player.action();
    }
    public static void main(String[] args){
        act(new Attack());
        act(new Magic());
        act(new Tool());
    }
}
