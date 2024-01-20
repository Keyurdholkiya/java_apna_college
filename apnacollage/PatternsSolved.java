package problemsolve;

import java.util.Scanner;

public class PatternsSolved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        for (int i =  0 ; i<5; i++){
            for (int j = 2*(5-i); j>0 ; j--){
                System.out.print(" ");
            }
            for (int k = 0 ; k < i ; k++){
                System.out.print(" "+" "+"*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        for (int i =  0 ; i<5; i++){
            for (int j = 0; j<i ; j++){
                System.out.print(" "+"*"+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        for (int i =  0 ; i<5; i++){
            for (int j = 5; j>i ; j--){
                System.out.print(" "+"*"+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        for (int i =  0 ; i<5; i++){
            for (int j = 0; j<3  ; j++){
                System.out.print(" "+"*"+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        for (int i =  1 ; i<5; i++){
//            System.out.println("--------------");
            for (int j = 2*(5-i); j>0; j--){
                System.out.print(" ");
            }
            for (int k = 0;k < i ; k++){
                System.out.print(" "+"*");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        int n  = 4;
        int st = 5;
        for(int i = 1 ; i<=n;i++){
            for (int j = 1 ; j<=st ; j++){
                if (i == 1 || j == 1 || i == n ||j == 5){
                    System.out.print("*"+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        int l = 5;
        int star = 5;
        for (int i = 0;i<l;i++){
            for (int j = 0; j<star ; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        int line = 4;
        int start = 1;
        int space = 3;
        while (line > 0){
            //print spec
            for (int j = space ; j > 0 ;j-- ){
                System.out.print(" ");
            }
            //System.out.print(" ");
            //print start
            for (int i = 0 ; i<start ; i++){
                System.out.print("*");
                //System.out.print("*"+" ");
            }
            System.out.println();
            //calculate
            space--;
            start++;
            line--;
        }
        System.out.println("------------------------------------------");
        int lines = 5;
        int number = 5;
        int sp = 1;
        while (lines > 0){
            //print number
            for (int i = 1 ; i<=number ; i++){
                System.out.print(i);
            }
            //print spec
            for (int j = 1 ;j<=sp ; j++){
                System.out.print(" ");
            }
            System.out.println();
            //calculate
            number--;
            sp++;
            lines--;
        }
        System.out.println("------------------------------------------");
        int li = 5;
        int numbers = 1;
        int spaces = 4;
        int showing = 1;
        while (li>0){
            //print number
            for (int i = 1 ; i <= numbers ; i++){
                System.out.print(showing);
                showing++;
            }
            //print spaces
            for (int j = 1 ; j <spaces ; j++ ){
                System.out.print(" ");
            }
            System.out.println();
            //calculation
            numbers++;
            spaces--;
            li--;
        }
        System.out.println("------------------------------------------");
        int nu = 5;
        for (int i=1; i <= nu; i++){
            for (int j = 1; j <=i ;j++){
                System.out.print((i+j-1)%2);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        int le = 6;
        int sc = 5;
        int secondSc = 1;
        int secondStart = 5;
        while (le > 0){
            //print spec
            for (int i = 1 ; i <=sc;i++){
                System.out.print(" ");
            }
            //print start
            for (int j = 1; j <=secondStart;j++){
                System.out.print("*");
            }
            //print spec
            for (int k = 1;k<=secondSc;k++){
                System.out.print(" ");
            }
            System.out.println();
            //calculation
            sc--;
            le--;
            secondSc++;
        }
        System.out.println("------------------------------------------");
        int lie = 5;
        int nud = 1;
        int spe = 4;
        while (lie > 0){
            //print spec
            for (int i = 1 ; i <= spe ; i++){
                System.out.print(" ");
            }
            //print number
            for (int j = 1 ; j <= nud ; j++){
                System.out.print(nud+" ");
            }
            //print spec
            for (int k = 1 ; k <= spe ; k++){
                System.out.print(" ");
            }
            System.out.println();
            //calculation
            spe--;
            nud++;
            lie--;
        }
        System.out.println("------------------------------------------");
        int lew = 5;
        int spew = 4;
        int nuw = 1;
        while (lew > 0){
            //print spec
            for (int i = 1 ; i <= spew ; i++){
                System.out.print(" ");
            }
            //print number
            for (int j = 1 ; j <= nuw ; j++){
                System.out.print(nuw);
            }
            //print spec
//            for (int i = 1 ; i <= spew ; i++){
//                System.out.print(" ");
//            }
            System.out.println();
            //calculation
            lew--;
            spew--;
            nuw = nuw + 2;
        }
        System.out.println("------------------------------------------");
        int k = 5;
        for (int i = 1; i <= k ; i++){
            for (int j = 1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            for (int h = 1 ; h <= k ; h++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------------");
        int le = 6;
        int sc = 5;
        int secondSc = 1;
        int secondStart = 5;
        while (le > 0){
            //print spec
            for (int i = 1 ; i <=sc;i++){
                System.out.print(" ");
            }
            //print start
            for (int j = 1; j <=secondStart;j++){
                System.out.print("*");
            }
            //print spec
            for (int j = 1;j<=secondSc;j++){
                System.out.print(" ");
            }
            System.out.println();
            //calculation
            sc--;
            le--;
            secondSc++;
        }
        System.out.println("------------------------------------------");
        int ler = 5;
        for (int i = 1 ; i <=ler; i++){
            for (int j = 1 ; j <=ler-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <=ler; j++){
                if ( j == 1 || j == 5 || i == 1 || i ==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println("------------------------------------------");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int lines = 1;
        int st = 1;
        int spe = 2*d-2;
        while (lines <= 2*d) {
            for (int j = 1; j <= spe; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*" + " ");
            }
            if (lines < d) {
                st++;
                spe--;
            }else {
                st--;
                spe++;
            }
            System.out.println();
            lines++;


        }

        System.out.println("------------------------------------------");
        int line =sc.nextInt();
        int lineStart = 1;
        int star = 1;
        int spec  = 2*line-2 ;
        while (lineStart <= 2*line){
            //print star
            for (int i = 1 ; i <= star ; i++){
                System.out.print("*");
            }
            //print spec
            for (int j = 1 ; j <= spec ; j++){
                System.out.print(" ");
            }
            //print star
            for (int i = 1 ; i <= star ; i++){
                System.out.print("*");
            }
            //calculation
            if (lineStart < line) {
                star++;
                spec -= 2;
            } else if (lineStart > line) {
                star--;
                spec+=2;
            }
            System.out.println();
            lineStart++;
        }

         */
        System.out.println("------------------------------------------");
        int n = 3;
        int star = 3;
        int space =n-1;
        int midSpace =n+2;
        int startLine = 1;
        while (startLine<=n){
         //print space
            for (int i = 0;i<space;i++){
                System.out.print("  ");
            }
         //print star
            for (int i= 0 ; i<star;i++){
                System.out.print("*"+" ");
            }
         //print space
            for (int i = 0; i <midSpace;i++){
                System.out.print("  ");
            }
         //print star
            for (int i= 0 ; i<star;i++){
                System.out.print("*"+" ");
            }
         //preparation
            System.out.println();
            star+=2;
            midSpace-=2;
            startLine++;
            space--;
        }
        int m = 8;
        int secondStar = 15;
        int spec = 0;
        int start= 1;
        while (start<=m){
            //print space
            for (int i = 0 ; i<spec;i++){
                System.out.print("  ");
            }
            //print star
            for (int i = 0; i <secondStar;i++){
                System.out.print("*"+" ");
            }
            //preparation
            System.out.println();
            spec++;
            secondStar-=2;
            start++;
        }


        System.out.println("------------------------------------------");
        int line = 3;
        int spaces = line;
        int startLines = 1;
        while (startLines<=line) {
            //print star
            System.out.print("*");
            //print space
            for (int i = 0 ; i < spaces ; i++){
                System.out.print(" ");
            }
            //last star
            System.out.print("*");
            //preparation
            System.out.println();
            startLines++;
            spaces--;
        }
        int lineNum = 4;
        int spacess = 0;
        int lineStar = 1;
        while (lineStar <= lineNum ){
            //print star
            System.out.print("*");
            //print space
            for (int i = 0; i <spacess ; i++){
                System.out.print(" ");
            }
            //print last star
            System.out.print("*");
            //preparation
            System.out.println();
            lineStar++;
            spacess++;
        }
        System.out.println("------------------------------------------");
        int li  = sc.nextInt();
        int st = 1;
        int se = li+1;
        int str = li+2;
        while (st <= 2*li+1){
            if (st == 1 || st == 4  || st == 7){
                for (int i = 0; i<str;i++){
                    System.out.print("*");
                }
            }
            for (int i  = 0 ; i  < 1 ; i++){
                System.out.print("*");
            }

            for (int i = 0 ; i < se ; i++){
                System.out.print(" ");
            }
            System.out.println();
            st++;
        }

        System.out.println("------------------------------------------");
        int lines = sc.nextInt();
        int spacee = lines+1;
        int secondSpace = 0 ;
        int stars = line-2;
        int startLinea = 1;
        while (startLinea <=  lines ){
            //print space
            for (int i = 0;i<secondSpace;i++){
                System.out.print(" ");
            }
            //print star
            for (int i = 0 ; i <stars ; i++ ){
                System.out.print("*");
            }
            //print space
            for (int i = 0 ; i<spacee ; i++){
                System.out.print(" ");
            }
            //print star
            for (int i = 0 ; i <stars ; i++ ){
                System.out.print("*");
            }
            System.out.println();
            spacee-=2;
            startLinea++;
            secondSpace++;
        }
        int ly = 4 ;
        int spe = ly-2;
        int so = 1 ;
        while (so<=ly){
            //print space
            for (int i = 0; i< spe ; i++){
                System.out.print(" ");
            }
            //print star
            System.out.print("*");
            System.out.println();
            so++;
        }



    }
}
