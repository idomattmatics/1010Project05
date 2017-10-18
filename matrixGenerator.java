
public class matrixGenerator {

	public static int count = 0;

	/***
	 * setCount sets the value of the variable count
	 * @param int a - integer
	 * @return int count
	 */public static void setCount(int a){
		 count = a;
	 }
	 /***
	  * getCount returns the variable count
	  * @param 
	  * @return int count
	  */public static int getCount(){
		  return count;
	  }

	  /***
	   * letter method creates the matrix to the user specified size and populates the array with alphabet characters
	   * @param
	   * @return a random lowercase letter of the alphabet
	   */public char letter(){
		   int index = (int)(Math.random() * 25);
		   String alphabet = "abcdefghijklmnopqrstuvwxyz";
		   return alphabet.charAt(index);
	   }
	   /***
	    * checkUp checks for the continuation of a word through the matrix straight up from a starting location
	    * @param string, char[][] array, int, int
	    * @return boolean - true/false the word continues for the entire length of the word
	    */public boolean checkUp(String word, char[][] matrix, int a, int b){
	    	int i = 0;
	    	while (a >= 0 && i < word.length() && matrix[a][b] == word.charAt(i) ){ 
	    		i++;
	    		a--;
	    	}
	    	return(i == word.length());
	    }
	    /***
	     * checkDown checks for the continuation of a word through the matrix straight down from a starting location
	     * @param string, char[][] array, int, int
	     * @return boolean - true/false the word continues for the entire length of the word
	     */public boolean checkDown(String word, char[][] matrix, int a, int b){
	    	 int i = 0;
	    	 while ( a < matrix.length  && i < word.length() && matrix[a][b] == word.charAt(i)){ 
	    		 i++;
	    		 a++;
	    	 }
	    	 return(i == word.length());
	     }
	     /***
	      * checkLeft checks for the continuation of a word through the matrix straight left from a starting location
	      * @param string, char[][] array, int, int
	      * @return boolean - true/false the word continues for the entire length of the word
	      */public boolean checkLeft(String word, char[][] matrix, int a, int b){
	    	  int i = 0;
	    	  while (b >= 0  && i < word.length() && matrix[a][b] == word.charAt(i)){ 
	    		  i++;
	    		  b--;
	    	  }
	    	  return(i == word.length());
	      }
	      /***
	       * checkRight checks for the continuation of a word through the matrix straight right from a starting location
	       * @param string, char[][] array, int, int
	       * @return boolean - true/false the word continues for the entire length of the word
	       */public boolean checkRight(String word, char[][] matrix, int a, int b){
	    	   int i = 0;
	    	   while (b < matrix.length  && i < word.length() && matrix[a][b] == word.charAt(i)){ 
	    		   i++;
	    		   b++;
	    	   }
	    	   return(i == word.length());
	       }
	       /***
	        * checkDiagUpLeft checks for the continuation of a word through the matrix diagonally up and left from a starting location
	        * @param string, char[][] array, int, int
	        * @return boolean - true/false the word continues for the entire length of the word
	        */public boolean checkDiagUpLeft(String word, char[][] matrix, int a, int b){
	        	int i = 0;
	        	while (a >= 0 && b >= 0  && i < word.length() && matrix[a][b] == word.charAt(i)){ 
	        		i++;
	        		a--;
	        		b--;
	        	}
	        	return(i == word.length());
	        }
	        /***
	         * checkDiagUpRight checks for the continuation of a word through the matrix diagonally up and right from a starting location
	         * @param string, char[][] array, int, int
	         * @return boolean - true/false the word continues for the entire length of the word
	         */public boolean checkDiagUpRight(String word, char[][] matrix, int a, int b){
	        	 int i = 0;
	        	 while (a >= 0 && b < matrix.length && i < word.length() && matrix[a][b] == word.charAt(i)){ 
	        		 i++;
	        		 a--;
	        		 b++;
	        	 }
	        	 return(i == word.length());
	         }
	         /***
	          * checkDiagDownLeft checks for the continuation of a word through the matrix diagonally down and left from a starting location
	          * @param string, char[][] array, int, int
	          * @return boolean - true/false the word continues for the entire length of the word
	          */public boolean checkDiagDownLeft(String word, char[][] matrix, int a, int b){
	        	  int i = 0;
	        	  while (a < matrix.length && b >= 0  && i < word.length() && matrix[a][b] == word.charAt(i)){ 
	        		  i++;
	        		  a++;
	        		  b--;
	        	  }
	        	  return(i == word.length());
	          }
	          /***
	           * checkDiagDownLeft checks for the continuation of a word through the matrix diagonally down and right from a starting location
	           * @param string, char[][] array, int, int
	           * @return boolean - true/false the word continues for the entire length of the word
	           */public boolean checkDiagDownRight(String word, char[][] matrix, int a, int b){
	        	   int i = 0;
	        	   while (a < matrix.length && b < matrix.length  && i < word.length() && matrix[a][b] == word.charAt(i)){ 
	        		   i++;
	        		   a++;
	        		   b++;
	        	   }
	        	   return(i == word.length());
	           }

	           /***
	            * capitalizeUp capitalizes the characters through the matrix in the direction specified
	            * @param string, char[][] array, int, int
	            * @return char[][] array - matrix - with the desired capitalized characters
	            */public char[][] capitalizeUp(String word, char[][] matrix, int a, int b){
	            	int i = 0;
	            	while (i < word.length()){
	            		matrix[a][b] = Character.toUpperCase(word.charAt(i));
	            		i++;
	            		a--; 
	            	}
	            	return matrix;
	            }
	            /***
	             * capitalizeDown capitalizes the characters through the matrix in the direction specified
	             * @param string, char[][] array, int, int
	             * @return char[][] array - matrix - with the desired capitalized characters
	             */public char[][] capitalizeDown(String word, char[][] matrix, int a, int b){
	            	 int i = 0;
	            	 while (i < word.length()){
	            		 matrix[a][b] = Character.toUpperCase(word.charAt(i));
	            		 i++;
	            		 a++; 
	            	 }
	            	 return matrix;
	             }
	             /***
	              * capitalizeLeft capitalizes the characters through the matrix in the direction specified
	              * @param string, char[][] array, int, int
	              * @return char[][] array - matrix - with the desired capitalized characters
	              */public char[][] capitalizeLeft(String word, char[][] matrix, int a, int b){
	            	  int i = 0;
	            	  while (i < word.length()){
	            		  matrix[a][b] = Character.toUpperCase(word.charAt(i));
	            		  i++;
	            		  b--; 
	            	  }
	            	  return matrix;
	              }
	              /***
	               * capitalizeRight capitalizes the characters through the matrix in the direction specified
	               * @param string, char[][] array, int, int
	               * @return char[][] array - matrix - with the desired capitalized characters
	               */public char[][] capitalizeRight(String word, char[][] matrix, int a, int b){
	            	   int i = 0;
	            	   while (i < word.length()){
	            		   matrix[a][b] = Character.toUpperCase(word.charAt(i));
	            		   i++;
	            		   b++; 
	            	   }
	            	   return matrix;
	               }
	               /***
	                * capitalizeUpLeft capitalizes the characters through the matrix in the direction specified
	                * @param string, char[][] array, int, int
	                * @return char[][] array - matrix - with the desired capitalized characters
	                */public char[][] capitalizeUpLeft(String word, char[][] matrix, int a, int b){
	                	int i = 0;
	                	while (i < word.length()){
	                		matrix[a][b] = Character.toUpperCase(word.charAt(i));
	                		i++;
	                		a--;
	                		b--; 
	                	}
	                	return matrix;
	                }
	                /***
	                 * capitalizeUpRight capitalizes the characters through the matrix in the direction specified
	                 * @param string, char[][] array, int, int
	                 * @return char[][] array - matrix - with the desired capitalized characters
	                 */public char[][] capitalizeUpRight(String word, char[][] matrix, int a, int b){
	                	 int i = 0;
	                	 while (i < word.length()){
	                		 matrix[a][b] = Character.toUpperCase(word.charAt(i));
	                		 i++;
	                		 a--;
	                		 b++; 
	                	 }
	                	 return matrix;
	                 }
	                 /***
	                  * capitalizeDownLeft capitalizes the characters through the matrix in the direction specified
	                  * @param string, char[][] array, int, int
	                  * @return char[][] array - matrix - with the desired capitalized characters
	                  */public char[][] capitalizeDownLeft(String word, char[][] matrix, int a, int b){
	                	  int i = 0;
	                	  while (i < word.length()){
	                		  matrix[a][b] = Character.toUpperCase(word.charAt(i));
	                		  i++;
	                		  a++;
	                		  b--; 
	                	  }
	                	  return matrix;
	                  }
	                  /***
	                   * capitalizeDownRight capitalizes the characters through the matrix in the direction specified
	                   * @param string, char[][] array, int, int
	                   * @return char[][] array - matrix - with the desired capitalized characters
	                   */public char[][] capitalizeDownRight(String word, char[][] matrix, int a, int b){
	                	   int i = 0;
	                	   while (i < word.length()){
	                		   matrix[a][b] = Character.toUpperCase(word.charAt(i));
	                		   i++;
	                		   a++;
	                		   b++; 
	                	   }
	                	   return matrix;
	                   }
	                   /***
	                    * searchMatrix searches the matrix array for specified word and returns the matrix with occurrences of that word capitalized
	                    * @param string, char[][] array
	                    * @return char[][] array - matrix - with the occurrences of the desired word capitalized 
	                    */public char[][] searchMatrix(String word, char[][] matrix){
	                    	for (int i = 0; i < matrix.length; i++){
	                    		for (int j = 0; j < matrix.length; j++){
	                    			if (matrix[i][j] == word.charAt(0)){//every occurrence of the first character of the word detected the subsequent character is check for adjacently in the array
	                    				if (this.checkUp(word, matrix, i, j) == true){
	                    					this.capitalizeUp(word, matrix, i, j);
	                    					count++;//if the entire word is found in the sweep it is capitalized and count variable is incremented
	                    				}
	                    				if (this.checkDown(word, matrix, i, j) == true){
	                    					this.capitalizeDown(word, matrix, i, j);
	                    					count++;
	                    				}

	                    				if (this.checkLeft(word, matrix, i, j) == true){
	                    					this.capitalizeLeft(word, matrix, i, j);
	                    					count++;
	                    				}

	                    				if (this.checkRight(word, matrix, i, j) == true){
	                    					this.capitalizeRight(word, matrix, i, j);
	                    					count++;
	                    				}

	                    				if (this.checkDiagUpLeft(word, matrix, i, j) == true){
	                    					this.capitalizeUpLeft(word, matrix, i, j);
	                    					count++;
	                    				}
	                    				if (this.checkDiagUpRight(word, matrix, i, j) == true){
	                    					this.capitalizeUpRight(word, matrix, i, j);
	                    					count++;
	                    				}
	                    				if (this.checkDiagDownLeft(word, matrix, i, j) == true){
	                    					this.capitalizeDownLeft(word, matrix, i, j);
	                    					count++;
	                    				}
	                    				if (this.checkDiagDownRight(word, matrix, i, j) == true){
	                    					this.capitalizeDownRight(word, matrix, i, j);
	                    					count++;
	                    				}
	                    			}
	                    		}
	                    	}
	                    	return matrix;

	                    }
}


