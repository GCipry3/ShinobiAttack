package PAOO_GAME.Player;

public abstract class Enemy extends Player{
    public abstract void move(int x1,int x2,Player player);
    public abstract void atack(Player player);
}
