package repeatableAnnotation;

import java.lang.annotation.Repeatable;

@Repeatable(Schedules.class)
/*注解类型*/
public @interface Schedule {
    String dayOfMonth() default "first";

    String dayOfWeek() default "Monday";

    int hour() default 12;
}
