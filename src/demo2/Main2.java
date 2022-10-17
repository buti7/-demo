package demo2;


public class Main2 {
    public static void main(String[] args) {
        input input = new input();
        input.input("\"./txts/input.txt\"");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("\"./txts/output.txt\"");

    }
}
