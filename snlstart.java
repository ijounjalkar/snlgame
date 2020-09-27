public class Snakeladder{
public static final int start_value = 0;  
public static final int max_value = 100;


public static void main(String[] args){
//constants
int start_value = 0;
int ladder[] = {20,40,60,80};
int snake[] = {35,55,75,95};
//variables
int move = 0;
int dice_frequency = 0;

while(move != 100){
dice_frequency++;
int dice_check = (int)Math.floor(Math.random()*10)%6 + 1;
move += dice_check;

for(int i=0;i<ladder.length;i++){
if (move == ladder[0]) {
move += 40;
break;
}
else if (move == ladder[1]) {
move += 30;
break;
}
else if (move == ladder[2]) {
move += 25;
break;
}
else if (move == ladder[3]) {
move += 10;
break;
}
else{
break;
}

}
for(int i=0;i<snake.length;i++){
if (move == snake[0]) {
move -= 10;
break;
}
else if (move == snake[1]) {
move -= 20;
break;
}
else if (move == snake[2]) {
move -= 45;
break;
}
else if (move == snake[3]) {
move -= 65;
break;
}
else{
break;
}
}
if(move>100){
move -= dice_check;

}
System.out.println("The position of dice is " + move);
}

System.out.println("Player wins the game and the dice frequency is " + dice_frequency);



}
}

