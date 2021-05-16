
public class Hoten {
    public static void main(String[] args) {
        String[] ketqua = hamTachten(" Nguyen Thanh Long");
        for (int i = 0; i < ketqua.length; i++) {
            System.out.println(ketqua[i]);
        }
    }

    public static String[] hamTachten(String hoten) {
        String[] returnValues = new String[3];
        int indexOffirstName = hoten.indexOf(" ");
        char ch = ' ';
        for (int i = 0; i < hoten.length(); i++) {
            if (hoten.charAt(i) == ch) {
                indexOffirstName = i;
            }
            break;
        }
        int indexOflastName = 1;
        for (int i = 0; i < hoten.length() - 1; i--) {
            if (hoten.charAt(i) == ch) {
                indexOflastName = i;
            }
            break;
        }
        System.out.println();
        System.out.println();
        String ho = "";
        String ten = "";
        String dem = "";
        for (int i = 0; i < indexOffirstName; i++) {
            ho = ho + hoten.charAt(i);
        }
        for (int i = indexOflastName; i < hoten.length(); i++) {
            ten = ten + hoten.charAt(i);
        }
        for (int i = indexOffirstName + 1; i < hoten.length(); i++) {
            dem = dem + hoten.charAt(i);
        }
        returnValues[1] = ho;
        returnValues[2] = dem;
        returnValues[3] = ten;
        return returnValues;
    }
}



