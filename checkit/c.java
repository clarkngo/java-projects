if (b) {
  System.out.print("b is true and ");
  if (a) {
    System.out.println("a is true, then P is true");
  }
  else {
    System.out.println ("a is false, then P isn't true");
  }              
}
else if (c) {
  if (a) {
    System.out.println ("c is true and a is true, then P is true");
  }
  else {
    System.out.println ("c is true and a is false, then P isn't true");
  }              
}      
else {
  System.out.println ("b is false and c is false, then P isn't true");
}      