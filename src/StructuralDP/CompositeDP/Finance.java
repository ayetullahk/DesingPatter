package StructuralDP.CompositeDP;

import java.util.Arrays;
import java.util.List;

public class Finance extends Department{
    @Override
    String getName() {
        return "Finance";
    }

    @Override
    List<String> getEmployees() {
        return Arrays.asList("f1","f2");
    }
}
