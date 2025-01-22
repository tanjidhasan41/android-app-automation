package setup;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SeriesDataSet {

    @DataProvider(name = "SeriesData")
    public Object[][] getDataSet() throws IOException {

        String filePath = "./src/test/resources/data.csv";
        CSVParser csvParser = new CSVParser(new FileReader(filePath), CSVFormat.DEFAULT.withFirstRecordAsHeader());

        List<Object> data = new ArrayList<>();
        for (CSVRecord csvRecord: csvParser) {

            String expression = csvRecord.get("expression");
            String expectedResultString = csvRecord.get("expectedResult");

            double expectedResult = Double.parseDouble(expectedResultString);
            data.add(new Object[]{expression,expectedResult});

        }
        return data.toArray(new Object[0][]);

    }

}
