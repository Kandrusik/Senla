package eu.senla.task1;

public class Main {

    static byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;

    static Byte aByte;
    static Short bShort;
    static Integer cInteger;
    static Long dLong;
    static Float eFloat;
    static Double fDouble;
    static Character gCharacter;
    static Boolean hBoolean;

    static String kString;

    public static void main(String[] args) {

        Process process = new Process();
        process.setA((byte)10);
        System.out.println(process.getA());
        int g = 260;
        float h = 23;
        byte j = (byte) g;
        float k = (float) g;
        boolean b = false;

        System.out.println("preobrazovanie int v byte " + j);
        System.out.println("preobrazovanie int v float " + k);

        process.setaByte((byte) 13);
        System.out.println("vivod aByte " + process.getaByte());
        double du = (double)process.getaByte();
        System.out.println("preobrazobanie aByte v double " + du);
        String sa = String.valueOf(du);
        System.out.println("preorazovanie aByte v String " + sa);
        float fd = (float)process.getaByte();
        System.out.println("preobrazovanie aByte v float " + fd);

        process.setB((short)125);
        System.out.println("vivod short " + process.getB());
        byte gh = (byte) process.getB();
        System.out.println("preobrazovanie short v byte " + gh);
        long lll = (long)process.getB();
        System.out.println("preobrazovanie short v long " + lll);

        process.setbShort((short) 32767);
        System.out.println("vivod bShort " + process.getbShort());
        float fo = (float) process.getbShort();
        System.out.println("preobrazovanie bShort v float " + fo);
        String bs = String.valueOf(process.getbShort());
        System.out.println("preobrazovanie bShort v string " + bs);
        Integer iit = (int)process.getbShort();
        System.out.println("preobrazovanie bShort v Integer " + iit);

        process.setC((int)23);
        System.out.println("vivod int " + process.getC());
        String za = String.valueOf(process.getC());
        System.out.println("preobrazovanie int v string " + za);
        byte bbg = (byte)process.getC();
        System.out.println("preobrazovanie int v byte " + bbg);
        double dds = (double)process.getB();
        System.out.println("preobrazovanie int v double " + dds);

        process.setcInteger((int) 257);
        System.out.println("vivod cInteger " + process.getcInteger());
        String sis = String.valueOf(process.getcInteger());
        System.out.println("preobrazovanie cInteger v String " + sis);
        float ffr = (float)process.getcInteger();
        System.out.println("preobrazovanie cInteger v float " + ffr);

        process.setD((long) 43482341);
        System.out.println("vivod long " + process.getD());
        double pp = (double) process.getD();
        System.out.println("preobrazovanie long v double " + pp);
        int iir = (int)process.getD();
        System.out.println("preobrazovanie long v int " + iir);

        process.setdLong((long)766);
        System.out.println("vivod dLong " + process.getdLong());
        double kkl = (double)process.getdLong();
        System.out.println("preobrazobanie dLong v double " + kkl);
        /// Double kko = Double.parseDouble(process.getdLong());
        /// Integer poi = Integer.parseInt(process.getdLong());
        String rre = String.valueOf(process.getdLong());
        System.out.println("preobrazovanie dLong c String " + rre);

        process.setE((float) 13.08);
        System.out.println("vivod float " + process.getE());
        String rr = String.valueOf(process.getE());
        System.out.println("preobrazovanie float v string " + rr);
        double io = ((double) process.getE());
        System.out.println("preobrazovanie float v double " + io);

        process.seteFloat((float)113.32f);
        System.out.println("vivod eFloat " + process.geteFloat());
        double qqw = (double)process.geteFloat();
        System.out.println("preobrazovanie eFloat v double " + qqw);
        Double llr = Double.valueOf(process.geteFloat());
        System.out.println("preobrazovanie eFloat v Double " + llr);

        process.setF((double) 3.14159);
        System.out.println("vivod double " + process.getF());
        double yy = process.getF() + h;
        System.out.println("vivod summi double i float " + yy);
        String ys = String.valueOf(process.getF());
        System.out.println("preobrazovanie double v string " + ys);
        long iiu = (long)process.getF();
        System.out.println("preobrazovanie double v long " + iiu);
        byte rrw = (byte)process.getF();
        System.out.println("preobrazovanie double v byte " + rrw);

        process.setfDouble((double) 321.23f);
        System.out.println("vivod fDouble " + process.getfDouble());
        // Long uy = (long)process.getfDouble(); // Inconvertible types; cannot cast 'java.lang.Double' to 'long' почему ?
        String ttr = String.valueOf(process.getfDouble());
        System.out.println("preobrazovanie fDouble v String " + ttr);

        process.setG((char) 'А');
        System.out.println("vivod shar " + process.getG());
        String gf = String.valueOf(process.getG());
        System.out.println("preobrazovanie char v string " + gf);
        byte bi = (byte) process.getG();
        System.out.println("preobrazovanie char v byte " + bi);

        process.setH((boolean) true);
        System.out.println("vivod boolean " + process.gethBoolean());
        String az = String.valueOf(process.getE() == process.getF());
        System.out.println("sravnenie getE i getF" + az);
    }

}