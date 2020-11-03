package my_spring.quotes;

import lombok.Data;
import my_spring.Benchmark;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Data
public class TalkingRobotImpl implements TalkingRobot{

    private List<Quoter> quoter;

    @Override
    @PostConstruct
    public void talk() {
        quoter.forEach(Quoter::sayQuoter);
    }


}
