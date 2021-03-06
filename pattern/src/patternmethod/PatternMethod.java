package patternmethod;

import java.util.ArrayList;
import java.util.List;

public class PatternMethod {

	public void pyramidpattern(int n) {
		
		for(int i = n-1 ; i >= 0 ; i-- ) {
			for(int j = 0 ; j < n ; j++) {
				if(j >= i) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	

	
	
	public void rightTriangle(int n) {
		for(int i = 0 ; i < n ;i ++) {
			for(int j = 0 ; j < n ; j++) {
				if(i >= j) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		
		/*
		 * public void rightTriangle(int n) { for(int i = n-1 ; i >= 0 ; i-- ) { for(int
		 * j = 0 ; j < n ; j++) { if(j >= i) { System.out.print("*"+" "); } } }
		 * System.out.println(); }
		 */
	}
	
	public void leftTriangle(int n) {
		for(int i = n-1 ; i >= 0 ; i-- ) {
			for(int j = 0 ; j < n ; j++) {
				if(j>=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				}
			System.out.println();
			}
			
		}
	
	public void diamond(int n) {
		  n = n*2 -1;
		  
		  for(int i = n-1 ; i >= 0 ;i-=2) {
			  for(int j = 0 ; j < n ; j++) {
				  if(j>=i) {
					  
		  System.out.print("* "); 
		  } else { System.out.print(" ");
		  } 
				  }
		  System.out.println(); 
		  }
		 
		for(int i = 0 ; i < n ; i+=2) {
			if(i==0) {continue;}
			for(int j = 0 ; j < n ; j++) {
				
				if(i<=j) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void rightPascal(int n) {
		
		
		  for(int i = 0 ;i < n ; i++) {
			  for(int j = 0 ; j < n ;j++) {
				  if(i>=j) {	  
		  System.out.print("* "); 
		  } 
		else { 
			System.out.print(" "); 
			} 
				  }
		  System.out.println();
		  }
		 
		  for(int i = n-2 ;i >=0 ; i--) {
			  for(int j = 0 ; j < n ;j++) {
				  if(i>=j) {	  
		  System.out.print("* "); 
		  } 
		else { 
			System.out.print(" "); 
			} 
				  }
		  System.out.println();
		  }
		  
//		for(int i = n-1 ; i >=0 ; i--) {
//			if(i == n-1) { continue; }
//			for(int j = 0 ; j < n ; j++) {
//				if(i>=j) {
//					System.out.print("* ");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
	}
	
	public void sandGlass(int n) {
		
		  for(int i = 0 ; i < n ; i++) {
			  for(int j = 0 ; j < n ; j++) {
				  if(i <= j) {
		  System.out.print("* "); 
		  }
	    else {
	    	System.out.print(" "); 
	    	} 
				  }
		  System.out.println(); }
		 
		
		for(int i = n-1 ; i >= 0 ; i--) {
			for(int j = 0 ; j < n ; j++) {
				if(i<=j) {
					System.out.print("* ");
				}else {
				    System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	

	
	
	public void triangle(int n) {
    n = n-1;
    
		for(int i = 0 ; i < n ; i++) {
			for(int j = n ; j > i ; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int k = 0 ; k <= 2*(i-1) ; k++) {
				System.out.print(" ");
			}
			
			if(i==0) {
				System.out.println();
			}
			else {
				System.out.println("*");
			}
		}
		
		n=n*2+1;
		for(int i = 0 ; i < n ; i++) {
			System.out.print("*");
		}

		 
	}


	public void diamondEmpty(int n) {
		
   for(int i = 0 ; i < n ; i++) {
	   for( int j = n ; j > i ; j--) {
		   System.out.print(" ");
	   }
	   System.out.print("*");
	   
	   for(int k = 0 ; k <= 2*(i-1) ; k++) {
		   System.out.print(" ");
	   }
	   if(i==0) {
		   System.out.println(" ");
	   }
	   else {
		   System.out.println("*");
	   }
   }
   for(int i = n-2 ; i >= 0; i--) {
	   for( int j = n ; j > i ; j--) {
		   System.out.print(" ");
	   }
	   System.out.print("*");
	   
	   for(int k = 0 ; k <= 2*(i-1) ; k++) {
		   System.out.print(" ");
	   }
	   if(i==0) {
		   System.out.println(" ");
	   }
	   else {
		   System.out.println("*");
	   }
   }
   

	
}
	
	public void numberPattern(int n) {
    for(int i = 0 ; i < n ; i++) {
    	int count = 1;
    	for(int j = 0 ; j < n ;j++) {
    		
    		if(i>=j) {
    			System.out.print(count++ +" ");
    		}else {
    			System.out.print(" ");
    		}
    	}
    	System.out.println();
    }
	}
	
    public void printPascal(int n)
    {
    for(int row = 1 ; row <= n ; row++) {
	for(int column = 0 ; column < n - row ; column++) {
		System.out.print(" ");
	}
	
	int c = 1;
	for(int i = 1 ; i <= row ; i++) {
		System.out.print(c+" ");
		c = c * (row-i)/i;
	}
	System.out.println();
}
    }
    
    public void diamondNumber(int n) {
    n+=2;
    int space = n/2;
    int number = 1;
  
    for(int i = 1 ; i <= n ; i++) {
    	for(int j = 1 ; j <= space ; j++) {
    		System.out.print(" ");
    	}
    	
    	
    	int count = number/2+1;
    	
    	for(int k = 1 ; k <= number ; k++) {
    		System.out.print(count);
    		if(k <= number/2) {
    			count--;
    		} else {
    			count++;
    		}
    	}
    	System.out.println();
    	
    	if(i <= n/2) {
    		space = space -1;
    		number = number +2;
    	} else {
    		space = space + 1;
    		number = number -2;
    	}
    	
    }
    }
   
    public void xAndO(int n) {
    int size = n;
    n = n/2 + 1;
    
    for(int i = 1 ; i <= size ; i++) {
    	for(int j = 1 ; j <= size ; j++) {
    		if((Math.max(Math.abs(i-n),Math.abs(j-n))+1)%2 == 1){
    			System.out.print("X ");
    		} else {
    			System.out.print("O ");
    		}
    	}
    	System.out.println();
    }
    }
    
    public void zPattern(int n) {
    	
    	for(int i = 0 ; i < n ;i++) {
    		for(int j = n-1 ; j >= 0  ;j--) {
    			if(i == j || i == 0 || i == n-1) {
    			System.out.print("*");
    			} else {
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    
    public void spiral(int n) {
        int size = n*2-1;
        
        for(int i = 1 ; i <= size ;i++) {
        	for(int j = 1 ; j <= size ;j++) {
        		System.out.print(Math.max(Math.abs(i-n),Math.abs(j-n))+1+" ");
        	}
        	System.out.println();
        }
    }
    
    public String lookAndSay(int n) {
    	
    	if (n<=0) {
    		return null;
    	}
    	
    	String result = "1";
    	int i = 1;
    	
    	while(i<n) {
    		StringBuilder sb = new StringBuilder();
    		int count = 1;
    		for(int j = 1 ; j < result.length() ; j++) {
    			if(result.charAt(j)==result.charAt(j-1)) {
    				count++;
    			}
    			else {
    				sb.append(count);
    				sb.append(result.charAt(j-1));
    				count = 1;
    			}
    		}
    		sb.append(count);
    		sb.append(result.charAt(result.length()-1));
    		result = sb.toString();
    		i++;
    		
    	}
    	return result;
    }
    
    
    
    public void oddLength(String input) {
    	
    int length = input.length();
    
    for(int i = 0 ; i < length ; i++) {
    	int j = length - i -1;
    	for(int k = 0 ; k < length ; k++) {
    		if(k==i || k==j) {
    			System.out.print(input.charAt(k));
    		}
    	}
    	System.out.println();
    }
    }
    
 public void spiralNumber(int n) {
      int row = 0 ; 
      int column = 0;
      int boundary = n-1;
      int sizeLeft = n -1;
      int flag = 1;
      
      char move = 'r';
      int[][] matrix = new int[n][n];
      
      for(int i = 1 ; i < n*n	+1 ; i++) {
    	  matrix[row][column] = i;
    	  
    	  switch(move) {
    	  case 'r' :
    		  column += 1;
    		  break;
    	  
    	  case 'l' :
    		  column -= 1;
    		  break;
    	  
    	  case 'u' :
    		  row -= 1;
    		  break;
    	
    	  case 'd' :
    		  row += 1;
    		  break;
    	  }
    	  
    	  if(i==boundary) {
    		  boundary = boundary + sizeLeft;
    		  
    		  if(flag!=2) {
    			  flag =2;
    		  }
    			  else {
    				  flag = 1;
    				  sizeLeft -=1;
    			  }
    		  
    		  switch(move) {
    		  case 'r':
    			  move = 'd';
    			  break;
    		  case 'd' :
    			  move = 'l';
    			  break;
    		  case 'l' :
    			  move = 'u';
    			  break;
    		  case 'u' :
    			  move = 'r';
    			  break;
    		  }
    	  }
      }
      
      for(row = 0 ; row < n ; row++) {
    	  for(column = 0 ; column < n ;column++) {
    		  int m = matrix[row][column];
    		  
    		  if(m < 10) {
    			  System.out.print(m+" ");
    		  }
    		  else {
    			  System.out.print(m+" ");
    		  }
    	  }
    	  System.out.println();
      }
      
      
 }
    
	/*
	 * public void alpha(String input) { int length = input.length();
	 * 
	 * List<Character> list = new ArrayList<>(); for(int i = length-1; i >=0 ; i--)
	 * { if(input.charAt(i)=='@') { list.add(i, input.charAt(i)); } else {
	 * list.add(input.charAt(i)); } } String reverse =""; for(Character letter :
	 * list) { reverse += letter; } System.out.println(reverse); }
	 */
}

