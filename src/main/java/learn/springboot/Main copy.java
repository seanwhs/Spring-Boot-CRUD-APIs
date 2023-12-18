// package learn.springboot;

// import java.util.List;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;

// //This following has been re[laced by 
// // record GreetResponse(String param){}
// // class GreetResponse{
// //     private String param;
// //     public GreetResponse(String param){
// //         this.param = param;
// //     }

// //     public String getParam(){ //serves 'http response'
// //         return param;
// //     }
// // }

// @SpringBootApplication
// @RestController
// public class Main {
//     public static void main(String[] args) {
//         SpringApplication.run(Main.class, args);
//     }

//     @GetMapping("/greet")
//     public GreetResponse greet(){
//         GreetResponse response= new GreetResponse(
//             "Hello",
//             List.of("Java", "Typescript", "Python"),
//             new Person("Sean", 55, 15_000.75)
//             ); 
//         return response;
//     }

//     @GetMapping("/")
//     public String home() {
//         return "Welcome to the Home of the Brave"; 
//     }

//     public record Person(String name, int age, double savings){}
//     public record GreetResponse(
//         String param,
//         List<String> favouriteProgrammingLanguages,
//         Person person
//         ) {
//     }
// }
