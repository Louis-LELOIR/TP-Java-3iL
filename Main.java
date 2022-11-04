class Main {
  public static void main(String[] args) {
    /*
    int stopRow = 9;
    char[][] americanFlag = new char [15][50];

    for(int i = 0 ; i < 15 ; i ++) {
      for(int j = 0; j < 50; j++) {
        if (j <= 5 && i < 9 ){
          
        }
        if (j <= 5) {
          americanFlag[i][j] = '*';
        } else {
          americanFlag[i][j] = '=';
        }
      }
    }

    //System.out.println(americanFLag);
    for(int i = 0 ; i < 15 ; i ++) {
      for(int j = 0; j < 50; j++) {
        System.out.print(americanFlag[i][j]);
      }
    }
    */
    for (int i = 0; i <= (15); i++) {
      if (i <=9 ) {
        i % 2 ? System.out.print('*') : System.out.print('=');
      }
      System.out.print('=');
    }
  }
}