package com.softserve.edu10.practicalTask;

import static com.softserve.edu10.practicalTask.EmployeeMap.*;

/**
 * In the main() method, initialize a map named employeeMap consisting of pairs
 * <Integer, String>.
 */
public class Main {
    public static void main(String[] args) {
        //Populate the employeeMap with seven pairs (ID, name) of individuals. Display the
        //contents of the map on the screen.
        populateEmployeeMap();
        displayEmployeeMap();


        //Prompt the user to enter an ID. Find the corresponding name in the employeeMap and
        //display it. If the ID is not found in the map, notify the user using the containsKey()
        //function.
        findNameById();

        //Prompt the user to enter a name. Verify that the name exists in the employeeMap and
        //display the corresponding ID. If the name is not found in the map, notify the user using
        //the containsValue() function.
        findIdByName();

        //To enable the editing of existing data, such as name, position, and salary, the user should be
        //prompted to input the ID of the record they wish to modify, as well as the updated data. The
        //updated map should then be displayed.
        updateEmployeeData();
        displayEmployeeMap();

        //For improved usability, the map should be sortable by various criteria, such as ID, name, and
        //position. The user should be prompted to enter the desired sorting criterion, and the sorted
        //map should then be displayed on the screen.
        sortingEmployees();
        displayEmployeeMap();
    }
}