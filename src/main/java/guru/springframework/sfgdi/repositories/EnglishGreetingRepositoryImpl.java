package guru.springframework.sfgdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    /**
     * @return
     */
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
