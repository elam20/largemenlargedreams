private int[][]board;
public QueenBoard( int size ) {_board = new int[size][size]; }

/*
0 . Read for understanding.
1 . Summarize what each method does.
2 . List pre-/post conditions for each.
3 . Generate a more descriptive name for each.
4 . When entire team is confident in responses, send liason to lisadesk.
*/

private boolean foo(int row, int col)
{
 if (_board[row][col] != 0){
   return false;
  }
 _board[row][col] = 1;
 int offset = 1;
 while(col+offset < _board[row].length){
   _board[row][col+offset]--;
   if(row - offset >= 0){
     _board[row-offset][col+offset]--;
    }
   if (row + offset < _board. length){
     _board[row+offset][col+offset]--;
   }
   offset++;
  }
return true
}
/*
0. foo will mark the number at the given row and column as 1, which represents that a queen is on the space.
It traverses the array list from left to right and top to bottom. It will subtract one from the indexes to the right and below any ones.
A negative number represents a space that can be attacked by a queen. A zero represents a space that has either not been interacted with or cannot be attacked by a queen.
*/


private boolean whutItDo0(int row, int col)
{
 if (_board[row][col] != 1 ) {
   return false;
  }
 _board[row][col]=0:
 int offset = 1;
 while( col+offset < _board[row].length ) {
   _board[row][col+offset]++;
   if row - offset >= 0 ) {
     _board[row-offset][col+offset]++;
   }
   if( row + offset < _board.length ) {
     _board[row+offset][col+offset]++:
   }
   offset++;
  }
 return true;
}
/*
0. whutItDo0 will mark the number at the given row and column as 0, which represents that a queen is on the space.
It traverses the array list from left to right and top to bottom. It will add one from the indexes to the right and below any ones.
A positive number represents a space that can be attacked by a queen.
*/
