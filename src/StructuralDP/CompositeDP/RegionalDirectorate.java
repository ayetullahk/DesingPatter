package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDirectorate extends Department {
    List<Department> childDepartments;

    //childDepartmentları parametre olarak alan const
    public RegionalDirectorate(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream().map(Department::getName).
                collect(Collectors.joining(", "));
        //joining akıştaki ifadeleri birleştip string döndürür
    }

    @Override
    List<String> getEmployees() {
        return childDepartments.stream().flatMap(d->d.getEmployees().stream())
                .collect(Collectors.toList());
        //Flatmap : Stream i başka bir stream e çevirmek için kullanılır
        // bir giren değere karşılık birden fazla değer olabilir
    }
}
