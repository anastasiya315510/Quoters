package my_spring.quotes;


import lombok.Data;
import my_spring.Benchmark;

import java.util.List;

@Data
@Benchmark
public class TerminatorQuoter implements Quoter {
    List<String> messages;
    @Override
    public void sayQuoter() {
    messages.forEach(System.out::println);
    }


}
