public class Ravenclaw  extends Hogwarts{
    private int smart;
    private int wit;
    private int wisdom;
    private int fullnessOfCreativity;


    public Ravenclaw(String name, int powerOfMagic, int transgression, int smart, int wit, int wisdom, int fullnessOfCreativity) {
        super(name, powerOfMagic, transgression);
        this.smart = smart;
        this.wit = wit;
        this.wisdom = wisdom;
        this.fullnessOfCreativity = fullnessOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getFullnessOfCreativity() {
        return fullnessOfCreativity;
    }

    public void setFullnessOfCreativity(int fullnessOfCreativity) {
        this.fullnessOfCreativity = fullnessOfCreativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                " smart " + smart +
                ", wit " + wit +
                ", wisdom " + wisdom +
                ", fullness Of Creativity " + fullnessOfCreativity +
                ' ';
    }
}
