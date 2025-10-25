# Minesweeper Game

A Java Swing implementation of the classic Minesweeper game

## Features
- 16x9 grid
- Timer
- Flag mode
- Smiley reset button
- Color-coded numbers for mine neighbors

## How to Run
```bash
javac Main.java GUI.java
java Main
```

## How to Play
- Click tiles to reveal them
- Click the flag button to toggle flag mode
- Right-click to place flags on suspected mines
- Click the smiley face to restart
- Avoid clicking on mines!
- Win by revealing all non-mine tiles

## Some Issues
- Cannot click on the tiles too fast - clicks need to be slow to proccess
- Can still click on tiles after game is over when you lose
- Created in high school
- Forgot most of java