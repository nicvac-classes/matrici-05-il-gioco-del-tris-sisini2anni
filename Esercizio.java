//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {

    //Input da tastiera
    static Scanner input = new Scanner(System.in);
    
    //Inserisce il simbolo x oppure o nella grigla di gioco in riga i e colonna j.
    //Se la mossa non è valida (pedina già presente o le coordinate sono fuori la griglia) allora ritorno falso.
    static boolean inserisciInGriglia( /*scrivere qui i parametri richiesti dall'esercizio*/ ) {
         boolean mossaCorretta = false;
    //controllo se le coordinate possono essere accettate.
    //Il giocatore usa le coordinate come [1..3]. Nella matrice usiamo [0..2]
    // quindi sistemo le coordinate
    i = i-1;
    j = j-1;
    boolean coordinateCorrette = ( 0<=i && i<=2 && 0<=j && j<=2 ) ;
    //controllo se la casella è disponibile
    if (coordinateCorrette ) {
        if ( G[i][j].equals("-") ) {
            mossaCorretta = true;
        }
    }  
    //Piazzo la pedina se la mossa è consentita
    if (mossaCorretta) {
        G[i][j] = s;
    }
    
    return mossaCorretta;  
}
    }

    //Azzero la griglia di gioco inserendo la stringa "-" in tutte le celle.
    
        static void azzeraGriglia(String[][] G, int righe, int colonne) {
        for (int i=0; i<=righe-1; i=i+1) {
            for (int j=0; j<=colonne-1; j=j+1) {
                G[i][j] = "-";
            }
        } 
    }
    

    //Controlla se nella griglia c'è una vincita.
    // s può valore "O" oppure "X"
    static boolean controllaVincita(/*scrivere qui i parametri richiesti dall'esercizio*/ ) {
        boolean vince = false;
    
    if ( G[0][0].equals(s) && G[0][1].equals(s) && G[0][2].equals(s) ) {
        vince = true;
    }
   
    if ( !(vince) && G[1][0].equals(s) && G[1][1].equals(s) && G[1][2].equals(s) ) {
        vince = true;
    }
    
    if ( !(vince) && G[2][0].equals(s) && G[2][1].equals(s) && G[2][2].equals(s) ) {
        vince = true;
    }
    
    if ( !(vince) && G[0][0].equals(s) && G[1][0].equals(s) && G[2][0].equals(s) ) {
        vince = true;
    }
    
    if ( !(vince) && G[0][1].equals(s) && G[1][1].equals(s) && G[2][1].equals(s) ) {
        vince = true;
    }
   
    if ( !(vince) && G[0][2].equals(s) && G[1][2].equals(s) && G[2][2].equals(s) ) {
        vince = true;
    }
  
    if ( !(vince) && G[0][0].equals(s) && G[1][1].equals(s) && G[2][2].equals(s) ) {
        vince = true;
    }
  
    if ( !(vince) && G[0][2].equals(s) && G[1][1].equals(s) && G[2][0].equals(s) ) {
        vince = true;
    }
    return vince;
}
    

    //Conta quante caselle libere ci sono ancora.
    //Se non ci sono caselle libere e non si è vinto allora è un pareggio
   
        static int contaCaselleLibere(String[][] G) {
    int count=0;
    for (int i=0; i<=2; i=i+1) {
        for (int j=0; j<=2; j=j+1) {
            if ( G[i][j].equals("-") ) {
                count = count + 1;
            }
        }
    } 
    return count;
}
    }


    public static void main(String args[]) {
   
    String[][] griglia = new String[3][3];
    azzeraGriglia(griglia,3,3);
    
    
    System.out.println("Griglia di gioco:");
    UtilsMatrice.visualizza(griglia);
} 
    
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md