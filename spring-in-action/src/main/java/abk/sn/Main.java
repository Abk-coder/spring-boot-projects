package abk.sn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import abk.sn.springidol.Performer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "properties.xml")) {
            Performer performer = (Performer) ctx.getBean("duke");
            performer.perform();
        }
    }
}