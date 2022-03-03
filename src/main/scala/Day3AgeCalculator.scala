import java.time.Year
import scala.io.StdIn.readLine

object Day3AgeCalculator extends App {
  //TODO write an application that asks for person's and their age
  //Greet the person with their name
  //and calculate when they will be 100 years old and print it out
  //  val year = 2022 //this would be okay

  val year = Year.now.getValue //even better since the program would not break in 2023 :)
  val personName = readLine ("What's your name?")
  val personAge = readLine ("How old are you?")
  println (s"Nice to meet you, $personName! Great to have $personAge year old person here!")
  val howMuch = year - personAge.toInt
  val oldEnough = howMuch + 100
  println(s"$personName, at $oldEnough you will be 100 years old!")
}
