#include "Position.h"

Position::Position(int id, const std::string& title, double salary) 
    : positionID(id), title(title), salary(salary) {}

std::string Position::getPositionInfo() const {
    return title + " - Salary: " + std::to_string(salary);
}
