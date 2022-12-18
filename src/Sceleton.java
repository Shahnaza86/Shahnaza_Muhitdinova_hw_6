public class Sceleton extends  Boss {
private int Arrows ;

    public int getArrows() {
        return Arrows;
    }

    public void setArrows(int arrows) {
        Arrows = arrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " Arrows: " + Arrows ;
    }
}
