package my_spring.quotes;


import lombok.Data;
import my_spring.Benchmark;
import my_spring.InjectRandomInt;


@Data
@Benchmark
public class ShakespeareQuoter implements Quoter {
    private String message;
    @InjectRandomInt(min = 3, max = 10)
    private int repeat;

    @Override
    public void sayQuoter() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }

}
