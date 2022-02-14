public int factorial(int n) {
  if (n < 2){
    return 1;
  }
  return (factorial(n-1))*n;
}

public int bunnyEars(int bunnies) {
  if (bunnies < 1){
    return 0;
  }
  return 2+bunnyEars(bunnies-1);
}

public int fibonacci(int n) {
  if (n<1){
    return 0;
  }
  if (n<2){
    return 1;
  }
  else{
    return fibonacci(n-1) + fibonacci(n-2);
  }
}

public int bunnyEars2(int bunnies) {
  if (bunnies<1){
    return 0;
  }
  if (bunnies%2>0){
    return bunnyEars2(bunnies-1) + 2;
  }
  else{
    return bunnyEars2(bunnies-1) + 3;
  }
  
}

public int triangle(int rows) {
  if (rows < 1){
    return 0;
  }
  return triangle(rows-1) + (rows);
}


public int sumDigits(int n) {
  if (n < 10){
    return n;
  }
  else{
    return sumDigits(n / 10) + sumDigits(n % 10);
  }
}




public int count7(int n) {
  if (n < 10) {
    if (n == 7){
      return 1; 
        }else {
          return 0;
        }
        
  }
  return (count7(n / 10) ) + count7(n % 10) ; 
}
