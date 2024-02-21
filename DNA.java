public class DNA {
 
  public static void main(String[] args) {
 
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";

    proteinFinder(dna1);
    proteinFinder(dna2);
    proteinFinder(dna3);

  }

  public static void proteinFinder(String dna){

    System.out.println("DNA sample: " + dna);
    int dna_length = dna.length();
    
    System.out.println("- Length: " + dna_length);

    // Find index of ATG codon:
    int startInt = dna.indexOf("ATG");
    int endInt = dna.indexOf("TGA");
    int proteinLength = endInt - startInt;

    // Find Protein:
    if (startInt != -1 && endInt != -1 && proteinLength % 3 == 0){
      String protein = dna.substring(startInt, (startInt + 3));
      System.out.println("- Protein: " + protein + "\n");
    } else {
      System.out.println("- No Protein Found \n");
    }
  }

}