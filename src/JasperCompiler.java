import net.sf.jasperreports.engine.JasperCompileManager;

public class JasperCompiler {
    public static void main(String[] args) {
        try {
            String inputFile = "input/LocVsEntryVsYearXls.jrxml";
            String outputFile = "output/LocVsEntryVsYearXls.jasper";

            System.out.println("Starting compilation of JRXML to Jasper 6.0.0...");
            long start = System.currentTimeMillis();

            JasperCompileManager.compileReportToFile(inputFile, outputFile);

            long end = System.currentTimeMillis();
            System.out.println("Compilation successful!");
            System.out.println("Output file: " + outputFile);
            System.out.println("Compilation time: " + (end - start) + "ms");
        } catch (Exception e) {
            System.err.println("Error compiling report: " + e.getMessage());
            e.printStackTrace();
        }
    }
}