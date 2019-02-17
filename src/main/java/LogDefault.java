import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Displays a value as its default widget type on Shuffleboard.  Provides no configuration options.
 */

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface LogDefault {
    //The name of the value on Shuffleboard; defaults to field or method name.
    String name() default "NO_NAME";
}