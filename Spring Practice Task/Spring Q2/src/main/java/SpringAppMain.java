import org.example.config.AppConfig;
import org.example.service.BookingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAppMain {

    public static void main(String[] args) {
        // Initialize the context with the configuration class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the BookingService bean and display booking details
        BookingService bookingService = context.getBean(BookingService.class);
        bookingService.displayBookingDetails();

        // Close the context
        context.close();
    }
}
