#ifndef POSITION_H
#define POSITION_H

#include <string>
#include <vector>

class Employee;

class Position {
private:
    int positionID;
    std::string title;
    double salary;
    std::string responsibilities;
    std::string requirements;
    std::vector<Employee*> employees;

public:
    Position(int id, const std::string& title, double salary);
    std::string getPositionInfo() const;
};

#endif
