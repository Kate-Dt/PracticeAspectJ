package main;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Team {

    @Pointcut("execution(* main.Quiz.start(..))")
    public void quiz(){}

    @Before("quiz()")
    public void chooseCaptain(){
        System.out.println("Team has chosen a captain.");
    }

    @Before("quiz()")
    public void register(){
        System.out.println("Team started registration.");
    }

    @AfterReturning("quiz()")
    public void countPoints(){
        System.out.println("Counting points.");
    }

    @AfterThrowing("quiz()")
    public void claimPrize(){
        System.out.println("Give us our prize, please.");
    }

//    @Around("quiz()")
//    public void playQuiz(ProceedingJoinPoint joinPoint) {
//        try {
//            String quizName = (String) joinPoint.getArgs()[0];
//            System.out.println("Team is choosing a captain.");
//            System.out.println("Team is starting registration to " + quizName);
//            long start = System.currentTimeMillis();
//            joinPoint.proceed();
//            long end = System.currentTimeMillis();
//            System.out.println("Game lasted for " + (end - start) + " milliseconds");
//        } catch (Throwable t) {
//            System.out.println("Give us our prize, please!");
//        }
//    }
}
