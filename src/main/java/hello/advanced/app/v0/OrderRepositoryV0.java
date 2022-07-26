package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor //컴포넌트 스캔의 대상이 된다.
public class OrderRepositoryV0 {

    public void save(String itemId){
        //저장 로직
        if(itemId.equals("ex")){
            throw  new IllegalStateException("예외 발생");
        }

        sleep(1000);

    }

    private void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
